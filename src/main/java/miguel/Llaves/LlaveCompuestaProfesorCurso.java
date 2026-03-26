package miguel.Llaves;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable // Indica que esta clase puede ser incrustada como clave compuesta en otra entidad
public class LlaveCompuestaProfesorCurso implements Serializable { // Define una clase de llave compuesta que implementa Serializable

    private UUID idProfesor; // Identificador único del profesor
    private UUID idCurso; // Identificador único del curso

    public UUID getIdProfesor() { // Método getter para obtener el id del profesor
        return idProfesor; // Retorna el id del profesor
    }

    public void setIdProfesor(UUID idProfesor) { // Método setter para asignar el id del alumno
        this.idProfesor = idProfesor; // Asigna el valor recibido al atributo idProfesor
    }

    public UUID getIdCurso() { // Método getter para obtener el id del curso
        return idCurso; // Retorna el id del curso
    }

    public void setIdCurso(UUID idCurso) { // Método setter para asignar el id del curso
        this.idCurso = idCurso; // Asigna el valor recibido al atributo idCurso
    }

    @Override // Indica que se sobrescribe el método equals de la clase Object
    public boolean equals(Object o) { // Método para comparar si dos objetos son iguales
        if (this == o) // Verifica si ambos objetos son la misma instancia
            return true; // Retorna true si son la misma instancia
        if (!(o instanceof LlaveCompuestaProfesorCurso)) // Verifica si el objeto es de tipo LlaveCompuestaProfesorCurso
            return false; // Retorna false si no es del mismo tipo
            LlaveCompuestaProfesorCurso that = (LlaveCompuestaProfesorCurso) o; // Realiza el casteo del objeto a la clase correspondiente
        return Objects.equals(idProfesor, that.idProfesor) && // Compara el idAlumno de ambos objetos
                Objects.equals(idCurso, that.idCurso); // Compara el idCurso de ambos objetos
    }

    @Override // Indica que se sobrescribe el método hashCode de la clase Object
    public int hashCode() { // Método que genera el código hash del objeto
        return Objects.hash(idProfesor, idCurso); // Genera un hash basado en los atributos idProfesor e idCurso
    }
}