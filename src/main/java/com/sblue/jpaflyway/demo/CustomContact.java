package com.sblue.jpaflyway.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
//this entity has no matching table. It is being utilized by a stored procedure call
public class CustomContact {

	@Id @GeneratedValue
	private Long contactId;
	private String surname;
}
