package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisExample implements CommandLineRunner {

	@Autowired
	private RedisTemplate<String, UserDetail> template;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student = new Student(); student.setAge(1);
		 * student.setName("tienph");
		 * 
		 * template.opsForValue().set("loda", student);
		 * 
		 * // In ra màn hình Giá trị của key "loda" trong Redis
		 * System.out.println("Value of key loda: " +
		 * template.opsForValue().get("loda"));
		 * 
		 * Student student2 = (Student) template.opsForValue().get("loda");
		 * System.out.println(student2);
		 */

		// template.opsForValue().set("a", "a1");
		UserDetail stra = template.opsForValue().get(
				"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNjA2OTcwMzQ3LCJqdGkiOiJjYmE5OWQ5ZjdlZDg0OGEwOThmZjQ0OTlhYmFlOGJkMSIsInVzZXJfaWQiOjF9.ADkPXz9l87dbQLARqVhrod7_T5SVRSjqV6SWL1e5QCQ");

		UserDetail userDetail = new UserDetail("abc", "abc@abc.com", 1, 1);
		template.opsForValue().set("abc", userDetail);

		System.out.println(stra);

	}
}