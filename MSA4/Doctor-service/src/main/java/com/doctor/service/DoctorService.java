package com.doctor.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.entity.Doctor;
import com.doctor.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorrepository;
	
	
	public String registerDoctor(Doctor doctor) {
		doctorrepository.save(doctor);
		return "registration done for Dr."+doctor.getDoctorName()+" was success";
		
	}
	public List<Doctor> findAll(){
		return doctorrepository.findAll();
	}
	public Doctor findDoctorById(Long doctorId) {
		return doctorrepository.findById(doctorId).get();
	}
	public Doctor findDoctorByName(String doctorName) {
		return doctorrepository.findByDoctorNameIgnoreCase(doctorName);
	}
	
   public Doctor updateDoctor(Long doctorId,Doctor doctor) {
	Doctor doc=doctorrepository.findById(doctorId).get();
	if(Objects.nonNull(doctor.getDoctorName()) && !"".equalsIgnoreCase(doctor.getDoctorName())) {
		doc.setDoctorName(doctor.getDoctorName());
	}
	if(Objects.nonNull(doctor.getDoctorAge())) {
		doc.setDoctorAge(doctor.getDoctorAge());
	}
	if(Objects.nonNull(doctor.getDoctorGender())) {
		doc.setDoctorGender(doctor.getDoctorGender());
	}
	if(Objects.nonNull(doctor.getNumberOfPatientAttneded())) {
		doc.setNumberOfPatientAttneded(doctor.getNumberOfPatientAttneded());
	}
	
	
	return doctorrepository.save(doc);
	   
   }
   
   public List<Doctor> deleteDoctorById(Long doctorId){
	   doctorrepository.deleteById(doctorId);
	   System.out.println("Doctor Deleted Successfully");
	   return doctorrepository.findAll();
   }
}
