package ash.java.mqdw.mq;

import ash.java.mqdw.config.MqdwConfig;
import com.ibm.mq.jms.MQQueueConnectionFactory;
import zone.dragon.dropwizard.lifecycle.InjectableManaged;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.jms.*;

@Singleton
public class MqdwConnector implements InjectableManaged
{
  private MqdwListener listener;
  private MqdwConfig config;
  private Connection connection;
  private Session session;

  @Inject
  public MqdwConnector(MqdwListener listener, MqdwConfig config)
  {
    this.listener = listener;
    this.config = config;
  }

  @Override
  public void start() throws Exception
  {
    MQQueueConnectionFactory cf = new MQQueueConnectionFactory();

    cf.setHostName(config.getHost());
    cf.setPort(config.getPort());
    cf.setQueueManager(config.getQueueManager());
    cf.setChannel(config.getQueueChannel());

//    connection = cf.createConnection();
//    session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//    MessageConsumer consumer = session.createConsumer();
//
//    consumer.setMessageListener(listener);
//
//    connection.start();
  }

  @Override
  public void stop() throws Exception
  {
    if (connection != null)
    {
      connection.close();
    }
  }
}
