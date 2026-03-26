package miguel.Servicio;

import java.util.List;
import miguel.Entidad.EntidadTaller;

public interface TallerServicio {

    void guardar(EntidadTaller parametro); // Método para guardar un objeto de tipo EntidadTaller en el sistema

    List<EntidadTaller> listar(); // Método para obtener una lista de todos los objetos EntidadTaller registrados
}