package miguel.Llaves;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable // Indica que esta clase puede ser incrustada como clave compuesta en otra entidad
public class LlaveCompuestaTallerAlumno implements Serializable { // Define una clase de llave compuesta que implementa Serializable

    private UUID idAlumno; // Identificador único del alumno
    private UUID idTaller; // Identificador único del taller

    public UUID getIdAlumno() { // Método getter para obtener el id del alumno
        return idAlumno; // Retorna el id del alumno
    }

    public void setIdAlumno(UUID idAlumno) { // Método setter para asignar el id del alumno
        this.idAlumno = idAlumno; // Asigna el valor recibido al atributo idAlumno
    }

    public UUID getIdTaller() { // Método getter para obtener el id del taller
        return idTaller; // Retorna el id del taller
    }

    public void setIdTaller(UUID idTaller) { // Método setter para asignar el id del taller
        this.idTaller = idTaller; // Asigna el valor recibido al atributo idTaller
    }

    @Override // Indica que se sobrescribe el método equals de la clase Object
    public boolean equals(Object o) { // Método para comparar si dos objetos son iguales
        if (this == o) // Verifica si ambos objetos son la misma instancia
            return true; // Retorna true si son la misma instancia
        if (!(o instanceof LlaveCompuestaTallerAlumno)) // Verifica si el objeto es de tipo LlaveCompuestaTallerAlumno
            return false; // Retorna false si no es del mismo tipo
        LlaveCompuestaTallerAlumno that = (LlaveCompuestaTallerAlumno) o; // Realiza el casteo del objeto a la clase correspondiente
        return Objects.equals(idAlumno, that.idAlumno) && // Compara el idAlumno de ambos objetos
                Objects.equals(idTaller, that.idTaller); // Compara el idTaller de ambos objetos
    }

    @Override // Indica que se sobrescribe el método hashCode de la clase Object
    public int hashCode() { // Método que genera el código hash del objeto
        return Objects.hash(idAlumno, idTaller); // Genera un hash basado en los atributos idAlumno e idTaller
    }
}