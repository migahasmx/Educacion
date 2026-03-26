package miguel.Repositorio;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import miguel.Entidad.EntidadCurso;

// Declaración de la interfaz CursoRepositorio que extiende JpaRepository
public interface CursoRepositorio extends JpaRepository<EntidadCurso, UUID> {}