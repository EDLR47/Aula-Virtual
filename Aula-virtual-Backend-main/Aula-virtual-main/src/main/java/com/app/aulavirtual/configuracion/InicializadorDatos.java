package com.app.aulavirtual.configuracion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.app.aulavirtual.entidades.Curso;
import com.app.aulavirtual.entidades.Estudiante;
import com.app.aulavirtual.entidades.Persona;
import com.app.aulavirtual.entidades.Profesor;
import com.app.aulavirtual.entidades.Rol;
import com.app.aulavirtual.entidades.User;
import com.app.aulavirtual.repositorios.CursoRepository;
import com.app.aulavirtual.repositorios.EstudianteRepository;
import com.app.aulavirtual.repositorios.PersonaRepository;
import com.app.aulavirtual.repositorios.ProfesorRepository;
import com.app.aulavirtual.repositorios.RolRepository;
import com.app.aulavirtual.repositorios.UserRepository;

@Configuration
public class InicializadorDatos {

    @Bean
    CommandLineRunner inicializarBaseDatos(
            UserRepository usuRepository,
            PasswordEncoder passwordEncoder,
            PersonaRepository personaRepository,
            RolRepository rolRepository,
            ProfesorRepository profesorRepository,
            EstudianteRepository estudianteRepository,
            CursoRepository cursoRepository) {

        return arg -> {

            if (usuRepository.findByUsername("cdzapata").isEmpty()) {

                // --- Usuario administrador: cdzapata ---
                Rol rolAdmin = rolRepository.findByNombre("ADMIN").orElseGet(
                        () -> rolRepository.save(new Rol(null, "ADMIN", null)));

                Persona persona = personaRepository
                        .save(new Persona(null, "Cristian", "Zapata", "1111", null));

                usuRepository.save(new User(null, "cdzapata",
                        passwordEncoder.encode("12345"), List.of(rolAdmin), persona));

                Profesor profesor = profesorRepository
                        .save(new Profesor(null, persona, null));

                // --- Curso: Programación ---
                Curso curso = cursoRepository
                        .save(new Curso(null, "Programación", "PRG101", null, profesor));

                // --- Usuario estudiante: ana ---
                Rol rolEstudiante = rolRepository.findByNombre("ESTUDIANTE").orElseGet(
                        () -> rolRepository.save(new Rol(null, "ESTUDIANTE", null)));

                Persona personaAna = personaRepository
                        .save(new Persona(null, "Ana", "Pérez", "2222", null));

                usuRepository.save(new User(null, "ana",
                        passwordEncoder.encode("12345"), List.of(rolEstudiante), personaAna));

                estudianteRepository.save(new Estudiante(null, 1001.0, personaAna,
                        new ArrayList<>(List.of(curso))));
            }
        };
    }
}
