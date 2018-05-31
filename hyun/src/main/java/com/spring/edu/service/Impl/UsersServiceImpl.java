package com.spring.edu.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.edu.dao.Impl.UsersDaoImpl;
import com.spring.edu.service.UsersService;
import com.spring.edu.vo.UsersVo;
import com.spring.edu.vo.form.UsersForm;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDaoImpl dao;
	
	@Override
	public int usersInsert(UsersForm usersVo) {
		return dao.usersInsert(usersVo);
	}

	@Override
	public List<UsersVo> userList() {
		return dao.usersList();
	}

	
}
