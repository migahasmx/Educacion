package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AlumnoTallerControlador}.
 */
@Generated
public class AlumnoTallerControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AlumnoTallerControlador apply(RegisteredBean registeredBean,
      AlumnoTallerControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("alumnoRepo").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("tallerRepo").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("alumnoTallerRepo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
