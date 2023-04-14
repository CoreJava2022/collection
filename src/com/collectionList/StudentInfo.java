package com.collectionList;

import java.util.Objects;

public class StudentInfo {

	private int rollNo;
	
	private String name;
	
	
	public StudentInfo() {
		
	}

	public StudentInfo(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInfo other = (StudentInfo) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}

	@Override
	public String toString() {
		return "StudentInfo [rollNo=" + rollNo + ", name=" + name + "]";
	}

	

	
	
	
	
}
