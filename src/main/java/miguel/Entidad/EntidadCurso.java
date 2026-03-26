package miguel.Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter // Genera automáticamente los métodos getter para todos los atributos
@Setter // Genera automáticamente los métodos setter para todos los atributos
@Entity // Indica que esta clase es una entidad JPA (tabla en la base de datos)
@Table(name = "curso", schema = "miguel") // Especifica el nombre de la tabla en la base de datos
public class EntidadCurso {

    @Id // Indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.UUID) // Genera automáticamente el ID usando UUID
    @Column(name = "id_curso", updatable = false, nullable = false) // Define la columna, no actualizable y obligatoria
    private UUID idCurso; // Identificador único del curso

    @Column(name = "nombre_curso") // Define la columna para el nombre del curso
    private String nombreCurso; // Nombre del curso

    @Column(name = "division_curso") // Define la columna para la división del curso
    private String division_curso; // División o grupo del curso

    @ManyToMany(fetch = FetchType.LAZY) // Relación muchos a muchos con carga perezosa
    @JoinTable(name = "curso_profesor", joinColumns = @JoinColumn(name = "id_curso"), inverseJoinColumns = @JoinColumn(name = "id_profesor")) // Tabla intermedia para la relación
    private List<EntidadProfesor> maestros = new ArrayList<>(); // Lista de profesores asociados al curso

    @Override // Sobrescribe el método hashCode de la clase Object
    public int hashCode() {
        return Objects.hashCode(this.idCurso); // Genera el hash basado en el ID del curso
    }

    @Override // Sobrescribe el método equals de la clase Object
    public boolean equals(Object obj) {
        if (this == obj) // Verifica si es la misma instancia
            return true;
        if (obj == null || getClass() != obj.getClass()) // Verifica si el objeto es nulo o de distinta clase
            return false;
        EntidadCurso other = (EntidadCurso) obj; // Castea el objeto a EntidadCurso
        return Objects.equals(this.idCurso, other.idCurso); // Compara los IDs de ambos objetos
    }
}