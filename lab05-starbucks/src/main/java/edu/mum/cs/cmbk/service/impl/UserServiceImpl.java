package edu.mum.cs.cmbk.service.impl;

import edu.mum.cs.cmbk.data.Database;
import edu.mum.cs.cmbk.domain.User;
import edu.mum.cs.cmbk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Database database;

    @Override
    public User findByName(String name) {
        return database.users.get(name);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) database.users.values();
    }
}
