package com.app.aulavirtual.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import com.app.aulavirtual.dto.CursoDto;
import com.app.aulavirtual.entidades.Curso;

@Mapper
public interface CursoMapper {
    CursoDto entityToDto(Curso curso);
    List<CursoDto> entityListToDtoList(List<Curso> cursos);
}

//Archivo editado para mapear la entidad Curso a su correspondiente DTO (Data Transfer Object) utilizando MapStruct. Este archivo contiene los métodos entityToDto y entityListToDtoList para convertir un objeto Curso y una lista de objetos Curso a sus respectivos DTOs.