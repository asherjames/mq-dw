package ash.java.mqdw.config;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class MqdwConfig extends Configuration
{
  @NotEmpty
  private String queueName;

  @NotEmpty
  private String queueManager;

  @NotEmpty
  private String queueChannel;

  @NotEmpty
  private String host;

  @NotNull
  private Integer port;

  public String getQueueName()
  {
    return queueName;
  }

  public void setQueueName(String queueName)
  {
    this.queueName = queueName;
  }

  public String getQueueManager()
  {
    return queueManager;
  }

  public void setQueueManager(String queueManager)
  {
    this.queueManager = queueManager;
  }

  public String getQueueChannel()
  {
    return queueChannel;
  }

  public void setQueueChannel(String queueChannel)
  {
    this.queueChannel = queueChannel;
  }

  public String getHost()
  {
    return host;
  }

  public void setHost(String host)
  {
    this.host = host;
  }

  public Integer getPort()
  {
    return port;
  }

  public void setPort(Integer port)
  {
    this.port = port;
  }
}
