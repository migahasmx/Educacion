package miguel.Controlador;

import miguel.DTO.CarreraDTO;
import miguel.Servicio.CarreraServicio;
import miguel.Servicio.EscuelaServicio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

/*
 Controlador de Spring MVC encargado de manejar
 las peticiones HTTP relacionadas con las carreras.
 */
@Controller // Marca la clase como controlador de Spring MVC

/*
 * Todas las rutas de este controlador comienzan con /carreras
 */
@RequestMapping("/carreras") // Define la ruta base para todas las peticiones
public class CarreraControlador {

    // Servicio de carreras
    private final CarreraServicio carreraServicio; // Servicio para lógica de negocio de carreras

    // Servicio de escuelas
    private final EscuelaServicio escuelaServicio; // Servicio para lógica de negocio de escuelas

    /*
     * Constructor con inyección de dependencias
     */
    public CarreraControlador(CarreraServicio carreraServicio,
            EscuelaServicio escuelaServicio) {
        this.carreraServicio = carreraServicio; // Inicializa el servicio de carreras
        this.escuelaServicio = escuelaServicio; // Inicializa el servicio de escuelas
    }

    /*
     * Muestra la lista de carreras
     * URL: /carreras
     */
    @GetMapping // Maneja solicitudes GET a /carreras
    public ModelAndView listar() {
        ModelAndView ModelAndView = null; // Declara la variable de la vista
         ModelAndView = new ModelAndView("carrera/lista_carreras"); // Crea la vista lista_carreras

        ModelAndView.addObject("carreras", carreraServicio.listarTodas()); // Agrega la lista de carreras al modelo

        return ModelAndView; // Retorna la vista con los datos
    }

    /*
     * Muestra el formulario para crear una nueva carrera
     */
    @GetMapping("/nueva") // Maneja solicitudes GET a /carreras/nueva
    public ModelAndView nuevaForm() {
        ModelAndView ModelAndView = null; // Declara la variable de la vista
         ModelAndView = new ModelAndView("carrera/registro_carrera"); // Crea la vista del formulario

        ModelAndView.addObject("carrera", new CarreraDTO()); // Agrega un objeto vacío para el formulario

        ModelAndView.addObject("escuelas", escuelaServicio.listarTodas()); // Agrega la lista de escuelas

        ModelAndView.addObject("accion", "Crear"); // Indica que la acción es crear

        return ModelAndView; // Retorna la vista con los datos
    }

    /*
     * Guarda una nueva carrera
     */
    @PostMapping("/guardar") // Maneja solicitudes POST a /carreras/guardar
    public ModelAndView guardar(@ModelAttribute CarreraDTO carreraDTO) { // Recibe los datos del formulario

        carreraServicio.guardar(carreraDTO); // Guarda la nueva carrera

        return new ModelAndView("redirect:/carreras"); // Redirige a la lista de carreras
    }

    /*
     * Muestra el formulario para editar una carrera
     */
    @GetMapping("/editar/{id}") // Maneja solicitudes GET con un ID en la URL
    public ModelAndView editarForm(@PathVariable UUID id) { // Recibe el ID desde la URL
        ModelAndView ModelAndView = null; // Declara la variable de la vista
         ModelAndView = new ModelAndView("carrera/registro_carrera"); // Reutiliza la vista de formulario

        ModelAndView.addObject("carrera", carreraServicio.buscarPorId(id)); // Carga la carrera por ID

        ModelAndView.addObject("escuelas", escuelaServicio.listarTodas()); // Agrega la lista de escuelas

        ModelAndView.addObject("accion", "Editar"); // Indica que la acción es editar

        return ModelAndView; // Retorna la vista con los datos
    }

    /*
     * Actualiza una carrera existente
     */
    @PostMapping("/actualizar") // Maneja solicitudes POST para actualizar
    public ModelAndView actualizar(@ModelAttribute CarreraDTO carreraDTO) { // Recibe los datos actualizados

        // carreraServicio.actualizar(carreraDTO); // Actualiza la carrera en el sistema

        return new ModelAndView("redirect:/carreras"); // Redirige a la lista de carreras
    }

    /*
     * Elimina una carrera
     */
    @PostMapping("/eliminar/{id}") // Maneja solicitudes POST para eliminar por ID
    public ModelAndView eliminar(@PathVariable UUID id) { // Recibe el ID desde la URL

        // carreraServicio.eliminar(id); // Elimina la carrera

        return new ModelAndView("redirect:/carreras"); // Redirige a la lista de carreras
    }

    /*
     * Muestra la lista de carreras agrupadas por escuela
     */
    @GetMapping("/lista_carreras_por_escuela") // Maneja solicitudes GET para listar agrupadas
    public ModelAndView listarAgrupadas() {

        /*
         * Se crea la vista que mostrará las carreras agrupadas
         */
        ModelAndView ModelAndView = null; // Declara la variable de la vista
         ModelAndView = new ModelAndView("carrera/lista_carreras_por_escuela"); // Crea la vista correspondiente

        /*
         * Se agrega al modelo la lista agrupada usando el nuevo método del servicio
         */
        ModelAndView.addObject("lista", carreraServicio.listarCarrerasAgrupadasPorEscuela()); // Agrega datos agrupados

        return ModelAndView; // Retorna la vista con los datos
    }
}