package skittles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import skittles.service.AccountService;
//访问不同的商品页
@Controller
public class Production {
    @Autowired
    AccountService accountService;
    @RequestMapping("production1")
    public String production1()  {
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
