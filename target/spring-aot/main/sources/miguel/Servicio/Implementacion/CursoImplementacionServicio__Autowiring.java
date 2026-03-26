package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CursoImplementacionServicio}.
 */
@Generated
public class CursoImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CursoImplementacionServicio apply(RegisteredBean registeredBean,
      CursoImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("repositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
