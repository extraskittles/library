package skittles.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import skittles.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
过滤器判断该用户是否单用户登录
无登录则放行，有登陆时且非单用户登录，移除session的数据再放行
*/
public class RegisterInterceptor implements HandlerInterceptor {
    @Autowired
    AccountService accountService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session =request.getSession();
         String name = (String) session.getAttribute("name");
        if (name==null){
            return true;
        }
        Long sessionLoginTime = (Long) session.getAttribute("loginTime");
        Long dataLoginTime =  accountService.findByName(name).getLoginTime();
        if(dataLoginTime.equals(sessionLoginTime)){
            return true;
        }else{
            session.removeAttribute("name");
            session.removeAttribute("isLogin");
            session.removeAttribute("loginTime");
            request.getRequestDispatcher(request.getContextPath()+"index.jsp").forward(request,response);
            return true;
        }
    }
}
