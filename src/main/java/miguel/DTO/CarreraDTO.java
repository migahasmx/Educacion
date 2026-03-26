package miguel.DTO;

import java.util.UUID;


public class CarreraDTO {

    private UUID idCarrera; // Almacena el identificador único de la carrera

    private String nombreCarrera; // Guarda el nombre de la carrera

    private UUID idEscuela; // Contiene el identificador único de la escuela

    private String nombreEscuela; // Almacena el nombre de la escuela

    public CarreraDTO() { // Constructor vacío necesario para inicializar el objeto sin valores
    }

    public UUID getIdCarrera() { // Método que retorna el identificador de la carrera
        return idCarrera; // Devuelve el valor de idCarrera
    }

    public void setIdCarrera(UUID idCarrera) { // Método que asigna un identificador a la carrera
        this.idCarrera = idCarrera; // Establece el valor recibido en idCarrera
    }

    public String getNombreCarrera() { // Método que retorna el nombre de la carrera
        return nombreCarrera; // Devuelve el valor de nombreCarrera
    }

    public void setNombreCarrera(String nombreCarrera) { // Método que asigna un nombre a la carrera
        this.nombreCarrera = nombreCarrera; // Establece el valor recibido en nombreCarrera
    }

    public UUID getIdEscuela() { // Método que retorna el identificador de la escuela
        return idEscuela; // Devuelve el valor de idEscuela
    }

    public void setIdEscuela(UUID idEscuela) { // Método que asigna un identificador a la escuela
        this.idEscuela = idEscuela; // Establece el valor recibido en idEscuela
    }

    public String getNombreEscuela() { // Método que retorna el nombre de la escuela
        return nombreEscuela; // Devuelve el valor de nombreEscuela
    }

    public void setNombreEscuela(String nombreEscuela) { // Método que asigna un nombre a la escuela
        this.nombreEscuela = nombreEscuela; // Establece el valor recibido en nombreEscuela
    }
}