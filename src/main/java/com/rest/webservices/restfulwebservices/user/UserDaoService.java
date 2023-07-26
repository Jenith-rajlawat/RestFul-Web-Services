package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	//We will create a static list instead of JPA AND HIBERNATE
	
	private static List<User> users =new ArrayList<>();
	
	private static int userCount=0;
	static {
		users.add(new User(++userCount,"Adam",LocalDate.now().minusYears(30)));
		users.add(new User(++userCount,"Jenith",LocalDate.now().minusYears(23)));
		users.add(new User(++userCount,"Jesika",LocalDate.now().minusYears(26)));
		
	}
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate=user ->user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);//functional programming
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
}
