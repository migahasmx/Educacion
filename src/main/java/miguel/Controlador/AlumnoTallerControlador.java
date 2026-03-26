package miguel.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import miguel.Entidad.*;
import miguel.Llaves.LlaveCompuestaTallerAlumno;
import miguel.Repositorio.*;

import java.util.UUID;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller //Define la clase como un controlador de Spring MVC
@RequestMapping("/alumno-taller") //Define la ruta base para las peticiones del controlador
public class AlumnoTallerControlador { //Declara la clase AlumnoTallerControlador

    @Autowired //Inyecta automáticamente el repositorio de alumnos
    private AlumnoRepositorio alumnoRepo; //Declara el repositorio de alumnos

    @Autowired //Inyecta automáticamente el repositorio de talleres
    private TallerRepositorio tallerRepo; //Declara el repositorio de talleres

    @Autowired //Inyecta automáticamente el repositorio de la relación alumno-taller
    private AlumnoTallerRepositorio alumnoTallerRepo; //Declara el repositorio alumno-taller

    @GetMapping("/nuevo") //Mapea la ruta GET para mostrar el formulario
    public ModelAndView formulario() { //Método que prepara el formulario de registro
        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView("taller/alumno_taller_registro"); //Crea un objeto ModelAndView con la vista del formulario
        ModelAndView.addObject("alumnos", alumnoRepo.findAll()); //Agrega la lista de alumnos al modelo
        ModelAndView.addObject("talleres", tallerRepo.findAll()); //Agrega la lista de talleres al modelo
        return ModelAndView; //Retorna el objeto ModelAndView
    }

    @PostMapping("/guardar") //Mapea la ruta POST para guardar la relación
    public String guardar(@RequestParam UUID idAlumno, @RequestParam UUID idTaller) { //Método que guarda la relación alumno-taller

        boolean existe = alumnoTallerRepo //Verifica si ya existe la relación alumno-taller
                .existsByAlumno_IdAlumnoAndTaller_IdTaller(idAlumno, idTaller); //Consulta si existe la relación en la base de datos

        if (existe) { //Evalúa si la relación ya existe
            return "redirect:/taller/nuevo?error=duplicado"; //Redirige indicando error por duplicado
        }

        EntidadAlumno alumno = alumnoRepo.findById(idAlumno).orElseThrow(); //Obtiene el alumno por su id
        EntidadTaller taller = tallerRepo.findById(idTaller).orElseThrow(); //Obtiene el taller por su id

        EntidadAlumnoTaller alumnotaller = new EntidadAlumnoTaller(); //Crea una nueva instancia de la relación alumno-taller

        LlaveCompuestaTallerAlumno llave = new LlaveCompuestaTallerAlumno(); //Crea la llave compuesta
        llave.setIdAlumno(idAlumno); //Asigna el id del alumno a la llave
        llave.setIdTaller(idTaller); //Asigna el id del taller a la llave

        alumnotaller.setId(llave); //Asigna la llave compuesta a la entidad
        alumnotaller.setAlumno(alumno); //Asigna el alumno a la entidad
        alumnotaller.setTaller(taller); //Asigna el taller a la entidad

        alumnoTallerRepo.save(alumnotaller); //Guarda la relación en la base de datos

        return "redirect:/"; //Redirige a la página principal
    }

    @GetMapping("/alumnos-por-taller") //Mapea la ruta GET para consultar alumnos por taller
    public ModelAndView alumnosPorTaller(@RequestParam(required = false) UUID idTaller) { //Método que obtiene alumnos por taller
        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView("taller/alumnos_por_taller"); //Crea el objeto ModelAndView con la vista correspondiente
        ModelAndView.addObject("talleres", tallerRepo.findAll()); //Agrega la lista de talleres al modelo

        if (idTaller != null) { //Verifica si se recibió un id de taller

            List<EntidadAlumnoTaller> lista = alumnoTallerRepo.findByTaller_IdTaller(idTaller); //Obtiene la lista de relaciones por id de taller
            ModelAndView.addObject("lista", lista); //Agrega la lista al modelo

        } else {

            List<EntidadAlumnoTaller> lista = alumnoTallerRepo.findAll(); //Obtiene todas las relaciones alumno-taller

            Map<String, List<EntidadAlumnoTaller>> agrupados = lista.stream() //Agrupa las relaciones por nombre del taller
                    .collect(Collectors.groupingBy(
                        alumnotaller -> alumnotaller.getTaller().getNombreTaller())); //Define el criterio de agrupación

            ModelAndView.addObject("agrupados", agrupados); //Agrega los datos agrupados al modelo
        }

        return ModelAndView; //Retorna el objeto ModelAndView
    }

    @GetMapping("/talleres-por-alumno") //Mapea la ruta GET para consultar talleres por alumno
    public ModelAndView talleresPorAlumno(@RequestParam(required = false) UUID idAlumno) { //Método que obtiene talleres por alumno
        ModelAndView ModelAndView = null; //Declara la variable ModelAndView
        ModelAndView = new ModelAndView("taller/talleres_por_alumno"); //Crea el objeto ModelAndView con la vista correspondiente
        ModelAndView.addObject("alumnos", alumnoRepo.findAll()); //Agrega la lista de alumnos al modelo

        if (idAlumno != null) { //Verifica si se recibió un id de alumno

            List<EntidadAlumnoTaller> lista = alumnoTallerRepo.findByAlumno_IdAlumno(idAlumno); //Obtiene la lista de relaciones por id de alumno
            ModelAndView.addObject("lista", lista); //Agrega la lista al modelo

        } else {

            List<EntidadAlumnoTaller> lista = alumnoTallerRepo.findAll(); //Obtiene todas las relaciones alumno-taller

            Map<String, List<EntidadAlumnoTaller>> agrupados = lista.stream() //Agrupa las relaciones por nombre del alumno
                    .collect(Collectors.groupingBy(
                        alumnotaller -> alumnotaller.getAlumno().getDatosPersonales().getNombre())); //Define el criterio de agrupación

            ModelAndView.addObject("agrupados", agrupados); //Agrega los datos agrupados al modelo
        }

        return ModelAndView; //Retorna el objeto ModelAndView
    }
}