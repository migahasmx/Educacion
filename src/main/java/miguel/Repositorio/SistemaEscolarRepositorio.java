package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import miguel.Entidad.EntidadSistemaEscolar;

import java.util.UUID;

// Declaración de la interfaz SistemaEscolarRepositorio que extiende JpaRepository
public interface SistemaEscolarRepositorio extends JpaRepository<EntidadSistemaEscolar, UUID> {}
