package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.LoginInputDto;
import com.example.dto.LoginOutputDto;
import com.example.entity.Login;
import com.example.entity.Person;
import com.example.entity.Role;
import com.example.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository logRepo;

	@Override
	public Login login(Login login) {
		Optional<Login> Log=logRepo.findById(login.getEmail());
		if(Log.isPresent())
		{
			Login log=Log.get();
			if(log.getPassword().equals(login.getPassword()) && log.getRole().equals(login.getRole()))
				log.setLoggedin(true);
			return logRepo.save(log);
		}
		else
			return null;
	}

	@Override
	public Login logout(String email) {
		Optional<Login> Log=logRepo.findById(email);
		if(Log.isPresent())
		{
			Login log=Log.get();
			log.setLoggedin(false);
			return logRepo.save(log);
		}
		else
			return null;
	}

	@Override
	public List<Person> findByRole(Role role) {
		return logRepo.findByRole(role);
	}

	@Override
	public LoginOutputDto loginDto(LoginInputDto logInDto) {
		Login log=new Login();
		log.setEmail(logInDto.getEmail());
		log.setPassword(logInDto.getPassword());
		log.setRole(logInDto.getRole());
		log.setLoggedin(true);
		
		LoginOutputDto logOutDto=new LoginOutputDto();
		logOutDto.setEmail(log.getEmail());
		logOutDto.setLoggedIn(log.isLoggedin());
		logOutDto.setRole(log.getRole());
		return logOutDto;
	}
	
	

}
