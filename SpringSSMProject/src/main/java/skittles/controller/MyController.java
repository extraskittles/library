package skittles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import skittles.domain.Reader;
import skittles.service.BookService;
import skittles.service.ReaderService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @Autowired
    BookService bookService;
    @Autowired
    ReaderService readerService;
@RequestMapping("myLibrary")
    public String myLibrary(){
        return "myLibrary";
    }

    @RequestMapping("myMsg")
    public String myMsg(HttpServletRequest request){
        System.out.println(request.getSession().getAttribute("reader"));
        return "myMsg";
    }

    @RequestMapping("myPassword")
    public String myPassword(){
        return "myPassword";
    }

    @RequestMapping("mySearch")
    public String myBook(){
        return "mySearch";
    }

    @RequestMapping("mySearchResult")
    public String mySearchResult(){
        return "mySearchResult";
    }

    @RequestMapping("myFindBook")
    public String myFindBook(HttpServletRequest request,String bookName){
    request.getSession().setAttribute("books", bookService.findBook(bookName));
    return "redirect:mySearchResult";
    }
//跳转到信息修改的页面
    @RequestMapping("myEditMsg")
    public String myEditMsg(){
        return "myEditMsg";
    }
//处理信息修改，并重定向到个人信息页面
    @RequestMapping("myHandleMsg")
    public String myHandleMsg(HttpServletRequest request,Reader reader){
    readerService.updateReader(reader);
    request.getSession().setAttribute("reader",reader);
    return "redirect:myMsg";
    }
}



