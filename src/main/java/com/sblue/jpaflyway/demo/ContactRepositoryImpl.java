package com.sblue.jpaflyway.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

public class ContactRepositoryImpl implements ContactRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
	
	//Contact is an Entity w/ related table
	@Override
	public Optional<List<Contact>> getContacts() {
		StoredProcedureQuery query = this.em.createStoredProcedureQuery("get_contacts",Contact.class);
		query.execute();
		List<Contact> contacts = (List<Contact>) query.getResultList();
		return Optional.ofNullable(contacts);
	}

	//CustomContact is an Entity w/o related table
	@Override
	public Optional<List<CustomContact>> getCustomContacts() {
		StoredProcedureQuery query = this.em.createStoredProcedureQuery("get_contacts",CustomContact.class);
		query.execute();
		List<CustomContact> contacts = (List<CustomContact>) query.getResultList();
		return Optional.ofNullable(contacts);
	}

}
