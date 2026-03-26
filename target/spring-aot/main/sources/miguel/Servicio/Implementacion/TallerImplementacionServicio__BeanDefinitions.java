package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TallerImplementacionServicio}.
 */
@Generated
public class TallerImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'tallerImplementacionServicio'.
   */
  public static BeanDefinition getTallerImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TallerImplementacionServicio.class);
    InstanceSupplier<TallerImplementacionServicio> instanceSupplier = InstanceSupplier.using(TallerImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(TallerImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
