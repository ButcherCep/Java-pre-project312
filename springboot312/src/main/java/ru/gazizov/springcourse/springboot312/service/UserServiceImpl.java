package ru.gazizov.springcourse.springboot312.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gazizov.springcourse.springboot312.DAO.UserDao;
import ru.gazizov.springcourse.springboot312.model.User;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> showAllUsers() {
        return userDao.showAllUsers();
    }
    @Override
    public User showUserId(int id) {
        return userDao.showUserId(id);
    }
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
    @Override
    public void updateUser(int id, User updateuser) {
        userDao.updateUser(id,updateuser);
    }
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
