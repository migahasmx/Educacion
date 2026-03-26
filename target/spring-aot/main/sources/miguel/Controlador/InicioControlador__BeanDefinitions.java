package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link InicioControlador}.
 */
@Generated
public class InicioControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'inicioControlador'.
   */
  public static BeanDefinition getInicioControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(InicioControlador.class);
    beanDefinition.setInstanceSupplier(InicioControlador::new);
    return beanDefinition;
  }
}
