package miguel.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import miguel.Entidad.*;
import miguel.Llaves.LlaveCompuestaProfesorCurso;
import miguel.Repositorio.*;

import java.util.UUID;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller //Define la clase como un controlador de Spring MVC
@RequestMapping("/profesor-curso") //Define la ruta base para las peticiones del controlador
public class ProfesorCursoControlador { //Declara la clase ProfesorCursoControlador

    @Autowired //Inyecta automáticamente el repositorio de profesores
    private ProfesorRepositorio profesorRepo; //Declara el repositorio de profesores

    @Autowired //Inyecta automáticamente el repositorio de cursos
    private CursoRepositorio cursoRepo; //Declara el repositorio de cursos

    @Autowired //Inyecta automáticamente el repositorio de la relación profesores-curso
    private ProfesorCursoRepositorio profesorCursoRepo; //Declara el repositorio profesores-curso

    @GetMapping("/nuevo") //Mapea la ruta GET para mostrar el formulario
    public ModelAndView formulario() { //Método que prepara el formulario de registro
        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView("curso/profesor_curso_registro"); //Crea un objeto ModelAndView con la vista del formulario
        ModelAndView.addObject("profesores", profesorRepo.findAll()); //Agrega la lista de profesores al modelo
        ModelAndView.addObject("cursos", cursoRepo.findAll()); //Agrega la lista de cursos al modelo
        return ModelAndView; //Retorna el objeto ModelAndView
    }

    @PostMapping("/guardar") //Mapea la ruta POST para guardar la relación
    public String guardar(@RequestParam UUID idProfesor, @RequestParam UUID idCurso) { //Método que guarda la relación profesores-curso

        boolean existe = profesorCursoRepo //Verifica si ya existe la relación profesores-curso
                .existsByProfesor_IdProfesorAndCurso_IdCurso(idProfesor, idCurso); //Consulta si existe la relación en la base de datos

        if (existe) { //Evalúa si la relación ya existe
            return "redirect:/curso/nuevo?error=duplicado"; //Redirige indicando error por duplicado
        }

        EntidadProfesor profesor = profesorRepo.findById(idProfesor).orElseThrow(); //Obtiene el alumno por su id
        EntidadCurso curso = cursoRepo.findById(idCurso).orElseThrow(); //Obtiene el curso por su id

        EntidadProfesorCurso profesorcurso = new EntidadProfesorCurso(); //Crea una nueva instancia de la relación profesor-curso

        LlaveCompuestaProfesorCurso llave = new LlaveCompuestaProfesorCurso(); //Crea la llave compuesta
        llave.setIdProfesor(idProfesor); //Asigna el id del profesor a la llave
        llave.setIdCurso(idCurso); //Asigna el id del curso a la llave

        profesorcurso.setId(llave); //Asigna la llave compuesta a la entidad
        profesorcurso.setProfesor(profesor); //Asigna el profesor a la entidad
        profesorcurso.setCurso(curso); //Asigna el curso a la entidad

        profesorCursoRepo.save(profesorcurso); //Guarda la relación en la base de datos

        return "redirect:/"; //Redirige a la página principal
    }

    @GetMapping("/profesores-por-curso") //Mapea la ruta GET para consultar alumnos por taller
    public ModelAndView profesoresPorCurso(@RequestParam(required = false) UUID idCurso) { //Método que obtiene profesores por curso
        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView("curso/profesores_por_curso"); //Crea el objeto ModelAndView con la vista correspondiente
        ModelAndView.addObject("cursos", cursoRepo.findAll()); //Agrega la lista de talleres al modelo

        if (idCurso != null) { //Verifica si se recibió un id de curso

            List<EntidadProfesorCurso> lista = profesorCursoRepo.findByCurso_IdCurso(idCurso); //Obtiene la lista de relaciones por id de curso
            ModelAndView.addObject("lista", lista); //Agrega la lista al modelo

        } else {

            List<EntidadProfesorCurso> lista = profesorCursoRepo.findAll(); //Obtiene todas las relaciones profesor-curso

            Map<Object,List<EntidadProfesorCurso>> agrupados = lista.stream() //Agrupa las relaciones por nombre del curso
                    .collect(Collectors.groupingBy(
                        profesorcurso -> profesorcurso.getCurso().getNombreCurso())); //Define el criterio de agrupación

            ModelAndView.addObject("agrupados", agrupados); //Agrega los datos agrupados al modelo
        }

        return ModelAndView; //Retorna el objeto ModelAndView
    }

    @GetMapping("/cursos-por-profesor") //Mapea la ruta GET para consultar talleres por profesor
    public ModelAndView cursosPorProfesor(@RequestParam(required = false) UUID idProfesor) { //Método que obtiene cursos por profesor
        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView("curso/cursos_por_profesor"); //Crea el objeto ModelAndView con la vista correspondiente
        ModelAndView.addObject("alumnos", profesorRepo.findAll()); //Agrega la lista de profesores al modelo

        if (idProfesor != null) { //Verifica si se recibió un id de profesor

            List<EntidadProfesorCurso> lista = profesorCursoRepo.findByProfesor_IdProfesor(idProfesor); //Obtiene la lista de relaciones por id de profesor
            ModelAndView.addObject("lista", lista); //Agrega la lista al modelo

        } else {

            List<EntidadProfesorCurso> lista = profesorCursoRepo.findAll(); //Obtiene todas las relaciones profesor-curso

            Map<String, List<EntidadProfesorCurso>> agrupados = lista.stream() //Agrupa las relaciones por nombre del profesor
                    .collect(Collectors.groupingBy(
                        profesorcurso -> profesorcurso.getProfesor().getDatosPersonales().getNombre())); //Define el criterio de agrupación

            ModelAndView.addObject("agrupados", agrupados); //Agrega los datos agrupados al modelo
        }

        return ModelAndView; //Retorna el objeto ModelAndView
    }
}