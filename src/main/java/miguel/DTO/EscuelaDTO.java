package miguel.DTO;

import java.util.UUID;

public class EscuelaDTO {

    private UUID idEscuela; // Identificador único de la escuela
    private String nombreEscuela; // Nombre de la escuela
    private String direccionEscuela; // Dirección de la escuela

    public EscuelaDTO() { // Constructor vacío de la clase
    }

    public UUID getIdEscuela() { // Método para obtener el id de la escuela
        return idEscuela; // Retorna el identificador de la escuela
    }

    public void setIdEscuela(UUID idEscuela) { // Método para asignar el id de la escuela
        this.idEscuela = idEscuela; // Asigna el valor al identificador de la escuela
    }

    public String getNombreEscuela() { // Método para obtener el nombre de la escuela
        return nombreEscuela; // Retorna el nombre de la escuela
    }

    public void setNombreEscuela(String nombreEscuela) { // Método para asignar el nombre de la escuela
        this.nombreEscuela = nombreEscuela; // Asigna el valor al nombre de la escuela
    }

    public String getDireccionEscuela() { // Método para obtener la dirección de la escuela
        return direccionEscuela; // Retorna la dirección de la escuela
    }

    public void setDireccionEscuela(String direccionEscuela) { // Método para asignar la dirección de la escuela
        this.direccionEscuela = direccionEscuela; // Asigna el valor a la dirección de la escuela
    }
}