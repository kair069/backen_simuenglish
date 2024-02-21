package com.example.contactanos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inicio")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class InicioController {

    private final InicioService inicioService;

    @Autowired
    public InicioController(InicioService inicioService) {this.inicioService = inicioService;}

    @PostMapping("/submit")
    public ResponseEntity<String> submitInicioForm(@RequestBody InicioEntidad inicioEntidad){
        InicioEntidad submitInicioForm = inicioService.guardarInicioForm(inicioEntidad);
        return ResponseEntity.ok("!gracias por enviar tu mensaje");
    }




}
