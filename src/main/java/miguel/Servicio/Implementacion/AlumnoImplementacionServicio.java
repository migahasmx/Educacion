package miguel.Servicio.Implementacion;

import miguel.DTO.AlumnoDTO;
import miguel.Entidad.EntidadAlumno;
import miguel.Entidad.EntidadDatosPersonales;
import miguel.Repositorio.AlumnoRepositorio;
import miguel.Servicio.AlumnoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service // Aquí se implementa la lógica de negocio definida en AlumnoServicio.
 
public class AlumnoImplementacionServicio implements AlumnoServicio { // Implementación de la interfaz de servicio AlumnoServicio

    @Autowired // Inyección automática del repositorio de alumnos
    private AlumnoRepositorio alumnoRepositorio; // Repositorio para operaciones CRUD de Alumno

    // Método privado para convertir una entidad Alumno a un objeto DTO
    private AlumnoDTO toDTO(EntidadAlumno a) {
        AlumnoDTO dto = new AlumnoDTO(); // Se crea una nueva instancia de AlumnoDTO
        dto.setIdAlumno(a.getIdAlumno()); // Se asigna el ID del alumno desde la entidad
        dto.setMatricula(a.getMatricula()); // Se asigna la matrícula del alumno
        dto.setCurp(a.getDatosPersonales().getCurp()); // Se obtiene y asigna la CURP desde los datos personales
        dto.setNombre(a.getDatosPersonales().getNombre()); // Se obtiene y asigna el nombre
        dto.setApellidos(a.getDatosPersonales().getApellidos()); // Se obtienen y asignan los apellidos
        dto.setEdad(a.getDatosPersonales().getEdad()); // Se obtiene y asigna la edad
        dto.setGrupoSanguineo(a.getDatosPersonales().getGrupoSanguineo()); // Se obtiene y asigna el grupo sanguíneo
        return dto; // Se retorna el DTO construido
    }

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public List<AlumnoDTO> listarTodos() {
        return alumnoRepositorio.findAll().stream().map(this::toDTO).collect(Collectors.toList()); // Obtiene todos los alumnos, los convierte a DTO y los retorna como lista
    }

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public AlumnoDTO buscarPorId(UUID id) {
        return alumnoRepositorio.findById(id).map(this::toDTO).orElse(null); // Busca un alumno por ID, lo convierte a DTO si existe o retorna null
    }
    //Funcion que guarda un nuevo registro de alumno (top)
    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public AlumnoDTO guardar(AlumnoDTO dto) {
        EntidadDatosPersonales dp = new EntidadDatosPersonales(); // Se crea una nueva entidad de datos personales
        dp.setCurp(dto.getCurp()); // Se asigna la CURP desde el DTO
        dp.setNombre(dto.getNombre()); // Se asigna el nombre desde el DTO
        dp.setApellidos(dto.getApellidos()); // Se asignan los apellidos desde el DTO
        dp.setEdad(dto.getEdad()); // Se asigna la edad desde el DTO
        dp.setGrupoSanguineo(dto.getGrupoSanguineo()); // Se asigna el grupo sanguíneo desde el DTO

        EntidadAlumno a = new EntidadAlumno(); // Se crea una nueva entidad Alumno
        a.setMatricula(dto.getMatricula()); // Se asigna la matrícula desde el DTO
        a.setDatosPersonales(dp); // Se asocian los datos personales al alumno
        return toDTO(alumnoRepositorio.save(a)); // Se guarda la entidad en la base de datos y se retorna como DTO
    }
    
    
    
}

