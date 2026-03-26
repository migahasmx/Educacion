package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CursoControlador}.
 */
@Generated
public class CursoControlador__BeanDefinitions {
  /**
   * Get the bean definition for 'cursoControlador'.
   */
  public static BeanDefinition getCursoControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CursoControlador.class);
    InstanceSupplier<CursoControlador> instanceSupplier = InstanceSupplier.using(CursoControlador::new);
    instanceSupplier = instanceSupplier.andThen(CursoControlador__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
