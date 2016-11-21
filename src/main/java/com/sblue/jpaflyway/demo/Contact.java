package com.sblue.jpaflyway.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name="contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contactId;
	private String surname;
	
	
	
	public static Contact factory(ContactRequest request){
		 return Contact.builder()
				 		.surname(request.getSurname())
				 		.build();
	}
}
