import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

public class HelloWorldExampleTest extends TestCase{

    String message = "HelloWorldExample@20ad9418";
    HelloWorldExample helloWorld = new HelloWorldExample();

    @Test
    public void testConsoleMessage(){
        assertEquals(message,helloWorld.toString());
    }

}
