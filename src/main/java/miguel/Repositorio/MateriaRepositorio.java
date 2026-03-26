package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import miguel.Entidad.EntidadMateria;

import java.util.List;
import java.util.UUID;

// Indica que esta interfaz es un componente de repositorio de Spring
@Repository
// Define la interfaz del repositorio para la entidad EntidadMateria con clave primaria UUID
public interface MateriaRepositorio extends JpaRepository<EntidadMateria, UUID> {

    // Define una consulta JPQL personalizada para obtener todas las materias
    @Query("SELECT m FROM EntidadMateria m")
    // Método que ejecuta la consulta y retorna una lista de todas las entidades Materia
    List<EntidadMateria> listarJPQL();
    
}
