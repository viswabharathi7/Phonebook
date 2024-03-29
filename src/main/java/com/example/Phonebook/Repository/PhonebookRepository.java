package com.example.Phonebook.Repository;

import com.example.Phonebook.Models.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhonebookRepository extends JpaRepository<Contacts, Long> {
}
