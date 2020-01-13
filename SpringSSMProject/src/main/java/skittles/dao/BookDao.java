package skittles.dao;
import org.apache.ibatis.annotations.*;
import skittles.domain.Book;
import java.util.List;

public interface BookDao {
    //添加书
    @Insert("insert into book(bookName,writer,publish,bookNum,price,status)values(#{bookName},#{writer},#{publish},#{bookNum},#{price},'可借阅')")
    void addBook(Book book);
    //删除一本书的记录
    @Delete("delete from book where bookName=#{bookName}")
    void deleteBook(String bookName);
    //更新一本书的记录
    @Update("update book set bookName=#{bookName},writer=#{writer},publish=#{publish},bookNum=#{bookNum},price=#{price},status=#{status} where bookNum=#{bookNum}")
    void updateBook(Book book);
    //查询所有书信息
    @Select("select * from book")
    List<Book> findAllBook();
    //模糊查询书信息
    @Select("select * from book where bookName like '%${bookName}%'")
    List<Book> findBook(@Param("bookName")String bookName);
    //查询一本书的信息
    @Select("select * from book where bookName=#{bookName}")
    Book findBookByName(String bookName);
}
