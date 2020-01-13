package skittles.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skittles.dao.BookDao;
import skittles.dao.LogDao;
import skittles.dao.ReaderDao;
import skittles.domain.Book;
import skittles.domain.Log;
import skittles.domain.Reader;
import skittles.service.LogService;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
public class LogServiceImpl implements LogService{
    @Autowired
    LogDao logDao;
    @Autowired
    BookDao bookDao;
    @Autowired
    ReaderDao readerDao;
    @Override
    public boolean addLog(Log log) {   //log只有bookName和readerNum传入，调用logdao时需要加入BookNum和lendTime
        //判读读者表是否有这个读者号，有则再进行借阅和添加日志,返回true
        if(readerDao.findReaderByReaderNum(log.getReaderNum())==null){
            return false;
        }else {
            //book状态设置为需归还
            Book book = bookDao.findBookByName(log.getBookName());
            Integer bookNum = book.getBookNum();
            book.setStatus("需归还");
            bookDao.updateBook(book);
            //添加日志
            Date lendTime = new Date(System.currentTimeMillis());
            log.setBookNum(bookNum);
            log.setLendTime(lendTime);
            logDao.addLog(log);
            return true;
        }
    }


    @Override
    public void deleteLog(Log log) {
        logDao.deleteLog(log);
    }

    @Override
    public void updateLog(Log log) {
        //book状态设置为可借阅
            Book book = bookDao.findBookByName(log.getBookName());
            Integer bookNum = book.getBookNum();
            book.setStatus("可借阅");
            bookDao.updateBook(book);
            //更新日志
            Date returnTime = new Date(System.currentTimeMillis());
            log.setBookNum(bookNum);
            log.setReturnTime(returnTime);
            logDao.updateLog(log);
    }

    @Override
    public List<Log> findAllLog() {
        return logDao.findAllLog();
    }

    @Override
    public List<Log> findByReaderNum(Integer readerNum) {
        return logDao.findByReaderNum(readerNum);
    }


}
