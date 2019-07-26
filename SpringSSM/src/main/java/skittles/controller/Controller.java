package skittles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import skittles.domain.Account;
import skittles.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public String save(HttpServletRequest request, HttpServletResponse response,Account account) throws IOException {
        accountService.save(account);
        response.sendRedirect(request.getContextPath()+"/findAll");
        return null;
    }
}
