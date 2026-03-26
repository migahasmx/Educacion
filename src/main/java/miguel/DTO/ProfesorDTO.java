package miguel.DTO;

import java.util.UUID;

public class ProfesorDTO { 

    private UUID idProfesor; // Identificador único del profesor
    private String especialidad; // Especialidad o área de conocimiento del profesor
    private String curp; // Clave Única de Registro de Población del profesor
    private String nombre; // Nombre del profesor
    private String apellidos; // Apellidos del profesor
    private Integer edad; // Edad del profesor
    private String grupoSanguineo; // Grupo sanguíneo del profesor

    public ProfesorDTO() { // Constructor vacío de la clase ProfesorDTO
    }

    public UUID getIdProfesor() { // Método getter para obtener el id del profesor
        return idProfesor; // Retorna el identificador del profesor
    }

    public void setIdProfesor(UUID idProfesor) { // Método setter para asignar el id del profesor
        this.idProfesor = idProfesor; // Asigna el identificador del profesor
    }

    public String getEspecialidad() { // Método getter para obtener la especialidad
        return especialidad; // Retorna la especialidad del profesor
    }

    public void setEspecialidad(String especialidad) { // Método setter para asignar la especialidad
        this.especialidad = especialidad; // Asigna la especialidad del profesor
    }

    public String getCurp() { // Método getter para obtener la CURP
        return curp; // Retorna la CURP del profesor
    }

    public void setCurp(String curp) { // Método setter para asignar la CURP
        this.curp = curp; // Asigna la CURP del profesor
    }

    public String getNombre() { // Método getter para obtener el nombre
        return nombre; // Retorna el nombre del profesor
    }

    public void setNombre(String nombre) { // Método setter para asignar el nombre
        this.nombre = nombre; // Asigna el nombre del profesor
    }

    public String getApellidos() { // Método getter para obtener los apellidos
        return apellidos; // Retorna los apellidos del profesor
    }

    public void setApellidos(String apellidos) { // Método setter para asignar los apellidos
        this.apellidos = apellidos; // Asigna los apellidos del profesor
    }

    public Integer getEdad() { // Método getter para obtener la edad
        return edad; // Retorna la edad del profesor
    }

    public void setEdad(Integer edad) { // Método setter para asignar la edad
        this.edad = edad; // Asigna la edad del profesor
    }

    public String getGrupoSanguineo() { // Método getter para obtener el grupo sanguíneo
        return grupoSanguineo; // Retorna el grupo sanguíneo del profesor
    }

    public void setGrupoSanguineo(String grupoSanguineo) { // Método setter para asignar el grupo sanguíneo
        this.grupoSanguineo = grupoSanguineo; // Asigna el grupo sanguíneo del profesor
    }
}