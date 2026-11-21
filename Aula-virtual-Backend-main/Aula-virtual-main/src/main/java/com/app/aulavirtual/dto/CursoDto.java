package com.app.aulavirtual.dto;

import java.util.List;
import lombok.Data;

@Data
public class CursoDto {
    private Long id;
    private String nombre;
    private String codigo;
    private List<EstudianteDto> estudiantes;
    private ProfesorDto profesor;
}

//Archivo editado para representar la entidad Curso en formato DTO (Data Transfer Object). Este archivo contiene los atributos id, nombre, codigo, estudiantes y profesor, junto con sus respectivos métodos getter y setter generados automáticamente por la anotación @Data de Lombok.

