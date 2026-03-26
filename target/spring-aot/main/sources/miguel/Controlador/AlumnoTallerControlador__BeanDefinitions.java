package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AlumnoTallerControlador}.
 */
@Generated
public class AlumnoTallerControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'alumnoTallerControlador'.
   */
  public static BeanDefinition getAlumnoTallerControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AlumnoTallerControlador.class);
    InstanceSupplier<AlumnoTallerControlador> instanceSupplier = InstanceSupplier.using(AlumnoTallerControlador::new);
    instanceSupplier = instanceSupplier.andThen(AlumnoTallerControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
