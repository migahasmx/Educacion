package miguel.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import miguel.Entidad.EntidadAlumno;

import java.util.UUID;

// Interfaz de repositorio que permite realizar operaciones CRUD sobre la entidad EntidadAlumno usando UUID como tipo de identificador
public interface AlumnoRepositorio extends JpaRepository<EntidadAlumno, UUID> {} 