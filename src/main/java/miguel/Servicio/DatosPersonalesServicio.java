package miguel.Servicio;

import java.util.List;
import java.util.UUID;

import miguel.DTO.DatosPersonalesDTO;

public interface DatosPersonalesServicio {

    List<DatosPersonalesDTO> listarTodos(); // Método para obtener una lista de todos los datos personales

    DatosPersonalesDTO buscarPorId(UUID id); // Método para buscar un registro de datos personales por su identificador único

    DatosPersonalesDTO guardar(DatosPersonalesDTO dto); // Método para guardar un nuevo registro de datos personales

    DatosPersonalesDTO actualizar(UUID id, DatosPersonalesDTO dto); // Método para actualizar un registro existente de datos personales usando su ID

    void eliminar(UUID id); // Método para eliminar un registro de datos personales por su identificador único

}