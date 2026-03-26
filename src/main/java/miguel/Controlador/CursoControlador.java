package miguel.Controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import Parametros.CursoParametro;
import miguel.Entidad.EntidadCurso;
import miguel.Servicio.CursoServicio;

@Controller //Define la clase como un controlador de Spring
@RequestMapping("/curso") //Define la ruta base para las peticiones del controlador
public class CursoControlador {

    @Autowired //Inyecta automáticamente el servicio de curso
    private CursoServicio servicioCurso; //Declara la variable del servicio de curso

    @RequestMapping(value = "/nuevo", method = { RequestMethod.GET, RequestMethod.POST }) //Mapea la ruta /nuevo para métodos GET y POST
    public ModelAndView mostrarRegistroCurso() { //Define el método para mostrar el formulario de registro de curso
        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView(); //Crea un objeto ModelAndView

        ModelAndView.addObject("cursoParametro", new CursoParametro()); //Agrega un objeto CursoParametro al modelo
        ModelAndView.setViewName("curso/registro_curso"); //Define la vista del formulario de registro de curso

        return ModelAndView; //Retorna el objeto ModelAndView
    }

    @RequestMapping(value = "/guardar_curso", method = RequestMethod.POST) //Mapea la ruta /guardar_curso para método POST
    public ModelAndView guardarCurso(@ModelAttribute CursoParametro cursoParametro) { //Define el método para guardar un curso

        EntidadCurso curso = new EntidadCurso(); //Crea un objeto EntidadCurso
        curso.setIdCurso(null); //Asigna null al id del curso
        curso.setNombreCurso(cursoParametro.getNombreCurso()); //Asigna el nombre del curso desde el parámetro
        curso.setDivision_curso(cursoParametro.getDivisionCurso()); //Asigna la división del curso desde el parámetro

        this.servicioCurso.guardarCurso(curso); //Llama al servicio para guardar el curso

        return new ModelAndView("redirect:/curso/lista"); //Redirige a la lista de cursos
    }

    @RequestMapping(value = "/lista", method = { RequestMethod.GET, RequestMethod.POST }) //Mapea la ruta /lista para métodos GET y POST
    public ModelAndView listaCursos() { //Define el método para listar los cursos
        ArrayList<EntidadCurso> listaCursos = null; //Declara la lista de cursos
        listaCursos = new ArrayList<>(this.servicioCurso.obtenerTodosLosCursos()); //Obtiene y asigna la lista de cursos desde el servicio

        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView(); //Crea un objeto ModelAndView

        ModelAndView.addObject("lista_curso", listaCursos); //Agrega la lista de cursos al modelo
        ModelAndView.setViewName("curso/lista_curso"); //Define la vista de lista de cursos

        return ModelAndView; //Retorna el objeto ModelAndView
    }
}