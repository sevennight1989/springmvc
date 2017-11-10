package com.tgb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tgb.dto.UserDTO;
import com.tgb.model.User;
import com.tgb.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 获取所有用户列表
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllUser")
	public ModelMap getAllUser(){
		ModelMap map = new ModelMap();
		try{
			List<UserDTO> findAll = userService.findAll();
			map.put("user", findAll);
			map.put("code", "0");
			map.put("message", "请求成功");
		}catch (Exception e) {
			map.put("code", "1");
			map.put("message", "请求失败");
			System.out.println(e.getMessage());
		}

		return map;
	}
	
	/**
	 * 跳转到添加用户界面
	 * @param request
	 * @return
	 */
	@RequestMapping("/toAddUser")
	public String toAddUser(HttpServletRequest request){
		
		return "/addUser";
	}
	/**
	 * 添加用户并重定向
	 * @param user
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addUser")
	public ModelMap addUser(String name,String age){
		ModelMap map = new ModelMap();
		try{
			System.out.println("### user_name = " + name +"   user_age = " + age);
			User user = new User();
			user.setUserName(name);
			user.setAge(age);
			userService.save(user);
			map.put("code", "0");
			map.put("message", "请求成功");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			map.put("code", "1");
			map.put("message", "请求失败");
		}
		return map;
	}
	
	/**
	 *编辑用户
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/updateUser")
	public String updateUser(User user,HttpServletRequest request){
		
		
//		if(userService.update(user)){
//			user = userService.findById(user.getId());
//			request.setAttribute("user", user);
//			return "redirect:/user/getAllUser";
//		}else{
//			return "/error";
//		}
		return "";
	}
	/**
	 * 根据id查询单个用户
	 * @param id
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getUser")
	public ModelMap getUser(int id){
		System.out.println("#### id = " + id);
		ModelMap map = new ModelMap();
		try{
			UserDTO userDTO = userService.findById(id);
			map.put("code", "0");
			if(userDTO!=null){
				map.put("message", "请求成功");
				map.put("user",userDTO);
			}else{
				map.put("message", "查不到用户信息");
			}
		}catch (Exception e) {
			map.put("code", "1");
			map.put("message", "请求失败");
			System.out.println(e.getMessage());
		}

		return map;
	}
	/**
	 * 删除用户
	 * @param id
	 * @param request
	 * @param response
	 */
	@RequestMapping("/delUser")
	public void delUser(int id,HttpServletRequest request,HttpServletResponse response){
		String result = "{\"result\":\"error\"}";
		
		if(userService.delete(id)){
			result = "{\"result\":\"success\"}";
		}
		
		response.setContentType("application/json");
		
		try {
			PrintWriter out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
