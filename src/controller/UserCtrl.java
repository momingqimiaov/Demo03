package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.*;


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

    //    @RequestMapping(value = {"/insert"})
//    public ModelAndView insert()
//    {
//        return new ModelAndView("signup");
//    }
//
//    @RequestMapping(value = {"/checkUserIsExist"}, method = {RequestMethod.POST})
//    public void checkIsExist(String name, PrintWriter out)
//    {
//
//        if (userService.checkIsExistByName(name))
//        {
//            out.write("Sorry,Already Exists");
//        } else
//        {
//            out.write("(:");
//        }
//    }
//
//    @RequestMapping(value = {"/submit"}, method = {RequestMethod.POST})
//    public ModelAndView submit(@RequestParam(value = "name") String name, @RequestParam(value = "password1") String password)
//    {
//        Date date = new Date();
//        User user = new User(name, password, date);
//        userService.addUser(user);
//        return new ModelAndView("redirect:/index");
//    }
//
//    @RequestMapping(value = {"/addUser"}, method = {RequestMethod.POST})
//    public ModelAndView addUser(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password)
//    {
//        Date date = new Date();
//        User user = new User(name, password, date);
//        userService.addUser(user);
//        return new ModelAndView("redirect:/homepage/userManager");
//    }
//
    @RequestMapping(value = "/deleteuser/{id}")
    public ModelAndView deleteuser(@PathVariable(value = "id") Integer userId)
    {

        userService.deleteUserByUserId(userId);
        user_roleService.deleteUserRoleByUserId(userId);
        user_securityService.deletUserSecurityByUserId(userId);
        return new ModelAndView("redirect:/homepage/userManager");
    }
//
//    @RequestMapping(value = {"/updateuser/{id}"})
//    public ModelAndView updateuser(@PathVariable(value = "id") Integer userid, Map<String, Object> map)
//    {
//        map.put("user", userService.getUserById(userid));
//        return new ModelAndView("updateuser");
//    }
//
//    @RequestMapping(value = {"/updateUserMessage/{id}"}, method = {RequestMethod.POST})
//    public ModelAndView updateUserMessage(@PathVariable(value = "id") Integer userid, @RequestParam(value = "name") String name, @RequestParam(value = "password") String password)
//    {
//        UserRole userRole = new UserRole();
//        userRole.setUserId(userid);
//        userRole.setUserName(name);
//        User user = userService.getUserById(userid);
//        user.setName(name);
//        user.setPassword(password);
//        userService.upDateUserById(user);
//        userRoleService.upDateUserNaemByUserId(userRole);
//        userSecurityService.upDateUserNaemByUserId(userRole);
//        return new ModelAndView("redirect:/homepage/userManager");
//    }
//
//    @RequestMapping(value = {"/assignrole/{id}"})
//    public ModelAndView assignrole(@PathVariable(value = "id") Integer id, Map<String, List<String>> assignedRoleListMap, Map<String, List<String>> tmpListMap, Map<String, Integer> idMap)
//    {
//
//        List<String> allRoleList = roleService.getAllRoleNameList();
//        List<String> assignedRoleList = userRoleService.getRoleNameByUserId(id);
//        List<String> tmpList = allRoleList;
//        tmpList.removeAll(assignedRoleList);
//
//        assignedRoleListMap.put("assignedRoleList", assignedRoleList);
//        tmpListMap.put("unassignedRoleList", tmpList);
//        idMap.put("id", id);
//        return new ModelAndView("assignrole");
//    }
//
//    @RequestMapping(value = {"/assignsecurity/{id}"})
//    public ModelAndView assignsecurity(@PathVariable(value = "id") Integer id, Map<String, List<String>> assignedSecurityListMap, Map<String, List<String>> tmpListMap, Map<String, Integer> idMap)
//    {
//        List<String> allSecurityList = securityService.getAllSecurityNameList();
//        List<String> assignedSecurityList = userSecurityService.getSecurityNameByUserId(id);
//        List<String> tmpList = allSecurityList;
//        tmpList.removeAll(assignedSecurityList);
//
//        assignedSecurityListMap.put("assignedSecurityList", assignedSecurityList);
//        tmpListMap.put("unassignedSecurityList", tmpList);
//        idMap.put("id", id);
//
//        return new ModelAndView("assignsecurity");
//    }
}
