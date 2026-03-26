package miguel.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter // Genera automáticamente los métodos getters para todos los atributos
@Setter // Genera automáticamente los métodos setters para todos los atributos
@Entity // Indica que esta clase es una entidad de JPA (tabla en base de datos)
@Table(name = "alumno", schema = "miguel") // Especifica el nombre de la tabla en la base de datos
public class EntidadAlumno {

    @Id // Indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.UUID) // Genera automáticamente el ID usando UUID
    @Column(name = "id_alumno") // Mapea este atributo con la columna "id_alumno"
    private UUID idAlumno; // Identificador único del alumno

    @OneToOne(cascade = CascadeType.ALL) // Relación uno a uno con otra entidad, con cascada en todas las operaciones
    @JoinColumn(name = "id_datospersonales", unique = true, nullable = false) // Define la columna de unión con restricciones
    private EntidadDatosPersonales datosPersonales; // Referencia a los datos personales del alumno

    @Column(name = "matricula", nullable = false, unique = true) // Columna matrícula, obligatoria y única
    private String matricula; // Matrícula del alumno

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL) // Relación uno a muchos con la entidad EntidadAlumnoTaller
    private List<EntidadAlumnoTaller> alumnoTaller; // Lista de talleres asociados al alumno
}