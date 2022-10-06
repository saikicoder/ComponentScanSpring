package org.springbean.services;

import org.springbean.models.User;
import org.springbean.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    //use of the @Autowired annotation, we could get rid of our Setter/Constructor injections.
     @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

//    //use of the @Autowired annotation on literals, we could get rid of our Setter/Constructor injections
//    //@Autowired
//    public void setRepository(UserRepository repository) {
//        System.out.println("UserService Setter called");this.repository = repository;
//    }
}
