package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import miguel.Entidad.EntidadTaller;
import java.util.UUID;

// Declaración de la interfaz TallerRepositorio que extiende JpaRepository
public interface TallerRepositorio extends JpaRepository<EntidadTaller, UUID> {
}