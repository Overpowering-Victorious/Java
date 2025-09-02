package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.LoginInputDto;
import com.example.dto.LoginOutputDto;
import com.example.entity.Login;
import com.example.entity.Person;
import com.example.entity.Role;
import com.example.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService logSer;
	
	@PutMapping("/login")
	Login login(@RequestBody Login login)
	{
		return logSer.login(login);
	}
	
	@PostMapping("loginDto")
	LoginOutputDto loginDto(@RequestBody LoginInputDto login)
	{
		return logSer.loginDto(login);
	}
	
	@PutMapping("/logout")
	Login logout(@RequestBody String email)
	{
		return logSer.logout(email);
	}
	
	@GetMapping("/findByRole")
	List<Person> findByRole(@RequestBody Role role)
	{
		return logSer.findByRole(role);
	}
}
