package miguel.Repositorio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import java.util.UUID;
import miguel.Entidad.EntidadAlumnoTaller;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link AlumnoTallerRepositorio}.
 */
@Generated
public class AlumnoTallerRepositorioImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public AlumnoTallerRepositorioImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link AlumnoTallerRepositorio#existsByAlumno_IdAlumnoAndTaller_IdTaller(java.util.UUID,java.util.UUID)}.
   */
  public boolean existsByAlumno_IdAlumnoAndTaller_IdTaller(UUID idAlumno, UUID idTaller) {
    String queryString = "SELECT e.id FROM EntidadAlumnoTaller e WHERE e.alumno.idAlumno = :idAlumno AND e.taller.idTaller = :idTaller";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idAlumno", idAlumno);
    query.setParameter("idTaller", idTaller);
    query.setMaxResults(1);

    return !query.getResultList().isEmpty();
  }

  /**
   * AOT generated implementation of {@link AlumnoTallerRepositorio#findByAlumno_IdAlumno(java.util.UUID)}.
   */
  public List<EntidadAlumnoTaller> findByAlumno_IdAlumno(UUID idAlumno) {
    String queryString = "SELECT e FROM EntidadAlumnoTaller e WHERE e.alumno.idAlumno = :idAlumno";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idAlumno", idAlumno);

    return (List<EntidadAlumnoTaller>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link AlumnoTallerRepositorio#findByTaller_IdTaller(java.util.UUID)}.
   */
  public List<EntidadAlumnoTaller> findByTaller_IdTaller(UUID idTaller) {
    String queryString = "SELECT e FROM EntidadAlumnoTaller e WHERE e.taller.idTaller = :idTaller";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idTaller", idTaller);

    return (List<EntidadAlumnoTaller>) query.getResultList();
  }
}
