package com.ironyard.controller;

import com.ironyard.services.PhotoRepository;
import com.ironyard.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by illladell on 6/28/16.
 */

@RestController
public class IronGramRestController {
    @Autowired
    UserRepository users;

    @Autowired
    PhotoRepository photos;
}