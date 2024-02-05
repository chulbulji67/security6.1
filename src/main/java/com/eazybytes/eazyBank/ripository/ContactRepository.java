package com.eazybytes.eazyBank.ripository;

import com.eazybytes.eazyBank.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
