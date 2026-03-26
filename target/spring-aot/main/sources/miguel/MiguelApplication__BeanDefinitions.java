package miguel;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MiguelApplication}.
 */
@Generated
public class MiguelApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'miguelApplication'.
   */
  public static BeanDefinition getMiguelApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MiguelApplication.class);
    beanDefinition.setInstanceSupplier(MiguelApplication::new);
    return beanDefinition;
  }
}
