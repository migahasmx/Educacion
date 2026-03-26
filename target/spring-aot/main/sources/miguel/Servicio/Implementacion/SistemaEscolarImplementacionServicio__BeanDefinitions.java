package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SistemaEscolarImplementacionServicio}.
 */
@Generated
public class SistemaEscolarImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'sistemaEscolarImplementacionServicio'.
   */
  public static BeanDefinition getSistemaEscolarImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SistemaEscolarImplementacionServicio.class);
    InstanceSupplier<SistemaEscolarImplementacionServicio> instanceSupplier = InstanceSupplier.using(SistemaEscolarImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(SistemaEscolarImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
