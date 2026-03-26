package miguel.Servicio;

import java.util.List;
import java.util.UUID;

import miguel.DTO.CarreraDTO;
import miguel.DTO.EscuelaCarrerasDTO;


// Interfaz de servicio encargada de definir las operaciones de negocio relacionadas con las carreras.
public interface CarreraServicio {

    // Método que obtiene todas las carreras registradas en la base de datos y las devuelve como una lista de DTO
    List<CarreraDTO> listarTodas();

    // Método que guarda una nueva carrera en la base de datos a partir de un objeto DTO
    void guardar(CarreraDTO dto);

    // Método que busca una carrera por su identificador único (UUID) y retorna su DTO
    CarreraDTO buscarPorId(UUID id);

    

    // Método que devuelve una lista de carreras agrupadas por escuela en forma de DTO
    List<EscuelaCarrerasDTO> listarCarrerasAgrupadasPorEscuela();
            
}