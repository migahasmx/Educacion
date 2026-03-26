package miguel.Entidad;

import jakarta.persistence.*;

import java.util.UUID;


@Entity // Marca la clase como una entidad gestionada por JPA


@Table(name = "carrera", schema = "miguel") // Especifica que la tabla se llamará "carrera"
public class EntidadCarrera { // Clase que representa la entidad Carrera

   
    @Id  // Indica que este atributo es la clave primaria de la tabla

    // Genera automáticamente el valor del ID utilizando UUID
    @GeneratedValue(strategy = GenerationType.UUID) // Configura la generación automática del ID como UUID

    // Define el nombre de la columna en la base de datos
    @Column(name = "id_carrera") // Mapea el atributo con la columna "id_carrera"
    private UUID idCarrera; // Atributo que almacena el identificador de la carrera

    // Relación muchos a uno: Muchas carreras pueden pertenecer a una misma escuela
    @ManyToOne(fetch = FetchType.LAZY) // Define la relación muchos a uno con carga perezosa

    // Define la columna que actúa como clave foránea en la tabla
    // nullable = false indica que el campo es obligatorio
    @JoinColumn(name = "id_escuela", nullable = false) // Columna FK que referencia a la escuela
    private EntidadEscuela escuela; // Atributo que representa la escuela asociada

    // Columna que guarda el nombre de la carrera
    // nullable = false significa que no puede ser nulo
    @Column(name = "nombre_carrera", nullable = false) // Mapea el nombre de la carrera en la BD
    private String nombreCarrera; // Atributo que almacena el nombre de la carrera

    // Constructor vacío obligatorio para JPA
    public EntidadCarrera() { // Constructor sin argumentos requerido por JPA
    }

   
    public UUID getIdCarrera() { // Método para obtener el ID
        return idCarrera; // Retorna el identificador de la carrera
    }

    
    public void setIdCarrera(UUID idCarrera) { // Método para asignar el ID
        this.idCarrera = idCarrera; // Establece el valor del identificador
    }

    
    public EntidadEscuela getEscuela() { // Método para obtener la escuela
        return escuela; // Retorna la escuela asociada
    }

    
    public void setEscuela(EntidadEscuela escuela) { // Método para asignar la escuela
        this.escuela = escuela; // Establece la escuela asociada
    }

    
    public String getNombreCarrera() { // Método para obtener el nombre de la carrera
        return nombreCarrera; // Retorna el nombre de la carrera
    }

    
    public void setNombreCarrera(String nombreCarrera) { // Método para asignar el nombre
        this.nombreCarrera = nombreCarrera; // Establece el nombre de la carrera
    }
}