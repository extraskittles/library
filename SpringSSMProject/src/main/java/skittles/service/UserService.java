package skittles.service;

import skittles.domain.User;

import java.util.Map;

public interface UserService {
    //注册用户
    void addUser(User user);
    //修改面
    boolean updateUser(String userName, String oldPassword, String newPassword, String confirmPassword);
    //登陆
    Map<String,Object> login(User user);

    User findByName(String userName);
}
