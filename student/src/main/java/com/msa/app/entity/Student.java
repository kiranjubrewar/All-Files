package com.msa.app.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rollNo;
	private String name;
	private String gender;
	private int age;
	private long coll_id;
	
	public long getId() {
		return rollNo;
	}
	public void setId(long id) {
		this.rollNo = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getDept_id() {
		return coll_id;
	}
	public void setDept_id(long coll_id) {
		this.coll_id = coll_id;
	}
	
	public Student(String name, String gender, int age, long coll_id) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.coll_id = coll_id;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + rollNo + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", dept_id=" + coll_id + "]";
	}
	
	
}

