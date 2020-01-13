package skittles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @RequestMapping("toaddBook")
    public String toaddBook(){
        return "toaddBook";
    }
    @RequestMapping("tofindAllBook")
    public String tofindAllBook(){
        return "tofindAllBook";
    }
    @RequestMapping("toaddReader")
    public String toaddReader(){
        return "toaddReader";
    }
    @RequestMapping("tofindAllReader")
    public String tofindAllReader(){
        return "tofindAllReader";
    }

    @RequestMapping("tofindAllLog")
    public String tofindAllLog(){
        return "tofindAllLog";
    }

    @RequestMapping("tosetPassword")
    public String tosetPassword(){
        return "tosetPassword";
    }

    @RequestMapping("tofindBook")
    public String tofindBook(){
        return "tofindBook";
    }

@RequestMapping("forTest")
    public String forTest(){
        return "forTest";
}

}
