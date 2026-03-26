package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import miguel.Entidad.EntidadAlumnoTaller;
import miguel.Llaves.LlaveCompuestaTallerAlumno;

import java.util.List;
import java.util.UUID;

// Repositorio JPA para la entidad AlumnoTaller con llave compuesta
public interface AlumnoTallerRepositorio extends JpaRepository<EntidadAlumnoTaller, LlaveCompuestaTallerAlumno> {

    // Obtiene una lista de registros Alumno-Taller filtrando por el ID del taller
    List<EntidadAlumnoTaller> findByTaller_IdTaller(UUID idTaller);

    // Obtiene una lista de registros Alumno-Taller filtrando por el ID del alumno
    List<EntidadAlumnoTaller> findByAlumno_IdAlumno(UUID idAlumno);

    // Verifica si existe una relación entre un alumno y un taller específico
    boolean existsByAlumno_IdAlumnoAndTaller_IdTaller(UUID idAlumno, UUID idTaller);
}