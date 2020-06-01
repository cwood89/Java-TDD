
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void testGetMessage() {
    HelloWorld hw = new HelloWorld();

    assertEquals("Hello, World!", hw.getMessage());
  }

  @Test
  public void getMessageWithName() {
    HelloWorld hw = new HelloWorld();
    assertEquals("Hello, Chris!", hw.getMessageWithName("Chris"));
  }

}