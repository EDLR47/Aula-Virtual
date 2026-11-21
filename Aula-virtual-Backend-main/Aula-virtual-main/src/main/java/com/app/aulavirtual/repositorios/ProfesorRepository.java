package com.app.aulavirtual.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.aulavirtual.entidades.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {}

//Archivo creado para definir el repositorio de la entidad Profesor, extendiendo JpaRepository para proporcionar operaciones CRUD y consultas personalizadas sobre la base de datos.
