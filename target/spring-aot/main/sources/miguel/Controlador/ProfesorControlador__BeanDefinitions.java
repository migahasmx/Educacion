package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProfesorControlador}.
 */
@Generated
public class ProfesorControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'profesorControlador'.
   */
  public static BeanDefinition getProfesorControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ProfesorControlador.class);
    InstanceSupplier<ProfesorControlador> instanceSupplier = InstanceSupplier.using(ProfesorControlador::new);
    instanceSupplier = instanceSupplier.andThen(ProfesorControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
