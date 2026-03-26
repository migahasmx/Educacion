package miguel.Servicio;

import java.util.List;
import java.util.UUID;

import miguel.DTO.EscuelaDTO;

// Interfaz que define las operaciones de negocio relacionadas con la entidad Escuela
public interface EscuelaServicio {

    List<EscuelaDTO> listarTodas(); // Método para obtener una lista de todas las escuelas registradas

    EscuelaDTO buscarPorId(UUID id); // Método para buscar una escuela específica mediante su identificador único (UUID)

    EscuelaDTO guardar(EscuelaDTO dto); // Método para guardar una nueva escuela a partir de un objeto DTO

    EscuelaDTO actualizar(UUID id, EscuelaDTO dto); // Método para actualizar los datos de una escuela existente usando su ID

    void eliminar(UUID id); // Método para eliminar una escuela existente mediante su identificador único

}