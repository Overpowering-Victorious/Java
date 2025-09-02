package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Login;
import com.example.entity.Person;
import com.example.entity.Role;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

	List<Person> findByRole(Role role);
}
