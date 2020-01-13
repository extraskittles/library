package skittles.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skittles.dao.ReaderDao;
import skittles.dao.UserDao;
import skittles.domain.Reader;
import skittles.domain.User;
import skittles.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    UserDao userDao;
@Autowired
    ReaderDao readerDao;
//注册用户，随机生成一个读者号并存入user表和reader表
    @Override
    public void addUser(User user) {
        Random random = new Random();
        Integer randomNum = random.nextInt(100000000);
        user.setReaderNum(randomNum);
        userDao.addUser(user);
    }
//修改密码
    @Override
    public boolean updateUser(String userName, String oldPassword, String newPassword, String confirmPassword)  {
        Map<String,Object> map = new HashMap<>();
        User user = new User();
        try {
            if(oldPassword.equals(userDao.findByName(userName).getPassword())){
                if(newPassword.equals(confirmPassword)){
                    user.setUserName(userName);
                    user.setPassword(newPassword);
                    userDao.updateUser(user);
                   return true;
                }else {
                   return false;
                }
            }else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
//判断账号密码是否正确，正确map返回truePassword=true
    @Override
    public Map login(User user) {
        Map<String,Object> map = new HashMap<>();
        String userName = user.getUserName();
        String password = user.getPassword();
        User dataUser = null;
        try {
            dataUser = userDao.findByName(userName);
            if(password.equals(dataUser.getPassword())){
                map.put("truePassword",true);
                return map;
            }else{
                map.put("truePassword",false);
                return map;
            }
        } catch (Exception e) {
            map.put("truePassword",false);
            return map;
        }
    }

    @Override
    public User findByName(String userName) {
        return userDao.findByName(userName);
    }
}
