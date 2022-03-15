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
    public boolean updateuser(User user) throws SQLException {
        return iUserRepository.updateuser(user);
    }
}
