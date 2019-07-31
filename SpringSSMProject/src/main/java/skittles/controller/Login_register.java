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
public class Login_register {
    @Autowired
    AccountService accountService;
//处理登陆的请求，并返回访问商品首页；未登陆以访客模式访问。登陆了让session的isLogin=true，并访问商品首页。
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
                request.getSession().setAttribute("isLogin", true);
                long loginTime =System.currentTimeMillis();
                request.getSession().setAttribute("loginTime", loginTime);
                accountService.update(loginTime);
            } else {
                request.getRequestDispatcher(request.getContextPath() + "/index.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher(request.getContextPath() + "/index.jsp").forward(request, response);
        }
        return "production";
    }
//处理注册的请求，返回注册成功页面
    @RequestMapping("register_success")
    public String register_success(HttpServletRequest request, HttpServletResponse response, Account account)  {
        String name = account.getName();
        try {
            String DataName = accountService.findByName(name).getName();
            request.getRequestDispatcher(request.getContextPath() + "/register").forward(request, response);
        } catch (Exception e) {
            accountService.save(account);
        }
        return "register_success";
    }
//处理注销用户的请求
    @RequestMapping("logout")
    public String logout(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("name");
        request.getSession().removeAttribute("isLogin");
//        request.getRequestDispatcher(request.getContextPath()+"production").forward(request,response);
        return null;
    }
}
