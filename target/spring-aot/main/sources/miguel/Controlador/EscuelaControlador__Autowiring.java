package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EscuelaControlador}.
 */
@Generated
public class EscuelaControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EscuelaControlador apply(RegisteredBean registeredBean,
      EscuelaControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("escuelaServicio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
