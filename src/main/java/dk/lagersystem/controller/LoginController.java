package dk.lagersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index(){
        return "login/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }

    @GetMapping("/redirect")
    public String redirect(HttpServletRequest request){
        if (request.isUserInRole("USER")){
            return "redirect:/home";
        }
        return "login/login";
    }

}
