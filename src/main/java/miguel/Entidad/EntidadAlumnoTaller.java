package miguel.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import miguel.Llaves.LlaveCompuestaTallerAlumno;

@Getter // Genera automáticamente los métodos getters de la clase
@Setter // Genera automáticamente los métodos setters de la clase
@Entity // Indica que esta clase es una entidad de base de datos
@Table( name = "alumno_taller",schema = "miguel",  uniqueConstraints = @UniqueConstraint(columnNames = { "id_alumno", "id_taller" })) // Mapea la entidad a la tabla "alumno_taller" con restricción única en id_alumno y id_taller
public class EntidadAlumnoTaller { // Clase que representa la relación entre alumno y taller

    @EmbeddedId // Indica que este atributo es una llave primaria compuesta
    private LlaveCompuestaTallerAlumno id; // Llave compuesta que contiene los identificadores de alumno y taller

    @ManyToOne // Define una relación muchos a uno con la entidad alumno
    @MapsId("idAlumno") // Mapea el atributo idAlumno de la llave compuesta con esta relación
    @JoinColumn(name = "id_alumno") // Especifica la columna que actúa como llave foránea hacia alumno
    private EntidadAlumno alumno; // Referencia a la entidad Alumno

    @ManyToOne // Define una relación muchos a uno con la entidad taller
    @MapsId("idTaller") // Mapea el atributo idTaller de la llave compuesta con esta relación
    @JoinColumn(name = "id_taller") // Especifica la columna que actúa como llave foránea hacia taller
    private EntidadTaller taller; // Referencia a la entidad Taller
}