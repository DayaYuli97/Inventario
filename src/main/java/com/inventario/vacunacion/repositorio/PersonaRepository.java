package com.inventario.vacunacion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.vacunacion.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
