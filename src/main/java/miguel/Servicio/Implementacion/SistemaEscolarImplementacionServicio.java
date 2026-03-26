package miguel.Servicio.Implementacion;

import miguel.DTO.SistemaEscolarDTO;
import miguel.Entidad.*;
import miguel.Repositorio.*;
import miguel.Servicio.SistemaEscolarServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service // Aquí se implementa la lógica de negocio definida en SistemaEscolarServicio.
public class SistemaEscolarImplementacionServicio implements SistemaEscolarServicio { // Implementación del servicio SistemaEscolarServicio

    @Autowired
    private SistemaEscolarRepositorio sistemaEscolarRepositorio; // Inyección del repositorio de SistemaEscolar para acceso a datos

    @Autowired
    private AlumnoRepositorio alumnoRepositorio; // Inyección del repositorio de Alumno

    @Autowired
    private ProfesorRepositorio profesorRepositorio; // Inyección del repositorio de Profesor

    @Autowired
    private CarreraRepositorio carreraRepositorio; // Inyección del repositorio de Carrera

    @Autowired
    private MateriaRepositorio materiaRepositorio; // Inyección del repositorio de Materia

    private SistemaEscolarDTO toDTO(EntidadSistemaEscolar s) { // Método para convertir una entidad a DTO

        SistemaEscolarDTO dto = new SistemaEscolarDTO(); // Se crea un nuevo objeto DTO
    
        dto.setIdSistemaEscolar(s.getIdSistemaEscolar()); // Se asigna el ID del sistema escolar
    
        dto.setIdAlumno(s.getAlumno().getIdAlumno()); // Se obtiene y asigna el ID del alumno
        dto.setNombreAlumno(s.getAlumno().getDatosPersonales().getNombre()); // Se obtiene y asigna el nombre del alumno
    
        dto.setIdProfesor(s.getProfesor().getIdProfesor()); // Se obtiene y asigna el ID del profesor
        dto.setNombreProfesor(s.getProfesor().getDatosPersonales().getNombre()); // Se obtiene y asigna el nombre del profesor
    
        dto.setIdCarrera(s.getCarrera().getIdCarrera()); // Se obtiene y asigna el ID de la carrera
        dto.setNombreCarrera(s.getCarrera().getNombreCarrera()); // Se obtiene y asigna el nombre de la carrera
    
        dto.setIdMateria(s.getMateria().getIdMateria()); // Se obtiene y asigna el ID de la materia
        dto.setNombreMateria(s.getMateria().getNombreMateria()); // Se obtiene y asigna el nombre de la materia
    
        dto.setCalificacion(s.getCalificacion()); // Se asigna la calificación
    
        return dto; // Se retorna el DTO construido
    }

    @Override
    public List<SistemaEscolarDTO> listarTodos() { // Método para listar todos los registros
        return sistemaEscolarRepositorio.findAll().stream().map(this::toDTO).collect(Collectors.toList()); // Obtiene todas las entidades, las convierte a DTO y las retorna como lista
    }

    @Override
    public SistemaEscolarDTO buscarPorId(UUID id) { // Método para buscar un registro por su ID
        return sistemaEscolarRepositorio.findById(id).map(this::toDTO).orElse(null); // Busca por ID, convierte a DTO si existe, si no retorna null
    }

    @Override
    public SistemaEscolarDTO guardar(SistemaEscolarDTO dto) { // Método para guardar un nuevo registro
        EntidadSistemaEscolar s = new EntidadSistemaEscolar(); // Se crea una nueva entidad SistemaEscolar
        s.setAlumno(alumnoRepositorio.findById(dto.getIdAlumno()).orElseThrow()); // Se asigna el alumno buscado por ID
        s.setProfesor(profesorRepositorio.findById(dto.getIdProfesor()).orElseThrow()); // Se asigna el profesor buscado por ID
        s.setCarrera(carreraRepositorio.findById(dto.getIdCarrera()).orElseThrow()); // Se asigna la carrera buscada por ID
        s.setMateria(materiaRepositorio.findById(dto.getIdMateria()).orElseThrow()); // Se asigna la materia buscada por ID
        s.setCalificacion(dto.getCalificacion()); // Se asigna la calificación desde el DTO
        return toDTO(sistemaEscolarRepositorio.save(s)); // Guarda la entidad y retorna el resultado convertido a DTO
    }

   
}