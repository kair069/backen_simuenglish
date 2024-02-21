package com.example.contactanos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

}
