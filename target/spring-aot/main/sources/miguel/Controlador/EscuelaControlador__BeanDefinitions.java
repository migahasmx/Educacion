package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EscuelaControlador}.
 */
@Generated
public class EscuelaControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'escuelaControlador'.
   */
  public static BeanDefinition getEscuelaControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EscuelaControlador.class);
    InstanceSupplier<EscuelaControlador> instanceSupplier = InstanceSupplier.using(EscuelaControlador::new);
    instanceSupplier = instanceSupplier.andThen(EscuelaControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
