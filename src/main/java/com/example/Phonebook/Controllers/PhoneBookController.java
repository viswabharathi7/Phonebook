package com.example.Phonebook.Controllers;

import com.example.Phonebook.Repository.PhonebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PhoneBookController {
    @Autowired
    private PhonebookRepository phonebookRepository;

}
