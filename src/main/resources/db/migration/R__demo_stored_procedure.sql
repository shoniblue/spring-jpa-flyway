DROP PROCEDURE IF EXISTS get_contacts()
DELIMITER $$
CREATE PROCEDURE get_contacts()
                        
    BEGIN
      SELECT contact_id, surname FROM contacts;
    END $$

  LANGUAGE plpgsql
  
  DELIMITER ;
  
DROP PROCEDURE IF EXISTS get_contact();
DELIMITER $$
CREATE PROCEDURE get_contact(IN arg bigint, OUT res varchar)
                        
    BEGIN
      SELECT surname FROM contacts where contact_id=arg;
    END $$

  LANGUAGE plpgsql
  
  DELIMITER ;
  