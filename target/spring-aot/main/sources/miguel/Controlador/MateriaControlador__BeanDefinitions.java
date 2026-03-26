package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MateriaControlador}.
 */
@Generated
public class MateriaControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'materiaControlador'.
   */
  public static BeanDefinition getMateriaControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MateriaControlador.class);
    InstanceSupplier<MateriaControlador> instanceSupplier = InstanceSupplier.using(MateriaControlador::new);
    instanceSupplier = instanceSupplier.andThen(MateriaControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
