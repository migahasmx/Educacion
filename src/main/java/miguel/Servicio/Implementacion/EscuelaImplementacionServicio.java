package miguel.Servicio.Implementacion;

import miguel.DTO.EscuelaDTO;
import miguel.Entidad.EntidadEscuela;
import miguel.Repositorio.EscuelaRepositorio;
import miguel.Servicio.EscuelaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service // Aquí se implementa la lógica de negocio definida en EscuelaServicio.
public class EscuelaImplementacionServicio implements EscuelaServicio { // Clase que implementa la lógica del servicio Escuela

    @Autowired // Inyección automática del repositorio
    private EscuelaRepositorio escuelaRepositorio; // Repositorio para acceder a datos de Escuela

    private EscuelaDTO toDTO(EntidadEscuela e) { // Método para convertir entidad a DTO
        EscuelaDTO dto = new EscuelaDTO(); // Se crea un nuevo objeto DTO
        dto.setIdEscuela(e.getIdEscuela()); // Se asigna el ID de la escuela
        dto.setNombreEscuela(e.getNombreEscuela()); // Se asigna el nombre de la escuela
        dto.setDireccionEscuela(e.getDireccionEscuela()); // Se asigna la dirección de la escuela
        return dto; // Se retorna el DTO construido
    }

    private EntidadEscuela toEntity(EscuelaDTO dto) { // Método para convertir DTO a entidad
        EntidadEscuela e = new EntidadEscuela(); // Se crea una nueva entidad
        e.setNombreEscuela(dto.getNombreEscuela()); // Se asigna el nombre desde el DTO
        e.setDireccionEscuela(dto.getDireccionEscuela()); // Se asigna la dirección desde el DTO
        return e; // Se retorna la entidad construida
    }

    @Override // Indica que este método sobrescribe uno de la interfaz
    public List<EscuelaDTO> listarTodas() { // Método para listar todas las escuelas
        return escuelaRepositorio.findAll().stream().map(this::toDTO).collect(Collectors.toList()); // Obtiene todas las entidades, las convierte a DTO y las retorna en lista
    }

    @Override // Indica que este método sobrescribe uno de la interfaz
    public EscuelaDTO buscarPorId(UUID id) { // Método para buscar una escuela por su ID
        return escuelaRepositorio.findById(id).map(this::toDTO).orElse(null); // Busca por ID, convierte a DTO si existe o retorna null si no
    }

    @Override // Indica que este método sobrescribe uno de la interfaz
    public EscuelaDTO guardar(EscuelaDTO dto) { // Método para guardar una nueva escuela
        EntidadEscuela saved = escuelaRepositorio.save(toEntity(dto)); // Convierte el DTO a entidad y la guarda en la base de datos
        return toDTO(saved); // Convierte la entidad guardada a DTO y la retorna
    }

    @Override // Indica que este método sobrescribe uno de la interfaz
    public EscuelaDTO actualizar(UUID id, EscuelaDTO dto) { // Método para actualizar una escuela existente
        EntidadEscuela escuela = escuelaRepositorio.findById(id).orElseThrow(); // Busca la escuela por ID o lanza excepción si no existe
        escuela.setNombreEscuela(dto.getNombreEscuela()); // Actualiza el nombre de la escuela
        escuela.setDireccionEscuela(dto.getDireccionEscuela()); // Actualiza la dirección de la escuela
        return toDTO(escuelaRepositorio.save(escuela)); // Guarda los cambios y retorna el DTO actualizado
    }

    @Override // Indica que este método sobrescribe uno de la interfaz
    public void eliminar(UUID id) { // Método para eliminar una escuela por ID
        escuelaRepositorio.deleteById(id); // Elimina la escuela de la base de datos
    }
}
