package ash.java.mqdw;

import ash.java.mqdw.config.MqdwConfig;
import ash.java.mqdw.mq.MqdwConnector;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import zone.dragon.dropwizard.HK2Bundle;

public class MqdwApplication extends Application<MqdwConfig>
{
  @Override
  public void run(MqdwConfig configuration, Environment environment)
  {
    environment.jersey().register(new ServiceBinder(configuration));
    environment.jersey().register(MqdwConnector.class);
  }

  @Override
  public void initialize(Bootstrap<MqdwConfig> bootstrap)
  {
    HK2Bundle.addTo(bootstrap);
  }

  public static void main(String[] args) throws Exception
  {
    new MqdwApplication().run(args);
  }
}
