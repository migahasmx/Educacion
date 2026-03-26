package miguel.Servicio;

import java.util.List;
import java.util.UUID;
import miguel.DTO.MateriaDTO;

public interface MateriaServicio {

    List<MateriaDTO> listarTodas(); // Método para obtener una lista de todas las materias

    List<MateriaDTO> listarTodasJPQL(); // Método para listar todas las materias usando una consulta JPQL

    MateriaDTO buscarPorId(UUID id); // Método para buscar una materia específica mediante su identificador único (UUID)

    MateriaDTO guardar(MateriaDTO dto); // Método para guardar una nueva materia o actualizar una existente a partir de un DTO
}