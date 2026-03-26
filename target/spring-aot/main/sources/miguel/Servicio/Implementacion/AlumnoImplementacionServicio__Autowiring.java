package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AlumnoImplementacionServicio}.
 */
@Generated
public class AlumnoImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AlumnoImplementacionServicio apply(RegisteredBean registeredBean,
      AlumnoImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("alumnoRepositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
