package com.project.rest.web.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserDaoService {

	private static List<User>users=new ArrayList<>();
	
	static {
		users.add(new User(1001, "Prabhat",LocalDate.now().minusYears(30)));
		users.add(new User(1002, "Tisha",LocalDate.now().minusYears(29)));
		users.add(new User(1003, "Harshit",LocalDate.now().minusYears(35)));
	}
	
	public List<User> findall()
	{
		return users;
	}
	
	public User findOne(int id)
	{
		Predicate<? super User>predicate=user->user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}
