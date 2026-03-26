package miguel.Repositorio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import miguel.Entidad.EntidadMateria;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link MateriaRepositorio}.
 */
@Generated
public class MateriaRepositorioImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public MateriaRepositorioImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link MateriaRepositorio#listarJPQL()}.
   */
  public List<EntidadMateria> listarJPQL() {
    String queryString = "SELECT m FROM EntidadMateria m";
    Query query = this.entityManager.createQuery(queryString);

    return (List<EntidadMateria>) query.getResultList();
  }
}
