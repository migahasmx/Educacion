package Parametros;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter // Genera automáticamente los métodos getter para todos los atributos de la clase
@Setter // Genera automáticamente los métodos setter para todos los atributos de la clase
public class CursoParametro {

    private UUID idCurso; // Identificador único del curso utilizando UUID

    private String nombreCurso; // Nombre del curso

    private String divisionCurso; // División o grupo al que pertenece el curso
}