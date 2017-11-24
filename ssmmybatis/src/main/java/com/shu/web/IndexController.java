package com.shu.web;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shu.bean.User;
import com.shu.mapper.IUserMapper;

@Controller
public class IndexController {

	@Autowired
	private IUserMapper iUserMapper;

	@RequestMapping("/index")
	public String index(Model model) {
		List<User> users = iUserMapper.finduser();
		model.addAttribute("users", users);
		
		return "index";
	}

}
