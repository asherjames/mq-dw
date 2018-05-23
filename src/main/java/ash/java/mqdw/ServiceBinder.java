package ash.java.mqdw;

import ash.java.mqdw.config.MqdwConfig;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class ServiceBinder extends AbstractBinder
{
  private MqdwConfig config;

  public ServiceBinder(MqdwConfig config)
  {
    this.config = config;
  }

  @Override
  protected void configure()
  {
    bind(config).to(MqdwConfig.class);
  }
}
