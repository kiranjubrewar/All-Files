package com.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.entity.Doctor;
import com.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins="*")
public class DoctorController {
//	@GetMapping("/")
//	public String hello() {
//		return "helloworld";
//	}
	@Autowired
	private DoctorService doctorservice;
	
	@PostMapping("/doctors")
	public String registerDoctor(@RequestBody Doctor doctor) {
		return doctorservice.registerDoctor(doctor);
	}
	
	@GetMapping("/")
	public List<Doctor> findAllDoctor(){
		return doctorservice.findAll();
	}
	
	@GetMapping("/doctorid/{doctorId}")
	public Doctor findDoctorById(@PathVariable("doctorId") Long doctorId) {
		return doctorservice.findDoctorById(doctorId);
	}
	
	@GetMapping("/doctorname/{doctorName}")
	public Doctor findDoctorByName(@PathVariable("doctorId") String doctorName) {
		return doctorservice.findDoctorByName(doctorName);
	}
	
	@PutMapping("/id/{id}")
	public Doctor updateDoctor(@PathVariable("id") Long doctorId,@RequestBody Doctor doctor) {
		return doctorservice.updateDoctor(doctorId, doctor);
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Doctor> deleteDoctorById(@PathVariable("id") Long doctorId) {
		return doctorservice.deleteDoctorById(doctorId);
	}
	
	
}
