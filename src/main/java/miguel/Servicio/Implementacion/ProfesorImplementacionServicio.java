package miguel.Servicio.Implementacion;

import miguel.DTO.ProfesorDTO;
import miguel.Entidad.EntidadDatosPersonales;
import miguel.Entidad.EntidadProfesor;
import miguel.Repositorio.ProfesorRepositorio;
import miguel.Servicio.ProfesorServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service // Aquí se implementa la lógica de negocio definida en ProfesorServicio.
public class ProfesorImplementacionServicio implements ProfesorServicio { // Implementa la interfaz ProfesorServicio

    @Autowired // Inyecta automáticamente el repositorio de profesores
    private ProfesorRepositorio profesorRepositorio; // Repositorio para operaciones CRUD de Profesor

    private ProfesorDTO toDTO(EntidadProfesor p) { // Método para convertir una entidad Profesor a un DTO
        ProfesorDTO dto = new ProfesorDTO(); // Crea una nueva instancia de ProfesorDTO
        dto.setIdProfesor(p.getIdProfesor()); // Asigna el ID del profesor
        dto.setEspecialidad(p.getEspecialidad()); // Asigna la especialidad del profesor
        dto.setCurp(p.getDatosPersonales().getCurp()); // Obtiene y asigna la CURP desde datos personales
        dto.setNombre(p.getDatosPersonales().getNombre()); // Obtiene y asigna el nombre
        dto.setApellidos(p.getDatosPersonales().getApellidos()); // Obtiene y asigna los apellidos
        dto.setEdad(p.getDatosPersonales().getEdad()); // Obtiene y asigna la edad
        dto.setGrupoSanguineo(p.getDatosPersonales().getGrupoSanguineo()); // Obtiene y asigna el grupo sanguíneo
        return dto; // Retorna el DTO construido
    }

    @Override // Indica que este método implementa uno de la interfaz
    public List<ProfesorDTO> listarTodos() { // Método para obtener todos los profesores
        return profesorRepositorio.findAll().stream().map(this::toDTO).collect(Collectors.toList()); // Convierte la lista de entidades a DTOs
    }

    @Override // Indica que este método implementa uno de la interfaz
    public ProfesorDTO buscarPorId(UUID id) { // Método para buscar un profesor por su ID
        return profesorRepositorio.findById(id).map(this::toDTO).orElse(null); // Busca y convierte a DTO o retorna null si no existe
    }

    @Override // Indica que este método implementa uno de la interfaz
    public ProfesorDTO guardar(ProfesorDTO dto) { // Método para guardar un nuevo profesor
        EntidadDatosPersonales dp = new EntidadDatosPersonales(); // Crea una nueva entidad de datos personales
        dp.setCurp(dto.getCurp()); // Asigna la CURP desde el DTO
        dp.setNombre(dto.getNombre()); // Asigna el nombre desde el DTO
        dp.setApellidos(dto.getApellidos()); // Asigna los apellidos desde el DTO
        dp.setEdad(dto.getEdad()); // Asigna la edad desde el DTO
        dp.setGrupoSanguineo(dto.getGrupoSanguineo()); // Asigna el grupo sanguíneo desde el DTO

        EntidadProfesor p = new EntidadProfesor(); // Crea una nueva entidad de profesor
        p.setEspecialidad(dto.getEspecialidad()); // Asigna la especialidad desde el DTO
        p.setDatosPersonales(dp); // Relaciona los datos personales con el profesor
        return toDTO(profesorRepositorio.save(p)); // Guarda la entidad y retorna su equivalente en DTO
    }

    
}