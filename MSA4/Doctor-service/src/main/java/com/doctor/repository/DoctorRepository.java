package com.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	Doctor findByDoctorName(String doctorName);
	Doctor findByDoctorNameIgnoreCase(String doctorName);

}
