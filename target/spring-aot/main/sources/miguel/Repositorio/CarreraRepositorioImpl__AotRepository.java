package miguel.Repositorio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import miguel.Entidad.EntidadCarrera;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link CarreraRepositorio}.
 */
@Generated
public class CarreraRepositorioImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public CarreraRepositorioImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link CarreraRepositorio#findAllWithEscuela()}.
   */
  public List<EntidadCarrera> findAllWithEscuela() {
    String queryString = "SELECT c FROM EntidadCarrera c JOIN FETCH c.escuela";
    Query query = this.entityManager.createQuery(queryString);

    return (List<EntidadCarrera>) query.getResultList();
  }
}
