package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CursoImplementacionServicio}.
 */
@Generated
public class CursoImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'cursoImplementacionServicio'.
   */
  public static BeanDefinition getCursoImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CursoImplementacionServicio.class);
    InstanceSupplier<CursoImplementacionServicio> instanceSupplier = InstanceSupplier.using(CursoImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(CursoImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
