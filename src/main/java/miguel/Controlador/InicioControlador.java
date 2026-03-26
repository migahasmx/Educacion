package miguel.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller //Define la clase como un controlador de Spring

public class InicioControlador {

   
    @GetMapping("/") //Mapea la ruta raíz "/" a este método
    
    public ModelAndView inicio() { //Define el método que maneja la solicitud inicial y retorna una vista

        return new ModelAndView("index"); //Retorna la vista llamada "index"
    }
}