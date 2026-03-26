package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EscuelaImplementacionServicio}.
 */
@Generated
public class EscuelaImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'escuelaImplementacionServicio'.
   */
  public static BeanDefinition getEscuelaImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EscuelaImplementacionServicio.class);
    InstanceSupplier<EscuelaImplementacionServicio> instanceSupplier = InstanceSupplier.using(EscuelaImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(EscuelaImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
