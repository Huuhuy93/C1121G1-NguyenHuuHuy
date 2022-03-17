package repository;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    public void insertUser(User user) throws SQLException;

    public User selectUser(Integer id);

    public List<User> selectAllUsers();

    public boolean deleteUser(Integer id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> searchByCountry(String country);

    public List<User> sortByName();

    public List<User> selectSPUserAll();

    User getUserById(int id);

    public boolean deleteUserSP(Integer id);

    public void addUserTransaction();

}
