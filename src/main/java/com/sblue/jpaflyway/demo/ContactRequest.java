package com.sblue.jpaflyway.demo;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class ContactRequest {
	
	@NotBlank
	private String surname;
}
