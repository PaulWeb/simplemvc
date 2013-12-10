/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wp.issue18;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Paul Shishakov
 * @e-mail paulandweb@gmail.com
 */
@Controller
@SessionAttributes({"user"})
public class ExampleController {
    
    @Autowired
    @Qualifier("sessUser")
    protected User user;
    
    @ModelAttribute("user")
    public User initUser() {
        return user;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(HttpServletRequest request,ModelMap model) {       
        return "example";
    }
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String test(HttpServletRequest request) {       
        user.setName(request.getParameter("name"));
        return "redirect:/";
    }
}
