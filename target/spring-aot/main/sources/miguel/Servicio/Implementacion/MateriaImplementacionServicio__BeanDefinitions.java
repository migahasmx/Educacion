package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MateriaImplementacionServicio}.
 */
@Generated
public class MateriaImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'materiaImplementacionServicio'.
   */
  public static BeanDefinition getMateriaImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MateriaImplementacionServicio.class);
    InstanceSupplier<MateriaImplementacionServicio> instanceSupplier = InstanceSupplier.using(MateriaImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(MateriaImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
