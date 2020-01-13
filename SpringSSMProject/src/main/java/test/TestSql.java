package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import skittles.dao.UserDao;
import skittles.domain.User;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;


public class TestSql {
    @Autowired
    UserDao userDao;
    @Test
    public void test1(){
        User user = null;
        try {
            user = userDao.findByName("周兆垣");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(user);
    }
}
