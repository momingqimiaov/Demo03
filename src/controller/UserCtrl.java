package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.*;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;


@Controller
public class UserCtrl
{
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    SecurityService securityService;
    @Autowired
    User_RoleService user_roleService;
    @Autowired
    User_SecurityService user_securityService;

    @RequestMapping(value = {"/insert"})
    public ModelAndView insert()
    {
        return new ModelAndView("signup");
    }

    @RequestMapping(value = {"/checkUserIsExist"}, method = {RequestMethod.POST})
    public void checkIsExist(String name, PrintWriter out)
    {

        if (userService.checkIsExistByName(name))
        {
            out.write("Sorry,Already Exists");
        } else
        {
            out.write("(:");
        }
    }

    @RequestMapping(value = {"/submit"}, method = {RequestMethod.POST})
    public ModelAndView submit(@RequestParam(value = "name") String name, @RequestParam(value = "password1") String password)
    {
        User user = new User(name, password);
        userService.addUser(user);
        return new ModelAndView("redirect:/index");
    }

    @RequestMapping(value = {"/addUser"}, method = {RequestMethod.POST})
    public ModelAndView addUser(@RequestParam(value = "name") String userName, @RequestParam(value = "password") String password)
    {
        User user = new User(userName, password);
        userService.addUser(user);
        return new ModelAndView("redirect:/homepage/userManager");
    }

    //
    @RequestMapping(value = "/deleteuser/{id}")
    public ModelAndView deleteuser(@PathVariable(value = "id") Integer userId)
    {

        userService.deleteUserByUserId(userId);//根据用户的ID删除users表中的用户
        user_roleService.deleteUserRoleByUserId(userId);//同时删除user_role表中的用户角色信息
        user_securityService.deletUserSecurityByUserId(userId);//同时删除user_security表中的用户权限信息
        return new ModelAndView("redirect:/homepage/userManager");//重定向到userManager页面
    }

    /*更新用户请求*/
    @RequestMapping(value = {"/updateuser/{id}"})
    public ModelAndView updateuser(@PathVariable(value = "id") Integer userid, Map<String, Object> map)
    {
        map.put("user", userService.getUserById(userid));//根据用户ID，从users表中取得用户信息并返回到updateuser页面
        return new ModelAndView("updateuser");
    }

    /*提交根性用户请求*/
    @RequestMapping(value = {"/updateUserMessage/{id}"}, method = {RequestMethod.POST})
    public ModelAndView updateUserMessage(@PathVariable(value = "id") Integer userid, @RequestParam(value = "name") String name, @RequestParam(value = "password") String password)
    {
        User user = userService.getUserById(userid);
        user.setUsername(name);
        user.setPassword(password);
        userService.upDateUserById(user);//更新用户
        return new ModelAndView("redirect:/homepage/userManager");
    }

    /*分配角色*/
    @RequestMapping(value = {"/assignrole/{id}"})
    public ModelAndView assignrole(@PathVariable(value = "id") Integer id, Map<String, List<String>> assignedRoleListMap, Map<String, List<String>> tmpListMap, Map<String, Integer> idMap)
    {

        List<String> allRoleList = roleService.getAllRoleNameList();
        List<String> assignedRoleList = user_roleService.getRoleNameByUserId(id);
        List<String> tmpList = allRoleList;
        tmpList.removeAll(assignedRoleList);

        assignedRoleListMap.put("assignedRoleList", assignedRoleList);
        tmpListMap.put("unassignedRoleList", tmpList);
        idMap.put("id", id);
        return new ModelAndView("assignrole");
    }

    @RequestMapping(value = {"/assignsecurity/{id}"})
    public ModelAndView assignsecurity(@PathVariable(value = "id") Integer id, Map<String, List<String>> assignedSecurityListMap, Map<String, List<String>> tmpListMap, Map<String, Integer> idMap)
    {
        List<String> allSecurityList = securityService.getAllSecurityNameList();
        List<String> assignedSecurityList = user_securityService.getSecurityNameByUserId(id);
        List<String> tmpList = allSecurityList;
        tmpList.removeAll(assignedSecurityList);

        assignedSecurityListMap.put("assignedSecurityList", assignedSecurityList);
        tmpListMap.put("unassignedSecurityList", tmpList);
        idMap.put("id", id);

        return new ModelAndView("assignsecurity");
    }
}
