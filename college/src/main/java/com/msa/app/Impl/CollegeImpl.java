package com.msa.app.Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.msa.app.entity.College;
import com.msa.app.repository.CollegeRepository;
import com.msa.app.service.CollegeService;
import com.msa.app.vo.RequestTemplate;
import com.msa.app.vo.Student;


@Component
public class CollegeImpl implements CollegeService {

	@Autowired
	CollegeRepository collrepo;
	@Autowired
	RestTemplate restTemplate;
	
	public College add(College coll) {
		return collrepo.save(coll);
	}

	public List<College> list() {
		return collrepo.findAll();
	}

	public College update(long id, String name) {
		College dept = collrepo.findById(id);
		College coll = null;
		coll.setName(name);
		return collrepo.save(coll);
	}

	@Override
	public College searchById(long id) {
		if(collrepo.findById(id)==null)
		{
			return null;
		}
		return collrepo.findById(id);
	}

	@Override
	public List<RequestTemplate> listWithStu() {
		List<RequestTemplate> fullList = new ArrayList<RequestTemplate>();
		List<College> allColl = this.list();
		Iterator<College> ir = allColl.iterator();
		while(ir.hasNext())
		{
			College clg = ir.next();
			ResponseEntity<Student[]> response =
					  restTemplate.getForEntity(
							  "http://STUDENT-SERVICE/student/student-with-ascname/"+clg.getId(),
					  Student[].class);
			Student[] students = response.getBody();
			List<Student> stus = Arrays.asList(students);
 			RequestTemplate RTm = new RequestTemplate();
			RTm.setCollge(clg);
			RTm.setStudentList(stus);
			fullList.add(RTm);
		}
		return fullList;
	}

	public RequestTemplate specificCollStudent(long coll_id) {
		College college  = this.searchById(coll_id);
		
		ResponseEntity<Student[]> response =
				  restTemplate.getForEntity(
						  "http://STUDENT-SERVICE/student/student-with-desc-age/"+college.getId(),
				  Student[].class);
		Student[] student = response.getBody();
		List<Student> students = Arrays.asList(student);
		RequestTemplate requestTemplate = new RequestTemplate();
		
		requestTemplate.setCollge(college);
		requestTemplate.setStudentList(students);
		
		return requestTemplate;
	}

}
