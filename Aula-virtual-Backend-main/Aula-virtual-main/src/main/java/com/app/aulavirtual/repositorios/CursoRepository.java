package com.app.aulavirtual.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.aulavirtual.entidades.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query("SELECT DISTINCT c FROM Curso c"
     + " LEFT JOIN c.estudiantes e LEFT JOIN e.persona pe LEFT JOIN pe.usuario ue"
     + " LEFT JOIN c.profesor p LEFT JOIN p.persona pp LEFT JOIN pp.usuario up"
     + " WHERE ue.username = :usuario OR up.username = :usuario")
    List<Curso> listarCursosPorUsuario(@Param("usuario") String usuario);

    //Query editada para listar los cursos asociados a un usuario específico, ya sea como estudiante o como profesor. La consulta utiliza LEFT JOIN para unir las entidades relacionadas y filtra los resultados por el nombre de usuario proporcionado como parámetro.

}
