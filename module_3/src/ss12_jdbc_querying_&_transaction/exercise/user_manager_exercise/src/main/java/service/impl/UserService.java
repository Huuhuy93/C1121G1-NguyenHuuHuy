package service.impl;

import model.User;
import repository.IUserRepository;
import repository.UserRepository;
import service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private IUserRepository iUserRepository = new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        iUserRepository.insertUser(user);
    }

    @Override
    public User selectUser(Integer id) {
        return iUserRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return iUserRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(Integer id) throws SQLException {
        return iUserRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return iUserRepository.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return iUserRepository.searchByCountry(country);
    }

    @Override
    public List<User> sortByName() {
        return iUserRepository.sortByName();
    }

    @Override
    public List<User> selectSPUserAll() {
        return iUserRepository.selectSPUserAll();
    }

    @Override
    public User getUserById(int id) {
        return iUserRepository.getUserById(id);
    }

    @Override
    public boolean deleteUserSP(Integer id) {
        return iUserRepository.deleteUserSP(id);
    }

    @Override
    public void addUserTransaction() {
        iUserRepository.addUserTransaction();
    }


}
