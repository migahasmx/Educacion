package miguel.Servicio.Implementacion;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MateriaImplementacionServicio}.
 */
@Generated
public class MateriaImplementacionServicio__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MateriaImplementacionServicio apply(RegisteredBean registeredBean,
      MateriaImplementacionServicio instance) {
    AutowiredFieldValueResolver.forRequiredField("materiaRepositorio").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
