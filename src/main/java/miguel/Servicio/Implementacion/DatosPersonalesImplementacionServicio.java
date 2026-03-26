package miguel.Servicio.Implementacion;

import miguel.DTO.DatosPersonalesDTO;
import miguel.Entidad.EntidadDatosPersonales;
import miguel.Repositorio.DatosPersonalesRepositorio;
import miguel.Servicio.DatosPersonalesServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service // Aquí se implementa la lógica de negocio definida en DatosPersonalesServicio.
public class DatosPersonalesImplementacionServicio implements DatosPersonalesServicio { // Implementación de la interfaz de servicio de datos personales

    @Autowired // Inyección automática del repositorio
    private DatosPersonalesRepositorio datosPersonalesRepositorio; // Repositorio para operaciones de base de datos

    private DatosPersonalesDTO toDTO(EntidadDatosPersonales d) { // Método para convertir una entidad a DTO
        DatosPersonalesDTO dto = new DatosPersonalesDTO(); // Se crea un nuevo objeto DTO
        dto.setIdDatosPersonales(d.getIdDatosPersonales()); // Se asigna el ID desde la entidad al DTO
        dto.setCurp(d.getCurp()); // Se asigna la CURP
        dto.setNombre(d.getNombre()); // Se asigna el nombre
        dto.setApellidos(d.getApellidos()); // Se asignan los apellidos
        dto.setEdad(d.getEdad()); // Se asigna la edad
        dto.setGrupoSanguineo(d.getGrupoSanguineo()); // Se asigna el grupo sanguíneo
        return dto; // Se retorna el DTO ya construido
    }

    @Override // Sobrescribe el método de la interfaz
    public List<DatosPersonalesDTO> listarTodos() { // Método para listar todos los registros
        return datosPersonalesRepositorio.findAll().stream().map(this::toDTO).collect(Collectors.toList()); // Obtiene todas las entidades, las convierte a DTO y las retorna como lista
    }

    @Override // Sobrescribe el método de la interfaz
    public DatosPersonalesDTO buscarPorId(UUID id) { // Método para buscar un registro por su ID
        return datosPersonalesRepositorio.findById(id).map(this::toDTO).orElse(null); // Busca la entidad, la convierte a DTO si existe o retorna null si no
    }

    @Override // Sobrescribe el método de la interfaz
    public DatosPersonalesDTO guardar(DatosPersonalesDTO dto) { // Método para guardar un nuevo registro
        EntidadDatosPersonales d = new EntidadDatosPersonales(); // Se crea una nueva entidad
        d.setCurp(dto.getCurp()); // Se asigna la CURP desde el DTO
        d.setNombre(dto.getNombre()); // Se asigna el nombre
        d.setApellidos(dto.getApellidos()); // Se asignan los apellidos
        d.setEdad(dto.getEdad()); // Se asigna la edad
        d.setGrupoSanguineo(dto.getGrupoSanguineo()); // Se asigna el grupo sanguíneo
        return toDTO(datosPersonalesRepositorio.save(d)); // Se guarda la entidad en la base de datos y se retorna como DTO
    }

    @Override // Sobrescribe el método de la interfaz
    public DatosPersonalesDTO actualizar(UUID id, DatosPersonalesDTO dto) { // Método para actualizar un registro existente
        // TODO Auto-generated method stub // Comentario generado automáticamente indicando que falta implementación
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'"); // Lanza excepción indicando que el método no está implementado
    }

    @Override // Sobrescribe el método de la interfaz
    public void eliminar(UUID id) { // Método para eliminar un registro por ID
        // TODO Auto-generated method stub // Comentario generado automáticamente indicando que falta implementación
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'"); // Lanza excepción indicando que el método no está implementado
    }

}