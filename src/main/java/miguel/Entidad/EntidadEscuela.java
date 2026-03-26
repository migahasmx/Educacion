package miguel.Entidad;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity // Indica que la clase es una entidad JPA que se mapeará a una tabla en la base de datos
@Table(name = "escuela", schema = "miguel") // Define el nombre de la tabla en la base de datos
public class EntidadEscuela { // Declaración de la clase que representa la entidad escuela

    @Id // Indica que este campo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.UUID) // Genera automáticamente el valor del ID usando UUID
    @Column(name = "id_escuela") // Especifica el nombre de la columna en la base de datos
    private UUID idEscuela; // Variable que almacena el identificador único de la escuela

    @Column(name = "nombre_escuela", nullable = false) // Define la columna del nombre de la escuela y que no puede ser nula
    private String nombreEscuela; // Variable que almacena el nombre de la escuela

    @Column(name = "direccion_escuela") // Define la columna de la dirección de la escuela
    private String direccionEscuela; // Variable que almacena la dirección de la escuela

    @OneToMany(mappedBy = "escuela", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Relación uno a muchos con la entidad carrera
    private List<EntidadCarrera> carreras; // Lista que almacena las carreras asociadas a la escuela

    public EntidadEscuela() { // Constructor vacío requerido por JPA
    }

    public UUID getIdEscuela() { // Método getter para obtener el ID de la escuela
        return idEscuela; // Retorna el valor del ID de la escuela
    }

    public void setIdEscuela(UUID idEscuela) { // Método setter para asignar el ID de la escuela
        this.idEscuela = idEscuela; // Asigna el valor recibido al ID de la escuela
    }

    public String getNombreEscuela() { // Método getter para obtener el nombre de la escuela
        return nombreEscuela; // Retorna el nombre de la escuela
    }

    public void setNombreEscuela(String nombreEscuela) { // Método setter para asignar el nombre de la escuela
        this.nombreEscuela = nombreEscuela; // Asigna el valor recibido al nombre de la escuela
    }

    public String getDireccionEscuela() { // Método getter para obtener la dirección de la escuela
        return direccionEscuela; // Retorna la dirección de la escuela
    }

    public void setDireccionEscuela(String direccionEscuela) { // Método setter para asignar la dirección de la escuela
        this.direccionEscuela = direccionEscuela; // Asigna el valor recibido a la dirección de la escuela
    }

    public List<EntidadCarrera> getCarreras() { // Método getter para obtener la lista de carreras
        return carreras; // Retorna la lista de carreras asociadas
    }

    public void setCarreras(List<EntidadCarrera> carreras) { // Método setter para asignar la lista de carreras
        this.carreras = carreras; // Asigna la lista de carreras a la entidad
    }
}