package com.staragile.healtcare;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Health {
	
	@Id
	String doctorRegNo;
	String doctorName;
	String doctorAddress;
	String doctorMobNo;
	public String getDoctorRegNo() {
		return doctorRegNo;
	}
	public void setDoctorRegNo(String doctorRegNo) {
		this.doctorRegNo = doctorRegNo;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorAddress() {
		return doctorAddress;
	}
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	public String getDoctorMobNo() {
		return doctorMobNo;
	}
	public void setDoctorMobNo(String doctorMobNo) {
		this.doctorMobNo = doctorMobNo;
	}
	public Health(String doctorRegNo, String doctorName, String doctorAddress, String doctorMobNo) {
		super();
		this.doctorRegNo = doctorRegNo;
		this.doctorName = doctorName;
		this.doctorAddress = doctorAddress;
		this.doctorMobNo = doctorMobNo;
	}
	public Health() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
