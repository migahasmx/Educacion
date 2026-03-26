package miguel.Controlador;

import miguel.DTO.SistemaEscolarDTO;
import miguel.Servicio.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//Define la clase como un controlador de Spring MVC
@Controller
//Define la ruta base para las solicitudes relacionadas con sistema
@RequestMapping("/sistema")
//Declara la clase controladora del sistema escolar
public class SistemaEscolarControlador {

//Inyecta automáticamente el servicio de sistema escolar
    @Autowired
//Declara el servicio de sistema escolar
    private SistemaEscolarServicio sistemaEscolarServicio;

//Inyecta automáticamente el servicio de alumnos
    @Autowired
//Declara el servicio de alumnos
    private AlumnoServicio alumnoServicio;

//Inyecta automáticamente el servicio de profesores
    @Autowired
//Declara el servicio de profesores
    private ProfesorServicio profesorServicio;

//Inyecta automáticamente el servicio de carreras
    @Autowired
//Declara el servicio de carreras
    private CarreraServicio carreraServicio;

//Inyecta automáticamente el servicio de materias
    @Autowired
//Declara el servicio de materias
    private MateriaServicio materiaServicio;

//Mapea solicitudes GET a la ruta base /sistema
    @GetMapping
//Método para listar todos los registros
    public ModelAndView listar() {
//Declara la variable ModelAndView
        ModelAndView ModelAndView = null;
//Inicializa el ModelAndView con la vista de lista de historial
        ModelAndView = new ModelAndView("sistemaescolar/lista_historial");
//Agrega al modelo la lista de registros obtenidos del servicio
        ModelAndView.addObject("registros", sistemaEscolarServicio.listarTodos());
//Retorna el objeto ModelAndView con los datos y la vista
        return ModelAndView;
    }

//Mapea solicitudes GET a la ruta /sistema/nuevo
    @GetMapping("/nuevo")
//Método para mostrar el formulario de nuevo registro
    public ModelAndView nuevoForm() {
//Declara la variable ModelAndView
        ModelAndView ModelAndView = null;
//Inicializa el ModelAndView con la vista de registro de historial
        ModelAndView = new ModelAndView("sistemaescolar/registro_historial");
//Agrega un nuevo objeto SistemaEscolarDTO al modelo
        ModelAndView.addObject("registro", new SistemaEscolarDTO());
//Agrega la lista de alumnos al modelo
        ModelAndView.addObject("alumnos", alumnoServicio.listarTodos());
//Agrega la lista de profesores al modelo
        ModelAndView.addObject("profesores", profesorServicio.listarTodos());
//Agrega la lista de carreras al modelo
        ModelAndView.addObject("carreras", carreraServicio.listarTodas());
//Agrega la lista de materias al modelo
        ModelAndView.addObject("materias", materiaServicio.listarTodas());
//Agrega la acción a realizar (Crear) al modelo
        ModelAndView.addObject("accion", "Crear");
//Retorna el objeto ModelAndView con los datos y la vista
        return ModelAndView;
    }

//Mapea solicitudes POST a la ruta /sistema/guardar
    @PostMapping("/guardar")
//Método para guardar un registro del sistema escolar
    public ModelAndView guardar(@ModelAttribute SistemaEscolarDTO dto) {
//Guarda el objeto DTO en el sistema escolar mediante el servicio
        sistemaEscolarServicio.guardar(dto);
//Redirige a la lista principal del sistema escolar
        return new ModelAndView("redirect:/sistema");
    }

}