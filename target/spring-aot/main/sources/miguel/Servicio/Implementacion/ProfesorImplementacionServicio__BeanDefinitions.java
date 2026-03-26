package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProfesorImplementacionServicio}.
 */
@Generated
public class ProfesorImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'profesorImplementacionServicio'.
   */
  public static BeanDefinition getProfesorImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ProfesorImplementacionServicio.class);
    InstanceSupplier<ProfesorImplementacionServicio> instanceSupplier = InstanceSupplier.using(ProfesorImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(ProfesorImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
