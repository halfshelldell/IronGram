package com.ironyard.services;

import com.ironyard.entities.Photo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by illladell on 6/28/16.
 */
public interface PhotoRepository extends CrudRepository<Photo, Integer> {

}
