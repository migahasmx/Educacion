package miguel.Entidad;

import jakarta.persistence.*;
import java.util.UUID;

@Entity // Indica que esta clase es una entidad JPA que se mapeará a una tabla en la base de datos
@Table(name = "materia", schema = "miguel") // Especifica el nombre de la tabla en la base de datos
public class EntidadMateria { // Declaración de la clase que representa la entidad materia

    @Id // Indica que este campo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.UUID) // Define que el valor de la clave primaria se generará automáticamente como UUID
    @Column(name = "id_materia") // Mapea el campo a la columna "id_materia" en la tabla
    private UUID idMateria; // Variable que almacena el identificador único de la materia

    @Column(name = "nombre_materia", nullable = false) // Mapea el campo a la columna "nombre_materia" y no permite valores nulos
    private String nombreMateria; // Variable que almacena el nombre de la materia

    @Column(name = "creditos_materia") // Mapea el campo a la columna "creditos_materia"
    private Integer creditosMateria; // Variable que almacena los créditos de la materia

    public EntidadMateria() { // Constructor vacío requerido por JPA
    }

    public UUID getIdMateria() { // Método getter que devuelve el id de la materia
        return idMateria; // Retorna el valor del identificador
    }

    public void setIdMateria(UUID idMateria) { // Método setter que asigna un valor al id de la materia
        this.idMateria = idMateria; // Asigna el valor recibido al atributo idMateria
    }

    public String getNombreMateria() { // Método getter que devuelve el nombre de la materia
        return nombreMateria; // Retorna el valor del nombre
    }

    public void setNombreMateria(String nombreMateria) { // Método setter que asigna un valor al nombre de la materia
        this.nombreMateria = nombreMateria; // Asigna el valor recibido al atributo nombreMateria
    }

    public Integer getCreditosMateria() { // Método getter que devuelve los créditos de la materia
        return creditosMateria; // Retorna el valor de los créditos
    }

    public void setCreditosMateria(Integer creditosMateria) { // Método setter que asigna un valor a los créditos de la materia
        this.creditosMateria = creditosMateria; // Asigna el valor recibido al atributo creditosMateria
    }
}