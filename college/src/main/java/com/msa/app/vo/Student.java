package com.msa.app.vo;


public class Student {
		private long rollNo;
		private String name;
		private String gender;
		private int age;
		private long coll_id;
		
		public long getId() {
			return rollNo;
		}
		public void setId(long id) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
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
}
