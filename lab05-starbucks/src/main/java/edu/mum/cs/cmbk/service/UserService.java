package edu.mum.cs.cmbk.service;

import edu.mum.cs.cmbk.domain.User;

import java.util.List;

public interface UserService {
     User findByName(String name);
     List<User> getAllUsers();
}
