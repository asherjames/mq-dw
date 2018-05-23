package ash.java.mqdw.mq;

import javax.jms.Message;
import javax.jms.MessageListener;

public class MqdwListener implements MessageListener
{
  @Override
  public void onMessage(Message message)
  {
    System.out.println("Message received!");
  }
}
