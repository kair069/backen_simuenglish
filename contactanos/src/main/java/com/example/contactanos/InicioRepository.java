package com.example.contactanos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InicioRepository extends JpaRepository<InicioEntidad,Long> {
}
