package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TallerControlador}.
 */
@Generated
public class TallerControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'tallerControlador'.
   */
  public static BeanDefinition getTallerControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TallerControlador.class);
    InstanceSupplier<TallerControlador> instanceSupplier = InstanceSupplier.using(TallerControlador::new);
    instanceSupplier = instanceSupplier.andThen(TallerControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
