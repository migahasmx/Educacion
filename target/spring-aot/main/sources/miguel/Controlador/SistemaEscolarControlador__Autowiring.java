package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SistemaEscolarControlador}.
 */
@Generated
public class SistemaEscolarControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SistemaEscolarControlador apply(RegisteredBean registeredBean,
      SistemaEscolarControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("sistemaEscolarServicio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("alumnoServicio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("profesorServicio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("carreraServicio").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("materiaServicio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
