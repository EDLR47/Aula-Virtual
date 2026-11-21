package com.app.aulavirtual.dto;

import lombok.Data;

@Data
public class ProfesorDto {
    private Long id;
    private PersonaDto persona;
}

//Nuevo archivo agregado para representar la entidad Profesor en formato DTO (Data Transfer Object). Este archivo contiene los atributos id y persona, junto con sus respectivos métodos getter y setter generados automáticamente por la anotación @Data de Lombok.
