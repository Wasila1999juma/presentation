package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.UserService.UserService;
import com.example.demo.model.Asset;
import com.example.demo.model.User;
import com.example.demo.service.AssetService;



@org.springframework.stereotype.Controller
public class Controller {
	@Autowired private UserService userService;
	@Autowired private AssetService assetService;
	
	
	@GetMapping("/viewuser")
	public String viewuser(Model model) {
		model.addAttribute("listuser",userService.getAlluser());
	
		return "view";
	}
	
	
	
	@GetMapping("/suza")
	public String user(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		return "user";
	}
	
	
	@GetMapping("/saveuser")
	public String saveuser(@ModelAttribute("user") User user) {
    userService.saveUser(user);
	return "redirect:/login";
	}
	
	
	
	@GetMapping("/registration")
	public String regisration() {
		return "REGISTRATION.FORM"; 
	}
	@GetMapping("/wasila")
	public String dashbord() {
		return "dashboard";
	}

	
	@GetMapping("/login")
	public String login() {
		return "student";
	}
	@GetMapping("/index")
	public String get() {
		return "index";
	}
    @GetMapping("/admin")
    public String damage() {
    	return "adminDashbord";
    }
    
    @GetMapping("/student")
    public String damagee() {
    	return "studdashbord";
    }
    @GetMapping("/View")
    public String user() {
    	return "view";
    }
    
    
    
	/*
	 * @GetMapping("/servicee") public String serverr(Model model) { Asset asset =
	 * new Asset(); model.addAttribute("asset",asset); return "service";
	 * 
	 * 
	 * }
	 */
    
    @GetMapping("/about")
    public String html() {
    	return "about";
    }
    
    

    @GetMapping("/css")
    public String set() {
    	return "css";
    	
     }
    
    
    
    @GetMapping("/Asset")
    public String view(Model model) {
    	Asset asset=new Asset();
    	model.addAttribute("asset",asset);
    	return "Assets";
    }
    @GetMapping("/saveAsset")
    public String saveAsset(@ModelAttribute("asset") Asset asset) {
    	assetService.saveAsset(asset);
    	return "redirect:/Asset";
    }
    
    
}

    
        
    	
    
    
    
