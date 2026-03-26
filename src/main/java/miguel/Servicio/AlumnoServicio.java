package miguel.Servicio;

import java.util.List;
import java.util.UUID;

import miguel.DTO.AlumnoDTO;

public interface AlumnoServicio { // Interfaz que define los métodos del servicio para manejar alumnos
    List<AlumnoDTO> listarTodos(); // Método para obtener una lista de todos los alumnos
    AlumnoDTO buscarPorId(UUID id); // Método para buscar un alumno por su identificador único
    AlumnoDTO guardar(AlumnoDTO dto); // Método para guardar un nuevo alumno a partir de un DTO
    
}