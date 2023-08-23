package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.EmployeeService;
@RestController
public class Control {
	@Autowired
	EmployeeService eser;
	@PostMapping("addemp")
	public Model add(@RequestBody Model em)
	{
		return eser.saveinfo(em);
	}
	@GetMapping("showemp")
	public List<Model> show()
	{
		return eser.showinfo();
	}

}
