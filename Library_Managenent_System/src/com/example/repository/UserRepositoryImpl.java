package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.User;

public class UserRepositoryImpl implements UserRepository {
	
	List<User>users=new ArrayList<>();

	@Override
	public void add(User u) {
		users.add(u);
	}

	@Override
	public boolean delete(Object ob) {
		if(ob instanceof Integer)
			return deleteUserById(ob);
		else if(ob instanceof String)
			return deleteUserByName(ob);
		return false;
	}

	private boolean deleteUserByName(Object ob) {
		String name=(String)ob;
		for(User u: users)
		{
			if(u.getFullName()==name)
			{
				users.remove(u);
				return true;
			}
		}
		return false;
	}

	private boolean deleteUserById(Object ob) {
		Integer id=(Integer)ob;
		for(User u: users)
		{
			if(u.getId()==id)
			{
				users.remove(u);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update_book(User u) {
		for(User e: users)
		{
			if(e.getId()==u.getId())
			{
				if(u.getFullName()!=null)
					e.setUsername(u.getUsername());
				if(u.getEmail()!=null)
					e.setEmail(u.getEmail());
				if(u.getUsername()!=null)
					e.setUsername(u.getUsername());
				if(u.getContactNo()!=null)
					e.setContactNo(u.getContactNo());
				if(u.getDob()!=null)
					e.setDob(u.getDob());
				if(u.getPassword()!=null)
					e.setPassword(u.getPassword());
				if(u.getRole()!=null)
					e.setRole(u.getRole());
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> list(Object ob) {
		if(ob instanceof String)
		{
			List<User> tmp=new ArrayList<>();
			String name=(String)ob;
			for(User u: users)
			{
				if(u.getFullName()==name)
					tmp.add(u);
			}
			return tmp;
		}
		else if(ob==null)
			return users;
		return null;
		
	}

}
