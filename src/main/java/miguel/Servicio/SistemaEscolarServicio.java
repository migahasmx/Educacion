package miguel.Servicio;

import java.util.List;
import java.util.UUID;

import miguel.DTO.SistemaEscolarDTO;

public interface SistemaEscolarServicio { // Interfaz que define las operaciones del servicio para el sistema escolar

    List<SistemaEscolarDTO> listarTodos(); // Método para obtener una lista de todos los sistemas escolares registrados

    SistemaEscolarDTO buscarPorId(UUID id); // Método para buscar un sistema escolar específico utilizando su identificador único (UUID)

    SistemaEscolarDTO guardar(SistemaEscolarDTO dto); // Método para guardar un nuevo sistema escolar o actualizar uno existente a partir de un DTO
    
}