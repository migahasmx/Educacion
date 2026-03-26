package miguel.DTO;

import java.util.UUID;

public class SistemaEscolarDTO { 

    private UUID idSistemaEscolar; // Identificador único del sistema escolar

    private UUID idAlumno; // Identificador único del alumno
    private String nombreAlumno; // Nombre completo del alumno

    private UUID idProfesor; // Identificador único del profesor
    private String nombreProfesor; // Nombre completo del profesor

    private UUID idCarrera; // Identificador único de la carrera
    private String nombreCarrera; // Nombre de la carrera

    private UUID idMateria; // Identificador único de la materia
    private String nombreMateria; // Nombre de la materia

    private Double calificacion; // Calificación obtenida por el alumno

    public SistemaEscolarDTO() { // Constructor vacío de la clase
    }

    public UUID getIdSistemaEscolar() { // Método que obtiene el id del sistema escolar
        return idSistemaEscolar; // Retorna el id del sistema escolar
    }

    public void setIdSistemaEscolar(UUID idSistemaEscolar) { // Método que establece el id del sistema escolar
        this.idSistemaEscolar = idSistemaEscolar; // Asigna el id del sistema escolar
    }

    public UUID getIdAlumno() { // Método que obtiene el id del alumno
        return idAlumno; // Retorna el id del alumno
    }

    public void setIdAlumno(UUID idAlumno) { // Método que establece el id del alumno
        this.idAlumno = idAlumno; // Asigna el id del alumno
    }

    public String getNombreAlumno() { // Método que obtiene el nombre del alumno
        return nombreAlumno; // Retorna el nombre del alumno
    }

    public void setNombreAlumno(String nombreAlumno) { // Método que establece el nombre del alumno
        this.nombreAlumno = nombreAlumno; // Asigna el nombre del alumno
    }

    public UUID getIdProfesor() { // Método que obtiene el id del profesor
        return idProfesor; // Retorna el id del profesor
    }

    public void setIdProfesor(UUID idProfesor) { // Método que establece el id del profesor
        this.idProfesor = idProfesor; // Asigna el id del profesor
    }

    public String getNombreProfesor() { // Método que obtiene el nombre del profesor
        return nombreProfesor; // Retorna el nombre del profesor
    }

    public void setNombreProfesor(String nombreProfesor) { // Método que establece el nombre del profesor
        this.nombreProfesor = nombreProfesor; // Asigna el nombre del profesor
    }

    public UUID getIdCarrera() { // Método que obtiene el id de la carrera
        return idCarrera; // Retorna el id de la carrera
    }

    public void setIdCarrera(UUID idCarrera) { // Método que establece el id de la carrera
        this.idCarrera = idCarrera; // Asigna el id de la carrera
    }

    public String getNombreCarrera() { // Método que obtiene el nombre de la carrera
        return nombreCarrera; // Retorna el nombre de la carrera
    }

    public void setNombreCarrera(String nombreCarrera) { // Método que establece el nombre de la carrera
        this.nombreCarrera = nombreCarrera; // Asigna el nombre de la carrera
    }

    public UUID getIdMateria() { // Método que obtiene el id de la materia
        return idMateria; // Retorna el id de la materia
    }

    public void setIdMateria(UUID idMateria) { // Método que establece el id de la materia
        this.idMateria = idMateria; // Asigna el id de la materia
    }

    public String getNombreMateria() { // Método que obtiene el nombre de la materia
        return nombreMateria; // Retorna el nombre de la materia
    }

    public void setNombreMateria(String nombreMateria) { // Método que establece el nombre de la materia
        this.nombreMateria = nombreMateria; // Asigna el nombre de la materia
    }

    public Double getCalificacion() { // Método que obtiene la calificación
        return calificacion; // Retorna la calificación
    }

    public void setCalificacion(Double calificacion) { // Método que establece la calificación
        this.calificacion = calificacion; // Asigna la calificación
    }
}