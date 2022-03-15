package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    public void insertUser(User user) throws SQLException;
    public User selectUser(Integer id);
    public List<User> selectAllUsers();
    public boolean deleteUser(Integer id) throws SQLException;
    public boolean updateuser(User user) throws SQLException;
}
