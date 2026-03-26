package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DatosPersonalesImplementacionServicio}.
 */
@Generated
public class DatosPersonalesImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DatosPersonalesImplementacionServicio apply(RegisteredBean registeredBean,
      DatosPersonalesImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("datosPersonalesRepositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
