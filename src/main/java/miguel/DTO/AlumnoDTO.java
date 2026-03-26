package miguel.DTO;

import java.util.UUID;

public class AlumnoDTO {

    private UUID idAlumno; // Identificador único del alumno
    private String matricula; // Matrícula del alumno
    private String curp; // CURP del alumno (Clave Única de Registro de Población)
    private String nombre; // Nombre del alumno
    private String apellidos; // Apellidos del alumno
    private Integer edad; // Edad del alumno
    private String grupoSanguineo; // Grupo sanguíneo del alumno

    public AlumnoDTO() { // Constructor vacío de la clase AlumnoDTO
    }

    public UUID getIdAlumno() { // Método para obtener el id del alumno
        return idAlumno; // Retorna el identificador del alumno
    }

    public void setIdAlumno(UUID idAlumno) { // Método para asignar el id del alumno
        this.idAlumno = idAlumno; // Asigna el valor recibido al id del alumno
    }

    public String getMatricula() { // Método para obtener la matrícula
        return matricula; // Retorna la matrícula del alumno
    }

    public void setMatricula(String matricula) { // Método para asignar la matrícula
        this.matricula = matricula; // Asigna la matrícula al atributo correspondiente
    }

    public String getCurp() { // Método para obtener la CURP
        return curp; // Retorna la CURP del alumno
    }

    public void setCurp(String curp) { // Método para asignar la CURP
        this.curp = curp; // Asigna la CURP al atributo correspondiente
    }

    public String getNombre() { // Método para obtener el nombre
        return nombre; // Retorna el nombre del alumno
    }

    public void setNombre(String nombre) { // Método para asignar el nombre
        this.nombre = nombre; // Asigna el nombre al atributo correspondiente
    }

    public String getApellidos() { // Método para obtener los apellidos
        return apellidos; // Retorna los apellidos del alumno
    }

    public void setApellidos(String apellidos) { // Método para asignar los apellidos
        this.apellidos = apellidos; // Asigna los apellidos al atributo correspondiente
    }

    public Integer getEdad() { // Método para obtener la edad
        return edad; // Retorna la edad del alumno
    }

    public void setEdad(Integer edad) { // Método para asignar la edad
        this.edad = edad; // Asigna la edad al atributo correspondiente
    }

    public String getGrupoSanguineo() { // Método para obtener el grupo sanguíneo
        return grupoSanguineo; // Retorna el grupo sanguíneo del alumno
    }

    public void setGrupoSanguineo(String grupoSanguineo) { // Método para asignar el grupo sanguíneo
        this.grupoSanguineo = grupoSanguineo; // Asigna el grupo sanguíneo al atributo correspondiente
    }
}