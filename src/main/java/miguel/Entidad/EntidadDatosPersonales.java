package miguel.Entidad;

import jakarta.persistence.*;
import java.util.UUID;

@Entity // Indica que la clase es una entidad JPA que se mapeará a una tabla en la base de datos
@Table(name = "datospersonales", schema = "miguel") // Especifica el nombre de la tabla en la base de datos
public class EntidadDatosPersonales { // Declaración de la clase que representa la entidad de datos personales

    @Id // Indica que este atributo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.UUID) // Especifica que el valor de la clave primaria se generará automáticamente como UUID
    @Column(name = "id_datospersonales") // Define el nombre de la columna en la base de datos
    private UUID idDatosPersonales; // Atributo que almacena el identificador único de los datos personales

    @Column(name = "curp", nullable = false, unique = true) // Define la columna CURP, obligatoria y única
    private String curp; // Atributo que almacena la CURP de la persona

    @Column(name = "nombre", nullable = false) // Define la columna nombre, obligatoria
    private String nombre; // Atributo que almacena el nombre de la persona

    @Column(name = "apellidos", nullable = false) // Define la columna apellidos, obligatoria
    private String apellidos; // Atributo que almacena los apellidos de la persona

    @Column(name = "edad") // Define la columna edad, opcional
    private Integer edad; // Atributo que almacena la edad de la persona

    @Column(name = "grupo_sanguineo") // Define la columna grupo sanguíneo
    private String grupoSanguineo; // Atributo que almacena el grupo sanguíneo de la persona

    public EntidadDatosPersonales() { // Constructor vacío requerido por JPA para instanciar la entidad
    }

    public UUID getIdDatosPersonales() { // Método getter que devuelve el identificador de los datos personales
        return idDatosPersonales; // Retorna el valor del atributo idDatosPersonales
    }

    public void setIdDatosPersonales(UUID idDatosPersonales) { // Método setter que asigna un valor al identificador
        this.idDatosPersonales = idDatosPersonales; // Establece el valor del atributo idDatosPersonales
    }

    public String getCurp() { // Método getter que devuelve la CURP
        return curp; // Retorna el valor del atributo curp
    }

    public void setCurp(String curp) { // Método setter que asigna una CURP
        this.curp = curp; // Establece el valor del atributo curp
    }

    public String getNombre() { // Método getter que devuelve el nombre
        return nombre; // Retorna el valor del atributo nombre
    }

    public void setNombre(String nombre) { // Método setter que asigna el nombre
        this.nombre = nombre; // Establece el valor del atributo nombre
    }

    public String getApellidos() { // Método getter que devuelve los apellidos
        return apellidos; // Retorna el valor del atributo apellidos
    }

    public void setApellidos(String apellidos) { // Método setter que asigna los apellidos
        this.apellidos = apellidos; // Establece el valor del atributo apellidos
    }

    public Integer getEdad() { // Método getter que devuelve la edad
        return edad; // Retorna el valor del atributo edad
    }

    public void setEdad(Integer edad) { // Método setter que asigna la edad
        this.edad = edad; // Establece el valor del atributo edad
    }

    public String getGrupoSanguineo() { // Método getter que devuelve el grupo sanguíneo
        return grupoSanguineo; // Retorna el valor del atributo grupoSanguineo
    }

    public void setGrupoSanguineo(String grupoSanguineo) { // Método setter que asigna el grupo sanguíneo
        this.grupoSanguineo = grupoSanguineo; // Establece el valor del atributo grupoSanguineo
    }
}