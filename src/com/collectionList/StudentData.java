package com.collectionList;

import java.util.Objects;

public class StudentData {

	private int rollNo;
	private String name;
	private String email;

	public StudentData(int rollNo, String name, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}
	
	public StudentData() {
		// TODO Auto-generated constructor stub
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentData [rollNo=" + rollNo + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentData other = (StudentData) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
	
	
}
