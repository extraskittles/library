package skittles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Production {
    @RequestMapping("test")
    public String test(){
        return "test";
    }


    @RequestMapping("production1")
    public String production1(){
        return "production1";
    }

    @RequestMapping("production2")
    public String production2(){
        return "production2";
    }

    @RequestMapping("production3")
    public String production3(){
        return "production3";
    }
}
