package miguel.Repositorio;

import org.springframework.data.jpa.repository.*;

import miguel.Entidad.EntidadCarrera;

import java.util.List;
import java.util.UUID;

// Definición de la interfaz del repositorio para la entidad EntidadCarrera
public interface CarreraRepositorio extends JpaRepository<EntidadCarrera, UUID> {

    // Anotación que permite definir una consulta personalizada en JPQL
    @Query("SELECT c FROM EntidadCarrera c JOIN FETCH c.escuela")
    
    // Método que obtiene todas las carreras junto con su entidad escuela relacionada 
    List<EntidadCarrera> findAllWithEscuela();
}