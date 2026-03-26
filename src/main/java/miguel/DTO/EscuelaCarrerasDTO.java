package miguel.DTO;

import java.util.List;

public class EscuelaCarrerasDTO {

    private String nombreEscuela; // Almacena el nombre de la escuela
    private List<CarreraDTO> carreras; // Lista de carreras asociadas a la escuela

    public EscuelaCarrerasDTO() { // Constructor vacío de la clase
    }

    public String getNombreEscuela() { // Método para obtener el nombre de la escuela
        return nombreEscuela; // Retorna el nombre de la escuela
    }

    public void setNombreEscuela(String nombreEscuela) { // Método para establecer el nombre de la escuela
        this.nombreEscuela = nombreEscuela; // Asigna el valor recibido al atributo nombreEscuela
    }

    public List<CarreraDTO> getCarreras() { // Método para obtener la lista de carreras
        return carreras; // Retorna la lista de carreras
    }

    public void setCarreras(List<CarreraDTO> carreras) { // Método para establecer la lista de carreras
        this.carreras = carreras; // Asigna la lista recibida al atributo carreras
    }
}