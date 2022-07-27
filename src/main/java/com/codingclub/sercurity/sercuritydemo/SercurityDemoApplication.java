package com.codingclub.sercurity.sercuritydemo;

import com.codingclub.sercurity.sercuritydemo.entity.Role;
import com.codingclub.sercurity.sercuritydemo.entity.User;
import com.codingclub.sercurity.sercuritydemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SercurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SercurityDemoApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	CommandLineRunner runner(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(null,"ROLE_USER"));
//			userService.saveRole(new Role(null,"ROLE_MANAGER"));
//			userService.saveRole(new Role(null,"ROLE_ADMIN"));
//			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null,"Hieu Pham","hieupham","1234",new ArrayList<>()));
//			userService.saveUser(new User(null,"Duong Tran","duongtran","1234",new ArrayList<>()));
//			userService.saveUser(new User(null,"Vy Pham","vypham","1234",new ArrayList<>()));
//			userService.saveUser(new User(null,"Bao Pham","baopham","1234",new ArrayList<>()));
//
//
//			userService.addRoletoUser("hieupham","ROLE_USER");
//			userService.addRoletoUser("duongtran","ROLE_MANAGER");
//			userService.addRoletoUser("vypham","ROLE_ADMIN");
//			userService.addRoletoUser("hieupham","ROLE_ADMIN");
//			userService.addRoletoUser("baopham","ROLE_USER");
//
//		};
//	}
}
