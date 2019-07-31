package skittles.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import skittles.domain.Account;



public interface AccountDao {
    @Select("select * from account where name=#{name}")
    Account findByName (String name)throws Exception;
    @Insert("insert into account(name,password)values(#{name},#{password})")
    void save(Account account);
    @Update("update account set loginTime=#{loginTime}")
    void update(long loginTime);
}
