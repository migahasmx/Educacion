package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import miguel.Entidad.EntidadEscuela;

import java.util.UUID;

// Declaración de la interfaz EscuelaReposito que extiende JpaRepository
public interface EscuelaRepositorio extends JpaRepository<EntidadEscuela, UUID> {}
