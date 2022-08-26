package com.msa.app.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.msa.app.entity.College;
import com.msa.app.vo.RequestTemplate;


@Service
public interface CollegeService {
	College add(College coll);
	List<College> list();
	College update(long id,String name);
	College searchById(long id);
	List<RequestTemplate> listWithStu();
	RequestTemplate specificCollStudent(long coll_id);
}
