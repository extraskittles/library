package skittles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import skittles.domain.Book;
import skittles.service.BookService;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class BookController {
    @Autowired
    BookService bookService;
    //处理添加书请求
    @RequestMapping("addBook")
    public String addBook(Book book){
        bookService.addBook(book);
        return "redirect:findAllBook";
    }
    //处理删除一本书的请求
    @RequestMapping("deleteBook")
    public String deleteBook(String bookName){
        bookService.deleteBook(bookName);
        return "redirect:findAllBook";
    }

    //处理更新一本书的请求
    @RequestMapping("updateBook")
    public String updateBook(Book book){
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:findAllBook";
    }

    //跳转到编辑书的页面
    @RequestMapping("editBook")
    public String editBook(HttpServletRequest request,String bookName){
        request.getSession().setAttribute("book",bookService.findBookByName(bookName));
        return "editBook";
    }
    //处理查询所有的书信息的请求
    @RequestMapping("findAllBook")
    public String findAllBook(HttpServletRequest request){
        request.getSession().setAttribute("bookss",bookService.findAllBook());
        return "redirect:tofindAllBook";
    }

    //处理模糊查询
    @RequestMapping("findBook")
    public String findBook(String bookName,HttpServletRequest request){
        request.getSession().setAttribute("books",bookService.findBook(bookName));
        return "redirect:tofindBook";
    }

    //处理查询一本书的请求
    @RequestMapping("findBookByName")
    public String findBookByName(String bookName,HttpServletRequest request){
        request.getSession().setAttribute("book",bookService.findBookByName(bookName));
        return "findBookByName";
    }


}
