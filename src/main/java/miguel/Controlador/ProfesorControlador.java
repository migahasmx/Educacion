package miguel.Controlador;

import miguel.DTO.ProfesorDTO;
import miguel.Servicio.ProfesorServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//Define la clase como un controlador de Spring
@Controller
//Mapea las solicitudes HTTP a la ruta /profesores
@RequestMapping("/profesores")
//Declara la clase ProfesorControlador
public class ProfesorControlador {

    @Autowired //Inyecta automáticamente la dependencia del servicio
    private ProfesorServicio profesorServicio; //Declara el servicio de profesor

    @GetMapping //Mapea las solicitudes GET a la ruta base
    public ModelAndView listar() { //Define el método para listar profesores
        ModelAndView ModelAndView = null; //Inicializa la variable ModelAndView
        ModelAndView = new ModelAndView("profesor/lista_profesores"); //Crea un objeto con la vista de lista de profesores
        ModelAndView.addObject("profesores", profesorServicio.listarTodos()); //Agrega la lista de profesores al modelo
        return ModelAndView; //Retorna el objeto ModelAndView
    }

    @GetMapping("/nuevo") //Mapea las solicitudes GET a la ruta /nuevo
    public ModelAndView nuevoForm() { //Define el método para mostrar el formulario de nuevo profesor
        ModelAndView ModelAndView = null; //Inicializa la variable ModelAndView
        ModelAndView = new ModelAndView("profesor/registro_profesor"); //Crea un objeto con la vista de registro
        ModelAndView.addObject("profesor", new ProfesorDTO()); //Agrega un objeto profesor vacío al modelo
        ModelAndView.addObject("accion", "Crear"); //Agrega la acción Crear al modelo
        return ModelAndView; //Retorna el objeto ModelAndView
    }

    @PostMapping("/guardar") //Mapea las solicitudes POST a la ruta /guardar
    public ModelAndView guardar(@ModelAttribute ProfesorDTO profesorDTO) { //Define el método para guardar un profesor
        profesorServicio.guardar(profesorDTO); //Guarda el profesor usando el servicio
        return new ModelAndView("redirect:/profesores"); //Redirige a la lista de profesores
    }

}