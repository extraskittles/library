package skittles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimplePages {
    @RequestMapping("register")
    public String register(){
        return "register";
    }
}
