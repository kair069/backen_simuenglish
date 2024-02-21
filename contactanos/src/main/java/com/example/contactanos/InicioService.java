package com.example.contactanos;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InicioService {

    private final InicioRepository inicioRepository;

    @Autowired
    public InicioService(InicioRepository inicioRepository) {
        this.inicioRepository  = inicioRepository;
    }

    public InicioEntidad guardarInicioForm(InicioEntidad inicioEntidad){
        return inicioRepository.save(inicioEntidad);
    }
}
