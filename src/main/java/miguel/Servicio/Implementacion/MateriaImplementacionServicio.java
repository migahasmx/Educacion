package miguel.Servicio.Implementacion;

import miguel.DTO.MateriaDTO;
import miguel.Entidad.EntidadMateria;
import miguel.Repositorio.MateriaRepositorio;
import miguel.Servicio.MateriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service // Aquí se implementa la lógica de negocio definida en MateriaServicio.
public class MateriaImplementacionServicio implements MateriaServicio { // Clase que implementa la lógica del servicio de Materia

    @Autowired // Inyección automática del repositorio de Materia
    private MateriaRepositorio materiaRepositorio; // Repositorio para acceder a la base de datos

    private MateriaDTO toDTO(EntidadMateria m) { // Método privado para convertir una entidad a DTO
        MateriaDTO dto = new MateriaDTO(); // Se crea un nuevo objeto DTO
        dto.setIdMateria(m.getIdMateria()); // Se asigna el ID de la materia desde la entidad
        dto.setNombreMateria(m.getNombreMateria()); // Se asigna el nombre de la materia
        dto.setCreditosMateria(m.getCreditosMateria()); // Se asignan los créditos de la materia
        return dto; // Se retorna el DTO ya construido
    }

    
    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public List<MateriaDTO> listarTodas() { // Método para obtener todas las materias
        return materiaRepositorio.findAll() // Obtiene todas las entidades desde la base de datos
                .stream() // Convierte la lista en un stream para procesarla
                .map(this::toDTO) // Convierte cada entidad en DTO
                .collect(Collectors.toList()); // Recolecta los resultados en una lista
    }

    
    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public List<MateriaDTO> listarTodasJPQL() { // Método para obtener todas las materias usando JPQL
        return materiaRepositorio.listarJPQL() // Ejecuta la consulta JPQL personalizada
                .stream() // Convierte la lista en un stream
                .map(this::toDTO) // Convierte cada entidad en DTO
                .collect(Collectors.toList()); // Recolecta los resultados en una lista
    }

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public MateriaDTO buscarPorId(UUID id) { // Método para buscar una materia por su ID
        return materiaRepositorio.findById(id) // Busca la entidad en la base de datos por ID
                .map(this::toDTO) // Si existe, la convierte a DTO
                .orElse(null); // Si no existe, retorna null
    }

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public MateriaDTO guardar(MateriaDTO dto) { // Método para guardar una nueva materia
        EntidadMateria m = new EntidadMateria(); // Se crea una nueva entidad de Materia
        m.setNombreMateria(dto.getNombreMateria()); // Se asigna el nombre desde el DTO
        m.setCreditosMateria(dto.getCreditosMateria()); // Se asignan los créditos desde el DTO
        return toDTO(materiaRepositorio.save(m)); // Se guarda la entidad y se retorna como DTO
    }
}