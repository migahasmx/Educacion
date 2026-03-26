package miguel.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter // Genera automáticamente los métodos setter para los atributos de la clase
@Getter // Genera automáticamente los métodos getter para los atributos de la clase
@Entity // Indica que esta clase es una entidad JPA (tabla en la base de datos)
@Table(name = "taller", schema = "miguel") // Especifica el nombre de la tabla en la base de datos
public class EntidadTaller {

    @Id // Indica que este atributo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.UUID) // Genera automáticamente el valor del ID usando UUID
    @Column(name = "id_taller") // Mapea este atributo con la columna "id_taller" en la tabla
    private UUID idTaller; // Identificador único del taller

    @Column(name = "nombre_taller", nullable = false) // Columna obligatoria para el nombre del taller
    private String nombreTaller; // Nombre del taller

    @Column(name = "division_taller", nullable = false) // Columna obligatoria para la división del taller
    private String divisionTaller; // División a la que pertenece el taller

    @OneToMany(mappedBy = "taller", cascade = CascadeType.ALL) // Relación uno a muchos con la entidad EntidadAlumnoTaller
    private List<EntidadAlumnoTaller> alumnoTaller; // Lista de alumnos inscritos en el taller
}