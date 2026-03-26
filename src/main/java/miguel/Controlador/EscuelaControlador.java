package miguel.Controlador;

import miguel.DTO.EscuelaDTO;
import miguel.Servicio.EscuelaServicio;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller // Define la clase como un controlador de Spring MVC
@RequestMapping("/escuelas") // Mapea las solicitudes HTTP a la ruta /escuelas
public class EscuelaControlador {

    @Autowired // Inyecta automáticamente la dependencia EscuelaServicio
    private EscuelaServicio escuelaServicio;

    @GetMapping // Mapea solicitudes GET para listar escuelas
    public ModelAndView listar() {
        ModelAndView ModelAndView = null; // Declara la variable ModelAndView
        ModelAndView = new ModelAndView("escuela/lista_escuelas"); // Crea un objeto ModelAndView con la vista de lista de escuelas
        ModelAndView.addObject("escuelas", escuelaServicio.listarTodas()); // Agrega al modelo la lista de todas las escuelas
        return ModelAndView; // Retorna el objeto ModelAndView con la información
    }

    @GetMapping("/nueva") // Mapea solicitudes GET para mostrar formulario de nueva escuela
    public ModelAndView nuevaForm() {
        ModelAndView ModelAndView = null; // Declara la variable ModelAndView
        ModelAndView = new ModelAndView("escuela/registro_escuela"); // Crea un objeto ModelAndView con la vista de registro de escuela
        ModelAndView.addObject("escuela", new EscuelaDTO()); // Agrega al modelo un objeto EscuelaDTO vacío
        ModelAndView.addObject("accion", "Crear"); // Agrega al modelo la acción Crear
        return ModelAndView; // Retorna el objeto ModelAndView con la información
    }

    @PostMapping("/guardar") // Mapea solicitudes POST para guardar una escuela
    public ModelAndView guardar(@ModelAttribute EscuelaDTO escuelaDTO) {
        escuelaServicio.guardar(escuelaDTO); // Guarda la escuela utilizando el servicio
        return new ModelAndView("redirect:/escuelas"); // Redirige a la lista de escuelas
    }

    @GetMapping("/editar/{id}") // Mapea solicitudes GET para mostrar formulario de edición
    public ModelAndView editarForm(@PathVariable UUID id) {
        ModelAndView ModelAndView = null; // Declara la variable ModelAndView
        ModelAndView = new ModelAndView("escuela/registro_escuela"); // Crea un objeto ModelAndView con la vista de registro de escuela
        ModelAndView.addObject("escuela", escuelaServicio.buscarPorId(id)); // Agrega al modelo la escuela encontrada por id
        ModelAndView.addObject("accion", "Editar"); // Agrega al modelo la acción Editar
        return ModelAndView; // Retorna el objeto ModelAndView con la información
    }

    @PostMapping("/actualizar/{id}") // Mapea solicitudes POST para actualizar una escuela
    public ModelAndView actualizar(@PathVariable UUID id, @ModelAttribute EscuelaDTO escuelaDTO) {
        escuelaServicio.actualizar(id, escuelaDTO); // Actualiza la escuela utilizando el servicio
        return new ModelAndView("redirect:/escuelas"); // Redirige a la lista de escuelas
    }

    @PostMapping("/eliminar/{id}") // Mapea solicitudes POST para eliminar una escuela
    public ModelAndView eliminar(@PathVariable UUID id) {
        escuelaServicio.eliminar(id); // Elimina la escuela utilizando el servicio
        return new ModelAndView("redirect:/escuelas"); // Redirige a la lista de escuelas
    }

}