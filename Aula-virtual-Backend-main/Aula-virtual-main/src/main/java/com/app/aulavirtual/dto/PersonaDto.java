package com.app.aulavirtual.dto;

import lombok.Data;

@Data
public class PersonaDto {
    private Long id;
    private String nombres;
    private String apellidos;
    private String identificacion;
}

//Nuevo archivo agregado para representar la entidad Persona en formato DTO (Data Transfer Object). Este archivo contiene los atributos id, nombres, apellidos e identificacion, junto con sus respectivos métodos getter y setter generados automáticamente por la anotación @Data de Lombok.
