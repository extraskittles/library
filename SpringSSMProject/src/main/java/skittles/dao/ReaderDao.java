package skittles.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import skittles.domain.Reader;

import java.util.List;

public interface ReaderDao {
    //添加读者
    @Insert("insert into reader(readerName,readerNum,sex,age,address,phoneNum)values(#{readerName},#{readerNum},#{sex},#{age},#{address},#{phoneNum})")
    void addReader(Reader reader);
    //删除读者
    @Delete("delete from reader where readerNum=#{readerNum}")
    void deleteReader(Integer readerNum);
    //修改读者
    @Update("update reader set readerName=#{readerName},readerNum=#{readerNum},sex=#{sex},age=#{age},address=#{address},phoneNum=#{phoneNum} where readerNum=#{readerNum}")
    void updateReader(Reader reader);
    //根据读者号查询一条记录
    @Select("select * from reader where readerNum=#{readerNum}")
    Reader findReaderByReaderNum(Integer readerNum);
    //查询所有读者
    @Select("select * from reader where readerName is not null")
    List<Reader> findAllReader();

}
