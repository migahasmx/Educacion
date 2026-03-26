package miguel.Servicio;

import java.util.List;
import java.util.UUID;

import miguel.DTO.ProfesorDTO;

public interface ProfesorServicio {

    List<ProfesorDTO> listarTodos(); // Método para obtener una lista de todos los profesores

    ProfesorDTO buscarPorId(UUID id); // Método para buscar un profesor específico mediante su identificador único

    ProfesorDTO guardar(ProfesorDTO dto); // Método para guardar un nuevo profesor o actualizar uno existente

}