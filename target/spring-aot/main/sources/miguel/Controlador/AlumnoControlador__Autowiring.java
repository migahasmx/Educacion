package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AlumnoControlador}.
 */
@Generated
public class AlumnoControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AlumnoControlador apply(RegisteredBean registeredBean, AlumnoControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("alumnoServicio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
