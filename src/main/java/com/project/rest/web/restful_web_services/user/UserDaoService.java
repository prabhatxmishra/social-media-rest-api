package com.project.rest.web.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User>users=new ArrayList<>();
	private static int countUser=0;
	static {
		users.add(new User(countUser++, "Prabhat",LocalDate.now().minusYears(30)));
		users.add(new User(countUser++, "Tisha",LocalDate.now().minusYears(29)));
		users.add(new User(countUser++, "Harshit",LocalDate.now().minusYears(35)));
	}
	
	public List<User> findall()
	{
		return users;
	}
	
	public User findOne(int id)
	{
		Predicate<? super User>predicate=user->user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User saveUser(User user)
	{
		user.setId(countUser++);
		users.add(user);
		return user;
	}
}
