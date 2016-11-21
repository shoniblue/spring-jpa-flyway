package com.sblue.jpaflyway.demo.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sblue.jpaflyway.demo.Contact;
import com.sblue.jpaflyway.demo.ContactRepository;
import com.sblue.jpaflyway.demo.ContactRequest;
import com.sblue.jpaflyway.demo.CustomContact;

@Transactional
@RestController
public class DemoResource {

	@Autowired
	ContactRepository contactRepositoryImpl;
	
	@GetMapping("/contacts")
	@ResponseStatus(value=HttpStatus.OK)
	public List<Contact> get(){		
		Optional<List<Contact>> contacts = contactRepositoryImpl.getContacts();
		if(contacts.isPresent()){
			return contacts.get();
		}
		return null;
	}
	
	@GetMapping("/customContacts")
	@ResponseStatus(value=HttpStatus.OK)
	public List<CustomContact> search(){		
		Optional<List<CustomContact>> contacts = contactRepositoryImpl.getCustomContacts();
		if(contacts.isPresent()){
			return contacts.get();
		}
		return null;
	}
	
	@PostMapping(path="/contacts")
	public ResponseEntity createContact(@RequestBody @Valid ContactRequest request, HttpServletResponse response) throws Exception{
		Contact contact = contactRepositoryImpl.saveAndFlush(Contact.factory(request));

		return ResponseEntity.created(new URI(contact.getContactId().toString())).build();
	}

}
