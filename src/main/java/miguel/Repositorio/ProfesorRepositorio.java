package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import miguel.Entidad.EntidadProfesor;

import java.util.UUID;

// Declaración de la interfaz ProfesorRepositorio que extiende JpaRepository
public interface ProfesorRepositorio extends JpaRepository<EntidadProfesor, UUID> {}
