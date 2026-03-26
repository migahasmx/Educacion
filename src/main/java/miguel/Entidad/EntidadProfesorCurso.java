package miguel.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import miguel.Llaves.LlaveCompuestaProfesorCurso;


@Getter // Genera automáticamente los métodos getters de la clase
@Setter // Genera automáticamente los métodos setters de la clase
@Entity // Indica que esta clase es una entidad de base de datos
@Table( name = "curso_profesor",schema = "miguel",  uniqueConstraints = @UniqueConstraint(columnNames = { "id_profesor", "id_curso" })) // Mapea la entidad a la tabla "curso_profesor" con restricción única en id_profesor y id_curso
public class EntidadProfesorCurso { // Clase que representa la relación entre profesor y curso

    @EmbeddedId // Indica que este atributo es una llave primaria compuesta
    private LlaveCompuestaProfesorCurso id; // Llave compuesta que contiene los identificadores de profesor y curso

    @ManyToOne // Define una relación muchos a uno con la entidad profesor
    @MapsId("idProfesor") // Mapea el atributo idProfesor de la llave compuesta con esta relación
    @JoinColumn(name = "id_profesor") // Especifica la columna que actúa como llave foránea hacia profesor
    private EntidadProfesor profesor; // Referencia a la entidad profesor

    @ManyToOne // Define una relación muchos a uno con la entidad curso
    @MapsId("idCurso") // Mapea el atributo idTaller de la llave compuesta con esta relación
    @JoinColumn(name = "id_curso") // Especifica la columna que actúa como llave foránea hacia curso
    private EntidadCurso curso; // Referencia a la entidad curso
}