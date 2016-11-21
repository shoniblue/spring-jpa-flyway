CREATE TABLE demo.contacts ( 
	contact_id           bigint  NOT NULL  AUTO_INCREMENT,
	surname              varchar(100)    ,
	CONSTRAINT pk_contacts PRIMARY KEY ( contact_id )
 ) engine=InnoDB;
