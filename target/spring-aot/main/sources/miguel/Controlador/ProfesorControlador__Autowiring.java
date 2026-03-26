package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ProfesorControlador}.
 */
@Generated
public class ProfesorControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ProfesorControlador apply(RegisteredBean registeredBean,
      ProfesorControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("profesorServicio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
