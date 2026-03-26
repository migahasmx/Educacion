package miguel.Controlador;

import miguel.DTO.MateriaDTO;
import miguel.Servicio.MateriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller // Indica que esta clase es un controlador de Spring MVC
@RequestMapping("/materias") // Define la ruta base para acceder a este controlador
public class MateriaControlador {

    @Autowired // Inyección automática del servicio de Materia
    private MateriaServicio materiaServicio; // Servicio que contiene la lógica de negocio

    @GetMapping // Maneja peticiones GET a /materias
    public ModelAndView listar() {
        ModelAndView ModelAndView = null; // Declara la variable ModelAndView
         ModelAndView = new ModelAndView("materia/lista_materias"); // Inicializa la vista lista_materias

       
        ModelAndView.addObject("materiasJPA", materiaServicio.listarTodas()); // Agrega lista de materias usando JPA al modelo

        
        ModelAndView.addObject("materiasJPQL", materiaServicio.listarTodasJPQL()); // Agrega lista de materias usando JPQL al modelo

        return ModelAndView; // Retorna la vista con los datos cargados
    }

    @GetMapping("/nueva") // Maneja peticiones GET a /materias/nueva
    public ModelAndView nuevaForm() {
        ModelAndView ModelAndView = null; // Declara la variable ModelAndView
         ModelAndView = new ModelAndView("materia/registro_materia"); // Inicializa la vista de registro

        ModelAndView.addObject("materia", new MateriaDTO()); // Agrega un objeto vacío para el formulario
        ModelAndView.addObject("accion", "Crear"); // Indica la acción que se realizará en la vista
        return ModelAndView; // Retorna la vista de registro
    }

    @PostMapping("/guardar") // Maneja peticiones POST a /materias/guardar
    public ModelAndView guardar(@ModelAttribute MateriaDTO materiaDTO) {
        materiaServicio.guardar(materiaDTO); // Guarda la materia usando el servicio
        return new ModelAndView("redirect:/materias"); // Redirige a la lista de materias
    }
}