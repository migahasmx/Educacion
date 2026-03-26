package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AlumnoImplementacionServicio}.
 */
@Generated
public class AlumnoImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'alumnoImplementacionServicio'.
   */
  public static BeanDefinition getAlumnoImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AlumnoImplementacionServicio.class);
    InstanceSupplier<AlumnoImplementacionServicio> instanceSupplier = InstanceSupplier.using(AlumnoImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(AlumnoImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
