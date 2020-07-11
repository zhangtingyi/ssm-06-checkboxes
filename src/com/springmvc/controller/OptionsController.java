package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entity.Options;

@Controller
public class OptionsController {
	@RequestMapping(value="/checkboxes",method=RequestMethod.GET)
	public String registerForm(Model model){
		Options options = new Options();
		//为集合options添加“选项1”和“选项4”
		List<String> list = new ArrayList<String>();
		list.add("选项1");
		list.add("选项4");
		options.setOptions(list);
		//页面展现的可供选择的复选框内容optionsList
		List<String> optionsList = new ArrayList<String>();
		optionsList.add("选项1");
		optionsList.add("选项2");
		optionsList.add("选项3");
		optionsList.add("选项4");
		//model中添加user和optionsList
		model.addAttribute("options", options);
		model.addAttribute("optionsList",optionsList);
		return "checkboxes";
	}
}

