package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MateriaControlador}.
 */
@Generated
public class MateriaControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MateriaControlador apply(RegisteredBean registeredBean,
      MateriaControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("materiaServicio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
