package miguel.Servicio.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import miguel.Entidad.EntidadTaller;
import miguel.Repositorio.TallerRepositorio;
import miguel.Servicio.TallerServicio;


@Service // Aquí se implementa la lógica de negocio definida en TallerServicio.
public class TallerImplementacionServicio implements TallerServicio { // Implementación de la interfaz TallerServicio

    @Autowired // Inyección automática del repositorio
    private TallerRepositorio repositorio; // Repositorio para acceder a la base de datos

    @Override // Indica que se sobrescribe un método de la interfaz
    public void guardar(EntidadTaller parametro) { // Método para guardar un taller
        EntidadTaller t = new EntidadTaller(); // Se crea una nueva instancia de EntidadTaller

        t.setNombreTaller(parametro.getNombreTaller()); // Se asigna el nombre del taller desde el parámetro recibido
        t.setDivisionTaller(parametro.getDivisionTaller()); // Se asigna la división del taller desde el parámetro recibido

        repositorio.save(t); // Se guarda el objeto en la base de datos
    }

    @Override // Indica que se sobrescribe un método de la interfaz
    public List<EntidadTaller> listar() { // Método para listar todos los talleres
        return repositorio.findAll(); // Retorna la lista de todos los registros en la base de datos
    }
}