package controller;

import model.Role;
import model.Security;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.RoleService;
import service.SecurityService;
import service.UserService;

import java.util.List;
import java.util.Map;


@Controller
public class LoginCtrl
{
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    SecurityService securityService;

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public ModelAndView index()
    {
        return new ModelAndView("index");
    }

    @RequestMapping(value = {"/login"}, method = {RequestMethod.POST})
    public ModelAndView login()
    {
        return new ModelAndView("redirect:/homepage/userManager");
    }

    @RequestMapping(value = {"/homepage/{tag}"})
    public ModelAndView homepageview(@PathVariable(value = "tag") String tag, Map<String, String> whichUrl, Map<String, List<User>> listUsers, Map<String, List<Role>> listRole, Map<String, List<Security>> listSecurity)
    {
        switch (tag)
        {
            case "userManager":
                List<User> userList = userService.getAllUserList();
                whichUrl.put("tag", "userManager");


                listUsers.put("userList", userList);
                break;
            case "roleManager":
                List<Role> roleList = roleService.getAllRoleList();
                whichUrl.put("tag", "roleManager");
                listRole.put("roleList", roleList);
                break;
            case "securityManager":
                List<Security> securityList = securityService.getAllSecurityList();
                whichUrl.put("tag", "securityManager");
                listSecurity.put("securityList", securityList);
                break;
        }
        return new ModelAndView("homepage");
    }

}
