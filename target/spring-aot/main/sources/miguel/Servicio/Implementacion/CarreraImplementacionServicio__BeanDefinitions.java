package miguel.Servicio.Implementacion;

import miguel.Repositorio.CarreraRepositorio;
import miguel.Repositorio.EscuelaRepositorio;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CarreraImplementacionServicio}.
 */
@Generated
public class CarreraImplementacionServicio__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'carreraImplementacionServicio'.
   */
  private static BeanInstanceSupplier<CarreraImplementacionServicio> getCarreraImplementacionServicioInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CarreraImplementacionServicio>forConstructor(CarreraRepositorio.class, EscuelaRepositorio.class)
            .withGenerator((registeredBean, args) -> new CarreraImplementacionServicio(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'carreraImplementacionServicio'.
   */
  public static BeanDefinition getCarreraImplementacionServicioBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CarreraImplementacionServicio.class);
    beanDefinition.setInstanceSupplier(getCarreraImplementacionServicioInstanceSupplier());
    return beanDefinition;
  }
}
