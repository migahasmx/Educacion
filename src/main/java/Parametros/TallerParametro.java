package Parametros;

import java.util.UUID;

public class TallerParametro {

    private UUID id; // Identificador único del taller
    private String nombreTaller; // Nombre del taller
    private String divisionTaller; // División o categoría a la que pertenece el taller

    public UUID getId() { return id; } // Método para obtener el identificador del taller
    public void setId(UUID id) { this.id = id; } // Método para establecer el identificador del taller

    public String getNombreTaller() { return nombreTaller; } // Método para obtener el nombre del taller
    public void setNombreTaller(String nombreTaller) { this.nombreTaller = nombreTaller; } // Método para establecer el nombre del taller

    public String getDivisionTaller() { return divisionTaller; } // Método para obtener la división del taller
    public void setDivisionTaller(String divisionTaller) { this.divisionTaller = divisionTaller; } // Método para establecer la división del taller
}

