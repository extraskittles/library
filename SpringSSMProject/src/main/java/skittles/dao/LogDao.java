package skittles.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import skittles.domain.Log;

import java.util.List;

public interface LogDao {
    //添加日志
    @Insert("insert into log(bookNum,readerNum,lendTime,returnTime,bookName)values(#{bookNum},#{readerNum},#{lendTime},#{returnTime},#{bookName})")
    void addLog(Log log);
    //删除日志
    @Delete("delete from log where id=#{id}")
    void deleteLog(Log log);
    //更新日志
    @Update("update log set returnTime=#{returnTime} where bookNum=#{bookNum} and returnTime is null")
    void updateLog(Log log);

//查找所有日志
    @Select("select * from log")
    List<Log> findAllLog();

    //查找一个读者的日志
    @Select("select * from log where readerNum=#{readerNum}")
    List<Log> findByReaderNum(Integer readerNum);
}
