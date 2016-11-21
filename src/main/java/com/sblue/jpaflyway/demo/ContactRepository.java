package com.sblue.jpaflyway.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact, Long>, ContactRepositoryCustom {
}
