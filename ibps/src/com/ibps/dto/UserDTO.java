package com.ibps.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name = "user_master")
public class UserDTO implements Serializable {
	private int id;
	private String studentName;
	private String password;
	private String mobileNo;
	private String userName;
	private int usertype;
	
	@Id
	@Column(name = "id")
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_master_seq_gen")
	@SequenceGenerator(
		name="user_master_seq_gen",
		sequenceName="user_master_seqs",
		allocationSize=1
	)*/    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="student_name")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String firstName) {
		this.studentName = firstName;
	}
		@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="phone_number")
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
		@Column(name="student_id")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="user_type_id")
	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + studentName +  ", password=" + password
				+ ", mobileNo=" + mobileNo + ", userName=" + userName + ", usertype="
				+ usertype + "]";
	}

	

	
	

}
