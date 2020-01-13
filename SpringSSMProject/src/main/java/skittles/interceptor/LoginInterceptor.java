package skittles.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object isLogin = request.getSession().getAttribute("isLogin");
        if(isLogin==null){
            response.sendRedirect(request.getContextPath()+"/index.jsp");
            return false;
        }else {
           return true;
        }
    }
}
