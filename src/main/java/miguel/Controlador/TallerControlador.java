package miguel.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import miguel.Entidad.EntidadTaller;
import miguel.Servicio.TallerServicio;


//Define que la clase es un controlador de Spring MVC
@Controller
//Define la ruta base para acceder a este controlador
@RequestMapping("/taller")
//Declara la clase controladora para manejar las peticiones de taller
public class TallerControlador {

    //Inyecta automáticamente la dependencia del servicio
    @Autowired
    //Declara el servicio que contiene la lógica de negocio
    private TallerServicio servicio;

    //Mapea la petición para mostrar el formulario de nuevo taller
    @GetMapping("/nuevo")
    //Método que prepara y devuelve la vista de registro
    public ModelAndView nuevo() {
        ModelAndView ModelAndView = null;
        //Crea el objeto ModelAndView con la vista de registro
         ModelAndView = new ModelAndView("taller/taller_registro");

        //Agrega un objeto al modelo para el formulario
        ModelAndView.addObject("parametro", new EntidadTaller());

        //Retorna el modelo y la vista configurada
        return ModelAndView;
        
    }  

    //Mapea la petición para guardar un taller
    @PostMapping("/guardar")
    //Método que recibe los datos del formulario y los guarda
    public String guardar(@ModelAttribute EntidadTaller parametro) {
        //Llama al servicio para guardar el taller
        servicio.guardar(parametro);
        //Redirige a la lista de talleres después de guardar
        return "redirect:/taller/lista";
    }

    //Mapea la petición para mostrar la lista de talleres
    @GetMapping("/lista")
    //Método que obtiene y muestra la lista de talleres
    public ModelAndView lista() {
        ModelAndView ModelAndView = null;
        //Crea el objeto con la vista de lista
         ModelAndView = new ModelAndView("taller/taller_lista");
        //Agrega la lista de talleres al modelo
        ModelAndView.addObject("lista", servicio.listar());
        //Retorna el modelo y la vista configurada
        return ModelAndView;
    }
}

 