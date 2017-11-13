package com.tgb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tgb.dto.ProBeanDTO;
import com.tgb.dto.ResPersonDTO;
import com.tgb.dto.UserDTO;
import com.tgb.mapper.UserMapper;
import com.tgb.model.User;
import com.tgb.service.UserService;



@Service
@Transactional  //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper mapper;

	public boolean delete(int id) {
		
		return mapper.delete(id);
	}

	public List<UserDTO> findAll() {
		List<UserDTO> findAllList = mapper.findAll();
		return findAllList;
	}

	public UserDTO findById(int id) {
		UserDTO user = mapper.findById(id);
		return user;
	}

	public void save(User user) {
		mapper.save(user);
	}

	public boolean update(User user) {
		return mapper.update(user);
	}

	public List<ProBeanDTO> findProBean() {
		return mapper.findProBean();
	}

	public List<ResPersonDTO> findResPerson(String tag) {
		return mapper.findResPerson(tag);
	}
	
	

}
