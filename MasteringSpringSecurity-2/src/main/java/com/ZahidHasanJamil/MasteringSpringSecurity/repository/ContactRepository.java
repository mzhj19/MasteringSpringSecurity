package com.ZahidHasanJamil.MasteringSpringSecurity.repository;

import com.ZahidHasanJamil.MasteringSpringSecurity.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
