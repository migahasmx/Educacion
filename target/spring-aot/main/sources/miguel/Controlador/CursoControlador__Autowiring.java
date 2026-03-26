package miguel.Controlador;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CursoControlador}.
 */
@Generated
public class CursoControlador__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CursoControlador apply(RegisteredBean registeredBean, CursoControlador instance) {
    AutowiredFieldValueResolver.forRequiredField("servicioCurso").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
