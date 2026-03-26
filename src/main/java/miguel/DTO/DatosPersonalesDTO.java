package miguel.DTO;

import java.util.UUID;

public class DatosPersonalesDTO {

    private UUID idDatosPersonales; // Identificador único de los datos personales
    private String curp; // Clave Única de Registro de Población
    private String nombre; // Nombre de la persona
    private String apellidos; // Apellidos de la persona
    private Integer edad; // Edad de la persona
    private String grupoSanguineo; // Grupo sanguíneo de la persona

    public DatosPersonalesDTO() { // Constructor vacío de la clase
    }

    public UUID getIdDatosPersonales() { // Método para obtener el id de datos personales
        return idDatosPersonales; // Retorna el identificador
    }

    public void setIdDatosPersonales(UUID idDatosPersonales) { // Método para asignar el id de datos personales
        this.idDatosPersonales = idDatosPersonales; // Asigna el valor al atributo
    }

    public String getCurp() { // Método para obtener la CURP
        return curp; // Retorna la CURP
    }

    public void setCurp(String curp) { // Método para asignar la CURP
        this.curp = curp; // Asigna el valor al atributo
    }

    public String getNombre() { // Método para obtener el nombre
        return nombre; // Retorna el nombre
    }

    public void setNombre(String nombre) { // Método para asignar el nombre
        this.nombre = nombre; // Asigna el valor al atributo
    }

    public String getApellidos() { // Método para obtener los apellidos
        return apellidos; // Retorna los apellidos
    }

    public void setApellidos(String apellidos) { // Método para asignar los apellidos
        this.apellidos = apellidos; // Asigna el valor al atributo
    }

    public Integer getEdad() { // Método para obtener la edad
        return edad; // Retorna la edad
    }

    public void setEdad(Integer edad) { // Método para asignar la edad
        this.edad = edad; // Asigna el valor al atributo
    }

    public String getGrupoSanguineo() { // Método para obtener el grupo sanguíneo
        return grupoSanguineo; // Retorna el grupo sanguíneo
    }

    public void setGrupoSanguineo(String grupoSanguineo) { // Método para asignar el grupo sanguíneo
        this.grupoSanguineo = grupoSanguineo; // Asigna el valor al atributo
    }
}