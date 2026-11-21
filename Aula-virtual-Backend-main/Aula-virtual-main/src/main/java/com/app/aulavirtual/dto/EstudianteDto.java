package com.app.aulavirtual.dto;

import lombok.Data;

@Data
public class EstudianteDto {
    private Long id;
    private Double codigo;
    private PersonaDto persona;
}

//Archivo editado para representar la entidad Estudiante en formato DTO (Data Transfer Object). Este archivo contiene los atributos id, codigo y persona, junto con sus respectivos métodos getter y setter generados automáticamente por la anotación @Data de Lombok.
