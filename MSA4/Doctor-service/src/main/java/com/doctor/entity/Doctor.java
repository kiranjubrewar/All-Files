package com.doctor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	@GeneratedValue
	private Long doctorId;
	private String doctorName;
	private Integer doctorAge;
	private String doctorGender;
	private Long numberOfPatientAttneded;
	private String doctorSpecialist;
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Integer getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(Integer doctorAge) {
		this.doctorAge = doctorAge;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public Long getNumberOfPatientAttneded() {
		return numberOfPatientAttneded;
	}
	public void setNumberOfPatientAttneded(Long numberOfPatientAttneded) {
		this.numberOfPatientAttneded = numberOfPatientAttneded;
	}
	public String getDoctorSpecialist() {
		return doctorSpecialist;
	}
	public void setDoctorSpecialist(String doctorSpecialist) {
		this.doctorSpecialist = doctorSpecialist;
	}
	public Doctor(Long doctorId, String doctorName, Integer doctorAge, String doctorGender,
			Long numberOfPatientAttneded, String doctorSpecialist) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.numberOfPatientAttneded = numberOfPatientAttneded;
		this.doctorSpecialist = doctorSpecialist;
	}
	public Doctor() {
		super();
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge
				+ ", doctorGender=" + doctorGender + ", numberOfPatientAttneded=" + numberOfPatientAttneded
				+ ", doctorSpecialist=" + doctorSpecialist + "]";
	}
	
	

	

}
