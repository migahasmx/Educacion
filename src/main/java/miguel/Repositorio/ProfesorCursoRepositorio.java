package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import miguel.Entidad.EntidadProfesorCurso;
import miguel.Llaves.LlaveCompuestaProfesorCurso;


import java.util.List;
import java.util.UUID;

// Repositorio JPA para la entidad ProfesorCurso con llave compuesta
public interface ProfesorCursoRepositorio extends JpaRepository<EntidadProfesorCurso, LlaveCompuestaProfesorCurso> {

    // Obtiene una lista de registros Profesor-Curso filtrando por el ID del curso
    List<EntidadProfesorCurso> findByCurso_IdCurso(UUID idCurso);

    // Obtiene una lista de registros Profesor-Curso filtrando por el ID del profesor
    List<EntidadProfesorCurso> findByProfesor_IdProfesor(UUID idProfesor);

    // Verifica si existe una relación entre un profesor y un curso específico
    boolean existsByProfesor_IdProfesorAndCurso_IdCurso(UUID idProfesor, UUID idCurso);
}