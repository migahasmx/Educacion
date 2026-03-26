package miguel.Servicio.Implementacion;

import java.util.Map;

import miguel.DTO.CarreraDTO;
import miguel.DTO.EscuelaCarrerasDTO;
import miguel.Entidad.EntidadCarrera;
import miguel.Entidad.EntidadEscuela;
import miguel.Repositorio.CarreraRepositorio;
import miguel.Repositorio.EscuelaRepositorio;
import miguel.Servicio.CarreraServicio;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


 // Aquí se implementa la lógica de negocio definida en CarreraServicio.
 
@Service
// Clase que implementa la interfaz CarreraServicio
public class CarreraImplementacionServicio implements CarreraServicio {

    // Repositorio para acceder a la tabla de carreras
    private final CarreraRepositorio carreraRepositorio;

    // Repositorio para acceder a la tabla de escuelas
    private final EscuelaRepositorio escuelaRepositorio;

    
    // Constructor que recibe los repositorios como parámetros
    public CarreraImplementacionServicio(CarreraRepositorio carreraRepository,
            EscuelaRepositorio escuelaRepository) {
        // Asigna el repositorio de carreras
        this.carreraRepositorio = carreraRepository;
        // Asigna el repositorio de escuelas
        this.escuelaRepositorio = escuelaRepository;
    }

    /*
     * Obtiene todas las carreras junto con su escuela
     * y las convierte en objetos CarreraDTO.
     */
    @Override
    // Método que lista todas las carreras en formato DTO
    public List<CarreraDTO> listarTodas() {

        // Llama al repositorio para obtener todas las carreras con su escuela
        return carreraRepositorio.findAllWithEscuela()

                // Convierte la lista en un Stream
                .stream()

                // Convierte cada entidad Carrera en un DTO
                .map(c -> {

                    // Crea un nuevo objeto DTO
                    CarreraDTO dto = new CarreraDTO();

                    // Asigna el ID de la carrera
                    dto.setIdCarrera(c.getIdCarrera());
                    // Asigna el nombre de la carrera
                    dto.setNombreCarrera(c.getNombreCarrera());
                    // Asigna el ID de la escuela
                    dto.setIdEscuela(c.getEscuela().getIdEscuela());
                    // Asigna el nombre de la escuela
                    dto.setNombreEscuela(c.getEscuela().getNombreEscuela());

                    // Retorna el DTO creado
                    return dto;
                })

                // Convierte nuevamente el Stream en una lista
                .collect(Collectors.toList());
    }

    
    @Override
    // Método que guarda una nueva carrera
    public void guardar(CarreraDTO dto) {

        // Busca la escuela asociada usando el ID del DTO
        EntidadEscuela escuela = escuelaRepositorio
                .findById(dto.getIdEscuela())
                // Lanza excepción si no se encuentra la escuela
                .orElseThrow(() -> new RuntimeException("Escuela no encontrada"));

        // Crea una nueva entidad Carrera
        EntidadCarrera carrera = new EntidadCarrera();

        // Asigna el nombre de la carrera desde el DTO
        carrera.setNombreCarrera(dto.getNombreCarrera());

        // Asigna la escuela encontrada a la carrera
        carrera.setEscuela(escuela);

        // Guarda la carrera en la base de datos
        carreraRepositorio.save(carrera);
    }

    
    @Override
    // Método que busca una carrera por su identificador
    public CarreraDTO buscarPorId(UUID id) {

        // Busca la carrera en la base de datos
        EntidadCarrera carrera = carreraRepositorio.findById(id)
                // Lanza excepción si no se encuentra la carrera
                .orElseThrow(() -> new RuntimeException("Carrera no encontrada"));

        // Crea un nuevo DTO
        CarreraDTO dto = new CarreraDTO();

        // Asigna el ID de la carrera
        dto.setIdCarrera(carrera.getIdCarrera());
        // Asigna el nombre de la carrera
        dto.setNombreCarrera(carrera.getNombreCarrera());
        // Asigna el ID de la escuela asociada
        dto.setIdEscuela(carrera.getEscuela().getIdEscuela());

        // Retorna el DTO con los datos
        return dto;
    }

    
    
   

    
    @Override
    // Método que agrupa carreras por escuela
    public List<EscuelaCarrerasDTO> listarCarrerasAgrupadasPorEscuela() {

       
        // Obtiene todas las carreras en formato DTO
        List<CarreraDTO> carreras = listarTodas();

        
        // Agrupa las carreras por nombre de escuela
        Map<String, List<CarreraDTO>> agrupado = carreras.stream()

              
                 //Agrupar carreras por nombre de escuela
               
                .collect(Collectors.groupingBy(

                        // Usa el nombre de la escuela como clave
                        CarreraDTO::getNombreEscuela,

                       
                        // Agrupa en listas
                        Collectors.toList()));

       
        // Convierte el mapa en una lista de DTOs
        return agrupado.entrySet()

                // Convierte el conjunto de entradas en stream
                .stream()

                // Mapea cada entrada a un objeto EscuelaCarrerasDTO
                .map(entry -> {

                    
                    // Crea un nuevo DTO de escuela con carreras
                    EscuelaCarrerasDTO dto = new EscuelaCarrerasDTO();

                   
                    // Asigna el nombre de la escuela (clave del mapa)
                    dto.setNombreEscuela(entry.getKey());

                    
                    // Asigna la lista de carreras (valor del mapa)
                    dto.setCarreras(entry.getValue());

                    // Retorna el DTO construido
                    return dto;
                })

                // Convierte el resultado en lista
                .collect(Collectors.toList());
    }
}