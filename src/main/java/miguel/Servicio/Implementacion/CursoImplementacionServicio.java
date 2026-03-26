package miguel.Servicio.Implementacion;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miguel.Entidad.EntidadCurso;
import miguel.Repositorio.CursoRepositorio;
import miguel.Servicio.CursoServicio;

@Service // Aquí se implementa la lógica de negocio definida en CursoServicio.
 
public class CursoImplementacionServicio implements CursoServicio { // Clase que implementa la lógica del servicio de cursos

    @Autowired // Inyecta automáticamente la dependencia del repositorio
    private CursoRepositorio repositorio; // Repositorio para realizar operaciones CRUD en la base de datos

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public EntidadCurso guardarCurso(EntidadCurso curso) { // Método para guardar un curso
        
        curso.setIdCurso(null); // Asegura que el ID sea nulo para que se genere uno nuevo
        return repositorio.save(curso); // Guarda el curso en la base de datos y retorna el objeto guardado
    }

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public List<EntidadCurso> obtenerTodosLosCursos() { // Método para obtener todos los cursos
        return repositorio.findAll(); // Retorna la lista de todos los cursos almacenados
    }

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public EntidadCurso obtenerCursoPorId(UUID id) { // Método para obtener un curso por su ID
        return repositorio.findById(id).orElse(null); // Busca el curso por ID y retorna null si no existe
    }

    @Override // Indica que este método sobrescribe uno definido en la interfaz
    public void eliminarCurso(UUID id) { // Método para eliminar un curso por su ID
        repositorio.deleteById(id); // Elimina el curso correspondiente en la base de datos.
    }
}