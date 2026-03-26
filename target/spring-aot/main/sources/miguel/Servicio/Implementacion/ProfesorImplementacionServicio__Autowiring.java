package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ProfesorImplementacionServicio}.
 */
@Generated
public class ProfesorImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ProfesorImplementacionServicio apply(RegisteredBean registeredBean,
      ProfesorImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("profesorRepositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
