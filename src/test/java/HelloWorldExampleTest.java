import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

public class HelloWorldExampleTest extends TestCase{

    String message = "HelloWorld";
    HelloWorldExample helloWorld = new HelloWorldExample();

    @Test
    public void testConsoleMessage(){
        assertEquals(message,helloWorld.printme("HelloWorld"));
    }

}
