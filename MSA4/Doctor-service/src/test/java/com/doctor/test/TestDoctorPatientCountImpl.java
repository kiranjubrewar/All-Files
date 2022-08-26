package com.doctor.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.doctor.DoctorServiceApplication;

public class TestDoctorPatientCountImpl extends DoctorServiceApplication {
	@Test
	public void initialDoctorCount() {
		int doctorCount=0;
		assertEquals(0,doctorCount);
	}
	
	
	@Test
	public void afterDoctorCount() {
		int doctorcount=1;
		assertEquals(1,doctorcount);
	}
    
}
