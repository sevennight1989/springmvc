package com.tgb.mapper;

import java.util.List;

import com.tgb.dto.UserDTO;
import com.tgb.model.User;

public interface UserMapper {

	void save(User user);
	boolean update(User user);
	boolean delete(int id);
	UserDTO findById(int id);
	List<UserDTO> findAll();
}
