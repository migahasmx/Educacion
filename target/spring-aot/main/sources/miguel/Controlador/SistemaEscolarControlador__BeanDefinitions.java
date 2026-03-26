package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SistemaEscolarControlador}.
 */
@Generated
public class SistemaEscolarControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'sistemaEscolarControlador'.
   */
  public static BeanDefinition getSistemaEscolarControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SistemaEscolarControlador.class);
    InstanceSupplier<SistemaEscolarControlador> instanceSupplier = InstanceSupplier.using(SistemaEscolarControlador::new);
    instanceSupplier = instanceSupplier.andThen(SistemaEscolarControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
