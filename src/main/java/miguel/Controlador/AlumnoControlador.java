package miguel.Controlador;

import miguel.DTO.AlumnoDTO;
import miguel.Servicio.AlumnoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller // Define la clase como un controlador de Spring MVC
@RequestMapping("/alumnos") // Mapea las solicitudes HTTP a la ruta /alumnos
public class AlumnoControlador { // Declara la clase controladora de alumnos

    @Autowired // Inyecta automáticamente la dependencia AlumnoServicio
    private AlumnoServicio alumnoServicio; // Declara la variable de servicio para operaciones de alumnos

    @GetMapping // Mapea solicitudes GET para listar alumnos
    public ModelAndView listar() { // Define el método para listar alumnos
        ModelAndView ModelAndView = null;
        ModelAndView = new ModelAndView("alumno/lista_alumno"); // Crea un objeto que envia la vista de lista de alumnos
        ModelAndView.addObject("alumnos", alumnoServicio.listarTodos()); // Agrega la lista de alumnos al modelo
        return ModelAndView; // Retorna la vista con los datos
    }

    @GetMapping("/nuevo") // Mapea solicitudes GET para mostrar el formulario de nuevo alumno
    public ModelAndView nuevoForm() { // Define el método para mostrar el formulario de registro
        ModelAndView ModelAndView = null;
        ModelAndView = new ModelAndView("alumno/registro_alumno"); // Crea un objeto ModelAndView con la vista de registro de alumno
        ModelAndView.addObject("alumno", new AlumnoDTO()); // Agrega un nuevo objeto AlumnoDTO al modelo
        ModelAndView.addObject("accion", "Crear"); // Agrega la acción Crear al modelo
        return ModelAndView; // Retorna la vista de registro
    }

    @PostMapping("/guardar") // Mapea solicitudes POST para guardar un alumno
    public ModelAndView guardar(@ModelAttribute AlumnoDTO alumnoDTO) { // Define el método para guardar un alumno
        alumnoServicio.guardar(alumnoDTO); // Guarda el alumno usando el servicio
        return new ModelAndView("redirect:/alumnos"); // Redirige a la lista de alumnos
    }

}