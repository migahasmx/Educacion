package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import miguel.Entidad.EntidadDatosPersonales;

import java.util.UUID;

// Declaración de la interfaz DatosPersonalesRepositorio que extiende JpaRepository
public interface DatosPersonalesRepositorio extends JpaRepository<EntidadDatosPersonales, UUID> {}
