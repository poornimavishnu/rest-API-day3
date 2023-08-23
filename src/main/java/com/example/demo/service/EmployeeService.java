package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er;
	public Model saveinfo(Model em)
	{
		return er.save(em);
	}
	public List<Model> showinfo()
	{
		return er.findAll();
	}

}
