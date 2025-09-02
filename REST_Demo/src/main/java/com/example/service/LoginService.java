package com.example.service;

import java.util.List;

import com.example.dto.LoginInputDto;
import com.example.dto.LoginOutputDto;
import com.example.entity.Login;
import com.example.entity.Person;
import com.example.entity.Role;

public interface LoginService {

	Login login(Login login);

	Login logout(String email);

	List<Person> findByRole(Role role);

	LoginOutputDto loginDto(LoginInputDto login);

}
