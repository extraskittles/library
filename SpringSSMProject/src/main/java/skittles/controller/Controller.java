package skittles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import skittles.domain.Account;
import skittles.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    AccountService accountService;

    @RequestMapping("production")
    public String production(HttpServletRequest request, HttpServletResponse response, Account account) throws ServletException, IOException {
        if (account.getName() == null) {
            return "production";
        }
        try {
            String name = account.getName();
            String password = account.getPassword();
            if (password.equals(accountService.findByName(name).getPassword())) {
                request.getSession().setAttribute("name", name);
                request.getSession().setAttribute("password", password);
            } else {
                request.getRequestDispatcher(request.getContextPath() + "/index.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher(request.getContextPath() + "/index.jsp").forward(request, response);
        }
        return "production";
    }

    @RequestMapping("register_success")
    public String register_success(HttpServletRequest request, HttpServletResponse response, Account account) throws ServletException, IOException {
        String name = account.getName();
        try {
            String DataName = accountService.findByName(name).getName();
            request.getRequestDispatcher(request.getContextPath() + "/register").forward(request, response);
        } catch (Exception e) {
            accountService.save(account);
        }
        return "register_success";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("name");
        request.getSession().removeAttribute("password");
        System.out.println(request.getServletPath());
        request.getRequestDispatcher(request.getContextPath()+"production").forward(request,response);
        return null;
    }
}
