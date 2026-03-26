package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TallerControlador}.
 */
@Generated
public class TallerControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TallerControlador apply(RegisteredBean registeredBean, TallerControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("servicio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
