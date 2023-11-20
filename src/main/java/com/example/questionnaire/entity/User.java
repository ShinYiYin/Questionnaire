package com.example.questionnaire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Column(name = "name")
	private String name;
	
	@Id
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "qn_Id")
	private int qnId;
	
	@Column(name = "q_Id")
	private int qId;
	
	@Column(name = "ans")
	private String ans;
	
	
}
