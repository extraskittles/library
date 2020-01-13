package skittles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import skittles.domain.Log;
import skittles.domain.Reader;
import skittles.service.LogService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LogController {
    @Autowired
    LogService logService;
    //处理借阅书并且添加日志的请求
    @RequestMapping("addLog")
    public String addLog(Log log){
        boolean lendSuccess = logService.addLog(log);
        if(lendSuccess){
            return "redirect:findAllBook";
        }else{
            return "lendBook";
        }
    }
/*//处理归还书并更新日志的请求
    @RequestMapping("returnBook")
    public String returnBook(Log log){
        logService.updateLog(log);
        return "redirect:findAllBook";
    }*/

    //处理归还书和更新日志的请求
    @RequestMapping("lendBook")
    public String lendBook(HttpServletRequest request,String bookName,String status){
        if(status.equals("需归还")){
            Log log = new Log();
            log.setBookName(bookName);
            logService.updateLog(log);
            return "redirect:findAllBook";
        }
        request.getSession().setAttribute("bookName",bookName);
        return "lendBook";
    }

    //处理删除日志请求
    @RequestMapping("deleteLog")
    public String deleteLog(Log log){
        logService.deleteLog(log);
        return "redirect:findAllLog";
    }

//处理查找所有日志请求
    @RequestMapping("findAllLog")
    public String findAllLog(HttpServletRequest request){
        request.getSession().setAttribute("logs",logService.findAllLog());
        return "redirect:tofindAllLog";
    }

    //处理查找一个用读者日志的请求
    @RequestMapping("myLend")
    public String myLend(HttpServletRequest request){
        Reader reader = (Reader) request.getSession().getAttribute("reader");
        try {
            request.getSession().setAttribute("logs",logService.findByReaderNum(reader.getReaderNum()));
        } catch (Exception e) {
           return "error";
        }
        return "myLend";
    }

}
