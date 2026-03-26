package miguel.DTO;

import java.util.UUID;

public class MateriaDTO {

    private UUID idMateria; // Identificador único de la materia
    private String nombreMateria; // Nombre de la materia
    private Integer creditosMateria; // Número de créditos de la materia

    public MateriaDTO() { // Constructor vacío de la clase MateriaDTO
    }

    public UUID getIdMateria() { // Método para obtener el id de la materia
        return idMateria; // Retorna el identificador de la materia
    }

    public void setIdMateria(UUID idMateria) { // Método para establecer el id de la materia
        this.idMateria = idMateria; // Asigna el valor al identificador de la materia
    }

    public String getNombreMateria() { // Método para obtener el nombre de la materia
        return nombreMateria; // Retorna el nombre de la materia
    }

    public void setNombreMateria(String nombreMateria) { // Método para establecer el nombre de la materia
        this.nombreMateria = nombreMateria; // Asigna el valor al nombre de la materia
    }

    public Integer getCreditosMateria() { // Método para obtener los créditos de la materia
        return creditosMateria; // Retorna el número de créditos de la materia
    }

    public void setCreditosMateria(Integer creditosMateria) { // Método para establecer los créditos de la materia
        this.creditosMateria = creditosMateria; // Asigna el valor a los créditos de la materia
    }
}