package services;

import entities.User;

public interface UserService {
	 void save(User user);

	    User findByUsername(String username);
}
