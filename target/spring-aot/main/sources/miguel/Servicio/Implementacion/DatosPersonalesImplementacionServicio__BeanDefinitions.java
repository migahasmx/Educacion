package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DatosPersonalesImplementacionServicio}.
 */
@Generated
public class DatosPersonalesImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean definition for 'datosPersonalesImplementacionServicio'.
   */
  public static BeanDefinition getDatosPersonalesImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DatosPersonalesImplementacionServicio.class);
    InstanceSupplier<DatosPersonalesImplementacionServicio> instanceSupplier = InstanceSupplier.using(DatosPersonalesImplementacionServicio::new);
    instanceSupplier = instanceSupplier.andThen(DatosPersonalesImplementacionServicio__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
