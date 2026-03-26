package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EscuelaImplementacionServicio}.
 */
@Generated
public class EscuelaImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EscuelaImplementacionServicio apply(RegisteredBean registeredBean,
      EscuelaImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("escuelaRepositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
