package com.example.contactanos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class ContactController {
    private final ContactFormService contactFormService;

    @Autowired
    public ContactController(ContactFormService contactFormService) {
        this.contactFormService = contactFormService;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitContactForm(@RequestBody ContactForm contactForm) {
        ContactForm savedContactForm = contactFormService.saveContactForm(contactForm);
        // Puedes realizar más acciones si es necesario

        return ResponseEntity.ok("¡Gracias por enviar tu mensaje! Nos pondremos en contacto contigo pronto.");
    }
}
