package com.warpax.restcontentnegotiating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.warpax.restcontentnegotiating.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getCustomer(@PathVariable long id) {

	User user = new User();
	user.setId(id);
	user.setUsername("warner");
	user.setPassword("password");
	user.setEnabled(true);
	return user;
    }

    @RequestMapping(method = RequestMethod.GET)
    public User saveUser() {
	User user = new User();
	user.setId(1L);
	user.setUsername("warner");
	user.setPassword("password");
	user.setEnabled(true);
	return user;
    }
}
