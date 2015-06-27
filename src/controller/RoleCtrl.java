package controller;

import model.Role;
import model.User;
import model.UserRoleRole;
import model.User_Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.RoleService;
import service.UserService;
import service.User_RoleService;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;


@Controller
public class RoleCtrl
{
    @Autowired
    RoleService roleService;
    @Autowired
    User_RoleService user_roleService;
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/checkRoleIsExist"}, method = {RequestMethod.POST})
    public void checkIsExist(String role, PrintWriter out)
    {
        if (roleService.checkIsExistByName(role))
        {
            out.write("Sorry,Already Exists");
        } else
        {
            out.write("(:");
        }
    }

    @RequestMapping(value = {"/addRole"}, method = {RequestMethod.POST})
    public ModelAndView addRloe(@RequestParam(value = "role") String role, @RequestParam(value = "roledescription") String roledescription)
    {
        Role role2 = new Role(role, roledescription);
        roleService.addRole(role2);

        return new ModelAndView("redirect:/homepage/roleManager");
    }


    @RequestMapping(value = "/deleterole/{id}")
    public ModelAndView deleteuser(@PathVariable(value = "id") Integer id)
    {
        Role role = roleService.getRoleById(id);
        String rolestring = role.getRolename();
        List<User> userList = userService.getAllUserList();
        for (int i = 0; i < userList.size(); i++)
        {
            String newrole = userList.get(i).getRole().replaceAll(rolestring, "");
            User user = new User(userList.get(i).getId(), userList.get(i).getUsername(), userList.get(i).getPassword(), newrole, userList.get(i).getSecurity(), userList.get(i).getAboutuser());
            userService.upDateUserById(user);
        }

        if (user_roleService.getUserRoleByRoleName(role.getRolename()) != null)
        {
            user_roleService.deleteUserByRoleName(role.getRolename());
        }

        roleService.deleteRoleById(id);

        return new ModelAndView("redirect:/homepage/roleManager");
    }

    /*更新角色信息请求，跳转到跟新角色页面*/
    @RequestMapping(value = {"/updaterole/{id}"})
    public ModelAndView updaterole(@PathVariable(value = "id") Integer roleid, Map<String, Object> map)
    {
        map.put("role", roleService.getRoleById(roleid));
        return new ModelAndView("updaterole");
    }

    @RequestMapping(value = {"/updateRoleMessage/{id}"}, method = {RequestMethod.POST})
    public ModelAndView updateRoleMessage(@PathVariable(value = "id") Integer roleid, @RequestParam(value = "role") String role, @RequestParam(value = "roledescription") String roledescription)
    {

        Role role2 = roleService.getRoleById(roleid);

        String rolestring = role2.getRolename();
        List<User> userList = userService.getAllUserList();
        for (int i = 0; i < userList.size(); i++)
        {
            String newrole = userList.get(i).getRole().replaceAll(rolestring, role);
            User user = new User(userList.get(i).getId(), userList.get(i).getUsername(), userList.get(i).getPassword(), newrole, userList.get(i).getSecurity(), userList.get(i).getAboutuser());
            userService.upDateUserById(user);
        }

        role2.setRolename(role);
        role2.setAboutrole(roledescription);
        roleService.upDateRoleById(role2);

        //更新user_role中de信息
        UserRoleRole userRoleRole = new UserRoleRole(role, roleid);
        user_roleService.upDateRoleNameByRoleId(userRoleRole);


        return new ModelAndView("redirect:/homepage/roleManager");
    }

    @RequestMapping(value = {"/RoleAssigned/{id}"}, method = {RequestMethod.POST})
    public ModelAndView assigned(@PathVariable(value = "id") int id, @RequestParam(value = "checkbox", required = false, defaultValue = "") String roles)
    {
        User user = userService.getUserById(id);

        if (!roles.equals(""))
        {
            user.setRole((user.getRole() + "," + roles).replace(",", " "));
            String[] tmp = roles.split(",");
            for (int i = 0; i < tmp.length; i++)
            {
                String role = tmp[i];
                int roleid = roleService.getIdByRoleName(role);
                User_Role user_Role = new User_Role(id, role, roleid);
                user_roleService.addUserRole(user_Role);
            }
        }
        userService.upDateUserById(user);

        return new ModelAndView("redirect:/homepage/userManager");
    }

    @RequestMapping(value = {"/removeRole/{id}"})
    public ModelAndView removeRole(@PathVariable(value = "id") Integer id, @RequestParam(value = "checkbox", required = false, defaultValue = "") String roles)
    {

        User user = userService.getUserById(id);
        if (!roles.equals(""))
        {
            String[] tmp = roles.split(",");
            for (int i = 0; i < tmp.length; i++)
            {
                String role = tmp[i];
                int roleid = roleService.getIdByRoleName(role);
                User_Role user_Role = new User_Role(id, role, roleid);
                user_roleService.deleteUserRole(user_Role);
                String newrole = user.getRole().replace(role, "");
                User user2 = new User(id, user.getUsername(), user.getPassword(), newrole, user.getSecurity(), user.getAboutuser());
                userService.upDateUserById(user2);
            }
        }

        return new ModelAndView("redirect:/homepage/userManager");
    }
}
