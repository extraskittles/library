package skittles.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import skittles.domain.Account;

import java.util.List;

public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();
    @Insert("insert into account(name,password)values(#{name},#{password})")
    void save(Account account);
}
