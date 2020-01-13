package skittles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import skittles.domain.Reader;
import skittles.service.ReaderService;
import javax.servlet.http.HttpServletRequest;


@Controller
public class ReaderController {
    @Autowired
    ReaderService readerService;

    //处理添加读者请求,rea
    @RequestMapping("addReader")
    public String addReader(Reader reader){
        boolean addSuccess = readerService.addReader(reader);
        if(addSuccess){
            return "redirect:findAllReader";
        }else {
            return "redirect:toaddReader";
        }
    }

    //处理删除读者的请求
    @RequestMapping("deleteReader")
    public String deleteReader(Integer readerNum){
        readerService.deleteReader(readerNum);
        return "redirect:findAllReader";
    }

    //处理修改读者的请求
    @RequestMapping(value = "updateReader")
    public String updateReader(Reader reader){
        readerService.updateReader(reader);
        return "redirect:findAllReader";
    }

    

    //跳转到编辑读者的页面
    @RequestMapping("editReader")
    public String editReader(HttpServletRequest request,Integer readerNum){
        request.getSession().setAttribute("reader", readerService.findReaderByReaderNum(readerNum));
        return "editReader";
    }

    //处理查询所有的读者信息的请求
    @RequestMapping("findAllReader")
    public String findAllBook(HttpServletRequest request){
        request.getSession().setAttribute("readers",readerService.findAllReader());
        return "redirect:tofindAllReader";
    }

}
