package skittles.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import skittles.domain.User;

public interface UserDao {
//注册用户
    @Insert("insert into user (userName,password,readerNum)values(#{userName},#{password},#{readerNum})")
    void addUser(User user);

    //修改用户密码
    @Update("update user set password=#{password} where userName=#{userName}")
    void updateUser(User user);

    //通过用户名查找用户信息
    @Select("select * from user where userName=#{userName}")
    User findByName(String userName);

    //通过读者号查找用户信息
    @Select("select * from user where readerNum=#{readerNum}")
    User findByReaderNum(Integer readerNum);
}
