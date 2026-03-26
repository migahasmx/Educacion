package miguel.Entidad;

import jakarta.persistence.*;
import java.util.UUID;

@Entity // Indica que esta clase es una entidad JPA que se mapeará a una tabla en la base de datos
@Table(name = "profesor", schema = "miguel") // Especifica el nombre de la tabla en la base de datos
public class EntidadProfesor { // Declaración de la clase que representa la entidad Profesor

    @Id // Indica que este campo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.UUID) // Define que el valor de la clave primaria se generará automáticamente como UUID
    @Column(name = "id_profesor") // Mapea este campo a la columna "id_profesor" en la tabla
    private UUID idProfesor; // Variable que almacena el identificador único del profesor

    @OneToOne(cascade = CascadeType.ALL) // Define una relación uno a uno con otra entidad y propaga todas las operaciones (persist, remove, etc.)
    @JoinColumn(name = "id_datospersonales", unique = true, nullable = false) // Especifica la columna de unión, única y obligatoria
    private EntidadDatosPersonales datosPersonales; // Referencia a la entidad de datos personales asociada al profesor

    @Column(name = "especialidad") // Mapea este campo a la columna "especialidad" en la tabla
    private String especialidad; // Variable que almacena la especialidad del profesor

    public EntidadProfesor() { // Constructor vacío requerido por JPA
    }

    public UUID getIdProfesor() { // Método getter que devuelve el id del profesor
        return idProfesor; // Retorna el valor del identificador del profesor
    }

    public void setIdProfesor(UUID idProfesor) { // Método setter que asigna un valor al id del profesor
        this.idProfesor = idProfesor; // Asigna el valor recibido al campo idProfesor
    }

    public EntidadDatosPersonales getDatosPersonales() { // Método getter que devuelve los datos personales del profesor
        return datosPersonales; // Retorna la referencia a los datos personales
    }

    public void setDatosPersonales(EntidadDatosPersonales datosPersonales) { // Método setter que asigna los datos personales del profesor
        this.datosPersonales = datosPersonales; // Asigna el objeto recibido al campo datosPersonales
    }

    public String getEspecialidad() { // Método getter que devuelve la especialidad del profesor
        return especialidad; // Retorna la especialidad del profesor
    }

    public void setEspecialidad(String especialidad) { // Método setter que asigna la especialidad del profesor
        this.especialidad = especialidad; // Asigna el valor recibido al campo especialidad
    }
}