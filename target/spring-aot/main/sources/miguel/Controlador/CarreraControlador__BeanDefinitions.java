package miguel.Controlador;

import miguel.Servicio.CarreraServicio;
import miguel.Servicio.EscuelaServicio;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CarreraControlador}.
 */
@Generated
public class CarreraControlador__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'carreraControlador'.
   */
  private static BeanInstanceSupplier<CarreraControlador> getCarreraControladorInstanceSupplier() {
    return BeanInstanceSupplier.<CarreraControlador>forConstructor(CarreraServicio.class, EscuelaServicio.class)
            .withGenerator((registeredBean, args) -> new CarreraControlador(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'carreraControlador'.
   */
  public static BeanDefinition getCarreraControladorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CarreraControlador.class);
    beanDefinition.setInstanceSupplier(getCarreraControladorInstanceSupplier());
    return beanDefinition;
  }
}
