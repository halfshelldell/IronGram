package com.ironyard.services;

import com.ironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by illladell on 6/28/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findFirstByName(String name);
}
