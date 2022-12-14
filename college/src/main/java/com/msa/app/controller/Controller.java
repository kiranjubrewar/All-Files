package com.msa.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msa.app.entity.College;
import com.msa.app.service.CollegeService;
import com.msa.app.vo.RequestTemplate;


@RestController
@RequestMapping("/college")
public class Controller {
	
	@Autowired
	CollegeService collService;
	
	@PostMapping
	public College add(@RequestBody College coll)
	{
		return collService.add(coll);
	}
	
	@GetMapping
	public List<College> list()
	{
		return collService.list();
	}
	
	@GetMapping("/{id}")
	public College searchById(@PathVariable long id)
	{
		return collService.searchById(id);
	}
	
	@GetMapping("/all-college-student")
	public List<RequestTemplate> listWithStu()
	{
		return collService.listWithStu();
	}
	
	@GetMapping("/college-with-student/{coll_id}")
	public RequestTemplate specificCollStu(@PathVariable long coll_id)
	{
		return collService.specificCollStudent(coll_id);
	}
	
	
}








