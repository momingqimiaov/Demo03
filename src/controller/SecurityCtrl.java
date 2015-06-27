package controller;

import model.Security;
import model.User;
import model.UserSecurity;
import model.User_Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.SecurityService;
import service.UserService;
import service.User_SecurityService;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
public class SecurityCtrl
{
    @Autowired
    SecurityService securityService;

    @Autowired
    User_SecurityService user_securityService;
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/checkSecurityIsExist"}, method = {RequestMethod.POST})
    public void checkIsExist(String security, PrintWriter out)
    {
        if (securityService.checkIsExistByName(security))
        {
            out.write("Sorry,Already Exists");
        } else
        {
            out.write("(:");
        }
    }

    @RequestMapping(value = {"/addSecurity"}, method = {RequestMethod.POST})
    public ModelAndView addSecurity(@RequestParam(value = "security") String security, @RequestParam(value = "securitydescription") String securitydescription)
    {
        Security security2 = new Security(security, securitydescription);
        securityService.addSecurity(security2);
        return new ModelAndView("redirect:/homepage/securityManager");
    }

    @RequestMapping(value = "/deletesecurity/{id}")
    public ModelAndView deleteuser(@PathVariable(value = "id") Integer id)
    {
        Security security = securityService.getSecurityById(id);
        String securitystring = security.getSecurityname();
        List<User> userList = userService.getAllUserList();
        for (int i = 0; i < userList.size(); i++)
        {
            String newsecurity = userList.get(i).getSecurity().replaceAll(securitystring, "");
            User user = new User(userList.get(i).getId(), userList.get(i).getUsername(), userList.get(i).getPassword(), userList.get(i).getRole(), newsecurity, userList.get(i).getAboutuser());
            userService.upDateUserById(user);
        }

        if (user_securityService.getUserSecurityBySecurityID(id) != null)
        {
            user_securityService.deleteUserBySecurityID(id);
        }

        securityService.deleteSecurityById(id);
        return new ModelAndView("redirect:/homepage/securityManager");
    }

    @RequestMapping(value = {"/updatesecurity/{id}"})
    public ModelAndView updateuser(@PathVariable(value = "id") Integer securityid, Map<String, Object> map)
    {
        map.put("security", securityService.getSecurityById(securityid));
        return new ModelAndView("updatesecurity");
    }

    @RequestMapping(value = {"/updateSecurityMessage/{id}"}, method = {RequestMethod.POST})
    public ModelAndView updateUserMessage(@PathVariable(value = "id") Integer securityid, @RequestParam(value = "security") String security, @RequestParam(value = "securitydescription") String securitydescription)
    {

        Security security2 = securityService.getSecurityById(securityid);

        String securityString = security2.getSecurityname();
        List<User> userList = userService.getAllUserList();
        for (int i = 0; i < userList.size(); i++)
        {
            String newsecurity = userList.get(i).getSecurity().replaceAll(securityString, security);
            User user = new User(userList.get(i).getId(), userList.get(i).getUsername(), userList.get(i).getPassword(), userList.get(i).getRole(), newsecurity, userList.get(i).getAboutuser());
            userService.upDateUserById(user);
        }

        security2.setSecurityname(security);
        security2.setAboutsecurity(securitydescription);
        securityService.upDateSecurityById(security2);

        UserSecurity userSecurity = new UserSecurity(security, securityid);
        user_securityService.upDateSecurityNameBySecurityId(userSecurity);

        return new ModelAndView("redirect:/homepage/securityManager");
    }

    @RequestMapping(value = {"/SecurityAssigned/{id}"}, method = {RequestMethod.POST})
    public ModelAndView assigned(@PathVariable(value = "id") int id, @RequestParam(value = "checkbox", required = false, defaultValue = "") String Securities)
    {
        User user = userService.getUserById(id);

        if (!Securities.equals(""))
        {
            user.setSecurity((user.getSecurity() + "," + Securities).replace(",", " "));
            String[] tmp = Securities.split(",");
            for (int i = 0; i < tmp.length; i++)
            {
                String security = tmp[i];
                int securityid = securityService.getIdBySecurityName(security);

                User_Security user_Security = new User_Security(id, security, securityid);
                user_securityService.addUserSecurity(user_Security);
            }
        }
        userService.upDateUserById(user);
        return new ModelAndView("redirect:/homepage/userManager");

    }

    @RequestMapping(value = {"/removeSecurity/{id}"})
    public ModelAndView removeRole(@PathVariable(value = "id") Integer id, @RequestParam(value = "checkbox", required = false, defaultValue = "") String securitis)
    {

        User user = userService.getUserById(id);
        if (!securitis.equals(""))
        {
            String[] tmp = securitis.split(",");
            for (int i = 0; i < tmp.length; i++)
            {
                String security = tmp[i];
                int securityid = securityService.getIdBySecurityName(security);
                User_Security user_Security = new User_Security(id, security, securityid);
                user_securityService.deleteUserSecurity(user_Security);
                String newsecurity = user.getSecurity().replace(security, "");
                User user2 = new User(id, user.getUsername(), user.getPassword(), user.getRole(), newsecurity, user.getAboutuser());
                userService.upDateUserById(user2);
            }
        }

        return new ModelAndView("redirect:/homepage/userManager");
    }

}
