package edu.mum.cs.cmbk.service;

import edu.mum.cs.cmbk.domain.User;

import java.util.List;

public interface UserService {
    public User findByName(String name);
    public List<User> getAllUsers();
}
