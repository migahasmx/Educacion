package miguel.Servicio;

import java.util.List;
import java.util.UUID;
import miguel.Entidad.EntidadCurso;

public interface CursoServicio {

    EntidadCurso guardarCurso(EntidadCurso curso); // Método para guardar un curso en el sistema

    List<EntidadCurso> obtenerTodosLosCursos(); // Método para obtener la lista de todos los cursos registrados

    EntidadCurso obtenerCursoPorId(UUID id); // Método para buscar y obtener un curso específico por su identificador único

    void eliminarCurso(UUID id); // Método para eliminar un curso del sistema utilizando su identificador
}