package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TallerImplementacionServicio}.
 */
@Generated
public class TallerImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TallerImplementacionServicio apply(RegisteredBean registeredBean,
      TallerImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("repositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
