package com.sblue.jpaflyway.demo;

import java.util.List;
import java.util.Optional;


public interface ContactRepositoryCustom{

	Optional<List<Contact>> getContacts();
	Optional<List<CustomContact>> getCustomContacts();

}
