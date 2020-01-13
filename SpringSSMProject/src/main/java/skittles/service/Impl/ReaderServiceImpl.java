package skittles.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skittles.dao.ReaderDao;
import skittles.dao.UserDao;
import skittles.domain.Book;
import skittles.domain.Reader;
import skittles.domain.User;
import skittles.service.ReaderService;

import java.util.List;
@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    ReaderDao readerDao;
    @Autowired
    UserDao userDao;
    @Override
    //判断reader表记录是否有读者号，有则返回true，没返回false
    public boolean addReader(Reader reader) {
        Integer readerNum = reader.getReaderNum();
        User user =userDao.findByReaderNum(readerNum);
        if(user==null){
            return false;
        }else{
            readerDao.addReader(reader);
            return true;
        }
    }
//删除一个读者的记录
    @Override
    public void deleteReader(Integer readerNum) {
        readerDao.deleteReader(readerNum);
    }

    @Override
    //更新读者表读者信息，若没更新，则加入信息表
    public void updateReader(Reader reader) {
        readerDao.updateReader(reader);
        if(readerDao.findReaderByReaderNum(reader.getReaderNum())==null){
         readerDao.addReader(reader);
        }
    }

    @Override
    public List<Reader> findAllReader() {
       return readerDao.findAllReader();
    }

    @Override
    public Reader findReaderByReaderNum(Integer readerNum) {
            return readerDao.findReaderByReaderNum(readerNum);
    }
}
