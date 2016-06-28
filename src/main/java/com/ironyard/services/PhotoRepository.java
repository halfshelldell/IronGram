package com.ironyard.services;

import com.ironyard.entities.Photo;
import com.ironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by illladell on 6/28/16.
 */
public interface PhotoRepository extends CrudRepository<Photo, Integer> {
   public Iterable<Photo> findByRecipient(User recipient);
}
