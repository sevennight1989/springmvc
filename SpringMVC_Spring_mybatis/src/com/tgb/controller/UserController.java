package com.tgb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import com.tgb.model.ProBean;
import com.tgb.model.ResPerson;
import com.tgb.model.User;
import com.tgb.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("getProgress")
	public ModelMap getProgressInfo() {
		ModelMap map = new ModelMap();

		map.put("code", "0");
		map.put("message", "");
		List<ProBean> lProBeans = new ArrayList<ProBean>();
		lProBeans.add(getProBean1());
		lProBeans.add(getProBean2());
		lProBeans.add(getProBean3());
		lProBeans.add(getProBean4());
		lProBeans.add(getProBean5());
		map.put("data", lProBeans);
		return map;
	}

	private ProBean getProBean1() {
		ProBean proBean_1 = new ProBean();
		proBean_1.setTitle("提交申请");
		proBean_1.setApproveComment("同意");
		proBean_1.setOperaTime("2017-0511 11:21.02");
		List<ResPerson> list1 = new ArrayList<ResPerson>();
		ResPerson p1 = new ResPerson();
		p1.setName("张三");
		p1.setPhone("18913847525");
		list1.add(p1);
		ResPerson p2 = new ResPerson();
		p2.setName("李四");
		p2.setPhone("13813851421");
		list1.add(p2);
		ResPerson p3 = new ResPerson();
		p3.setName("王五");
		p3.setPhone("13851244458");
		list1.add(p3);
		proBean_1.setResPersons(list1);
		proBean_1.setMStatus("0");
		return proBean_1;
	}
	
	private ProBean getProBean2() {
		ProBean proBean_1 = new ProBean();
		proBean_1.setTitle("小组审核");
		proBean_1.setApproveComment("审核中");;
		List<ResPerson> list1 = new ArrayList<ResPerson>();
		ResPerson p1 = new ResPerson();
		p1.setName("赵四");
		p1.setPhone("15385127962");
		list1.add(p1);
		ResPerson p2 = new ResPerson();
		p2.setName("刘能");
		p2.setPhone("147581478965");
		list1.add(p2);
		proBean_1.setResPersons(list1);
		proBean_1.setMStatus("0");
		return proBean_1;
	}
	
	private ProBean getProBean3() {
		ProBean proBean_1 = new ProBean();
		proBean_1.setTitle("部门审核");
		List<ResPerson> list1 = new ArrayList<ResPerson>();
		ResPerson p1 = new ResPerson();
		p1.setName("谢广坤");
		p1.setPhone("18569554122");
		list1.add(p1);
		ResPerson p2 = new ResPerson();
		p2.setName("刘志");
		p2.setPhone("18915745962");
		list1.add(p2);
		proBean_1.setResPersons(list1);
		proBean_1.setMStatus("1");
		return proBean_1;
	}
	
	private ProBean getProBean4() {
		ProBean proBean_1 = new ProBean();
		proBean_1.setTitle("总部审核");
		List<ResPerson> list1 = new ArrayList<ResPerson>();
		ResPerson p1 = new ResPerson();
		p1.setName("刘一水");
		p1.setPhone("18569554122");
		list1.add(p1);
		ResPerson p2 = new ResPerson();
		p2.setName("谢小梅");
		p2.setPhone("18915745962");
		list1.add(p2);
		ResPerson p3 = new ResPerson();
		p3.setName("王大拿");
		p3.setPhone("18915745962");
		list1.add(p3);
		ResPerson p4 = new ResPerson();
		p4.setName("杨小燕");
		p4.setPhone("18915745962");
		list1.add(p4);
		proBean_1.setResPersons(list1);
		proBean_1.setMStatus("1");
		return proBean_1;
	}
	
	private ProBean getProBean5() {
		ProBean proBean_1 = new ProBean();
		proBean_1.setTitle("董事长审核");
		List<ResPerson> list1 = new ArrayList<ResPerson>();
		ResPerson p1 = new ResPerson();
		p1.setName("Tom");
		p1.setPhone("18569554122");
		list1.add(p1);
		ResPerson p2 = new ResPerson();
		p2.setName("Peter");
		p2.setPhone("18915745962");
		list1.add(p2);
		ResPerson p3 = new ResPerson();
		p3.setName("Vettel");
		p3.setPhone("18915745962");
		list1.add(p3);
		proBean_1.setResPersons(list1);
		proBean_1.setMStatus("1");
		return proBean_1;
	}
	
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
