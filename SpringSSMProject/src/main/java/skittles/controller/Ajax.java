package skittles.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import skittles.domain.Account;
import skittles.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Ajax {
    @Autowired
    AccountService accountService;
    /*
注册时判断用户名是否已被注册过，如果已经注册提醒用户
*/
    @RequestMapping("existName")
    public String exitName(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        String userName = request.getParameter("userName");
        Map<String,Object> map = new HashMap<>();
        String dataName = null;

        try {
            dataName = accountService.findByName(userName).getName();
        } catch (Exception e) {
            map.put("existName",false);
            map.put("msg","用户名可用");
            if(userName.equals("")){
                map.put("existName",true);
                map.put("msg","注册用户名不能为空");
            }
        }
            if(userName.equals(dataName)){
                map.put("existName",true);
                map.put("msg","此用户太受欢迎，请更换一个");
            }
        //将MPA转化为JSON,并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);
        return null;
    }
    //判断账号密码是否正确，不正确提示账号或者密码错误
    @RequestMapping("truePassword")
    public String truePassword(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("test");
        response.setContentType("text/html;charset=utf-8");
        Map<String,Object> map = new HashMap<>();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Account account = null;

        try {
            account = accountService.findByName(userName);
            if(password.equals(account.getPassword())){
                map.put("truePassword",true);
                map.put("msg","");
            }else {
                map.put("truePassword",false);
                map.put("msg","用户名或密码有误，请重新输入");
            }
        } catch (Exception e) {
            map.put("truePassword",false);
            map.put("msg","用户名或密码有误，请重新输入");
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);
        return null;
    }
}
