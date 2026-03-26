package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SistemaEscolarImplementacionServicio}.
 */
@Generated
public class SistemaEscolarImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SistemaEscolarImplementacionServicio apply(RegisteredBean registeredBean,
      SistemaEscolarImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("sistemaEscolarRepositorio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("alumnoRepositorio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("profesorRepositorio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("carreraRepositorio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("materiaRepositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
