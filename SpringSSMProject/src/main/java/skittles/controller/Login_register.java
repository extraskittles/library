package skittles.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import skittles.dao.UserDao;
import skittles.domain.User;
import skittles.service.ReaderService;
import skittles.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class Login_register {
    @Autowired
    UserService userService;
    @Autowired
    ReaderService readerService;
//    处理注册的请求,并返回提示成功页面
    @RequestMapping("register_success")
    public String register(User user){
        userService.addUser(user);
        return "register_success";
    }

    //处理修改密码的请求，并返回修改密码成功页面
    @RequestMapping("setPassword")
    public String setPassword(HttpServletRequest request,String oldPassword,String newPassword,String confirmPassword){
        String userName = (String) request.getSession().getAttribute("userName");
        boolean truePassword = userService.updateUser(userName,oldPassword,newPassword,confirmPassword);
        if(truePassword){
            return "redirect:/index.jsp";
        }else {
            if("管理员".equals(userService.findByName(userName).getRoot())){
                return "redirect:/tosetPassword";
            }else {
                return "redirect:myPassword";
            }
        }
    }
    //发送请求来到注册页面
    @RequestMapping("register")
    public String register(){
        return "register";
    }

    //处理登陆的请求，正确重定向图书管理首页，错误重定向到登陆页面
    @RequestMapping("handleLibrary")
    public String handleLibrary(HttpServletRequest request,User user){
        Map<String,Object> map = userService.login(user);
        boolean truePassword = (boolean) map.get("truePassword");
        if(truePassword){
            request.getSession().setAttribute("isLogin",true);
            request.getSession().setAttribute("userName",user.getUserName());
            request.getSession().setAttribute("readerNum",userService.findByName(user.getUserName()).getReaderNum());
            request.getSession().setAttribute("reader",readerService.findReaderByReaderNum(userService.findByName(user.getUserName()).getReaderNum()));
            if("周兆荣".equals(user.getUserName())){
                return "redirect:/libraries";
            }else {
                return "redirect:/myLibrary";
            }
        }else{
            return "redirect:/index.jsp";
        }
    }
    //发送请求来到图书馆首页
    @RequestMapping("libraries")
    public String library(){
        return "libraries";
    }

    //退出登录
    @RequestMapping("logout")
    public String logout(HttpServletRequest request){
 /*       request.getSession().removeAttribute("isLogin");
        request.getSession().removeAttribute("userName");*/
        request.getSession().invalidate();
        return "redirect:/index.jsp";
    }
}
