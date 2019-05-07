package edu.mum.cs.cmbk.controller;

import edu.mum.cs.cmbk.domain.User;
import edu.mum.cs.cmbk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("user")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login() throws Exception {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user, Model model, RedirectAttributes redirectAttributes) throws Exception {

        User find = userService.findByName(user.getName());
        if (find == null || !find.getPassword().equals(user.getPassword())) {
            model.addAttribute("msg", "Username or Password not invalid");
            return "login";
        }

        redirectAttributes.addFlashAttribute("user", user);

        return "redirect:/advice";
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpSession session) throws Exception {
        session.invalidate();
        return "redirect:/login";
    }
}
