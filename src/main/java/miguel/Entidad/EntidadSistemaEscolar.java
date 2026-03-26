package miguel.Entidad;

import jakarta.persistence.*;
import java.util.UUID;

@Entity // Indica que esta clase es una entidad JPA que se mapeará a una tabla en la base de datos
@Table(name = "sistemaescolar", schema = "miguel") // Especifica el nombre de la tabla en la base de datos
public class EntidadSistemaEscolar { // Declaración de la clase que representa la tabla sistemaescolar

    @Id // Indica que este campo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.UUID) // Define que el valor de la clave primaria se generará automáticamente como UUID
    @Column(name = "id_sistemaescolar") // Especifica el nombre de la columna en la tabla
    private UUID idSistemaEscolar; // Variable que almacena el identificador único del sistema escolar

    @ManyToOne // Define una relación muchos a uno con la entidad Alumno
    @JoinColumn(name = "id_alumno", nullable = false) // Especifica la columna de unión y que no puede ser nula
    private EntidadAlumno alumno; // Objeto que representa al alumno asociado

    @ManyToOne // Define una relación muchos a uno con la entidad Profesor
    @JoinColumn(name = "id_profesor", nullable = false) // Especifica la columna de unión y que no puede ser nula
    private EntidadProfesor profesor; // Objeto que representa al profesor asociado

    @ManyToOne // Define una relación muchos a uno con la entidad Carrera
    @JoinColumn(name = "id_carrera", nullable = false) // Especifica la columna de unión y que no puede ser nula
    private EntidadCarrera carrera; // Objeto que representa la carrera asociada

    @ManyToOne // Define una relación muchos a uno con la entidad Materia
    @JoinColumn(name = "id_materia", nullable = false) // Especifica la columna de unión y que no puede ser nula
    private EntidadMateria materia; // Objeto que representa la materia asociada

    @Column(name = "calificacion") // Especifica el nombre de la columna para la calificación
    private Double calificacion; // Variable que almacena la calificación del alumno en la materia

    public EntidadSistemaEscolar() { // Constructor vacío requerido por JPA para crear instancias de la entidad
    }

    public UUID getIdSistemaEscolar() { // Método getter para obtener el ID del sistema escolar
        return idSistemaEscolar; // Retorna el valor del identificador
    }

    public void setIdSistemaEscolar(UUID idSistemaEscolar) { // Método setter para asignar el ID del sistema escolar
        this.idSistemaEscolar = idSistemaEscolar; // Asigna el valor recibido al identificador
    }

    public EntidadAlumno getAlumno() { // Método getter para obtener el alumno asociado
        return alumno; // Retorna el objeto alumno
    }

    public void setAlumno(EntidadAlumno alumno) { // Método setter para asignar el alumno
        this.alumno = alumno; // Asigna el objeto alumno recibido
    }

    public EntidadProfesor getProfesor() { // Método getter para obtener el profesor asociado
        return profesor; // Retorna el objeto profesor
    }

    public void setProfesor(EntidadProfesor profesor) { // Método setter para asignar el profesor
        this.profesor = profesor; // Asigna el objeto profesor recibido
    }

    public EntidadCarrera getCarrera() { // Método getter para obtener la carrera asociada
        return carrera; // Retorna el objeto carrera
    }

    public void setCarrera(EntidadCarrera carrera) { // Método setter para asignar la carrera
        this.carrera = carrera; // Asigna el objeto carrera recibido
    }

    public EntidadMateria getMateria() { // Método getter para obtener la materia asociada
        return materia; // Retorna el objeto materia
    }

    public void setMateria(EntidadMateria materia) { // Método setter para asignar la materia
        this.materia = materia; // Asigna el objeto materia recibido
    }

    public Double getCalificacion() { // Método getter para obtener la calificación
        return calificacion; // Retorna el valor de la calificación
    }

    public void setCalificacion(Double calificacion) { // Método setter para asignar la calificación
        this.calificacion = calificacion; // Asigna el valor recibido a la calificación
    }
} 