package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AlumnoControlador}.
 */
@Generated
public class AlumnoControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'alumnoControlador'.
   */
  public static BeanDefinition getAlumnoControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AlumnoControlador.class);
    InstanceSupplier<AlumnoControlador> instanceSupplier = InstanceSupplier.using(AlumnoControlador::new);
    instanceSupplier = instanceSupplier.andThen(AlumnoControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
