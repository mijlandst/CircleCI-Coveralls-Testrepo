package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.IOException;

/**
 * Tests the main class, which should:
 *  - in main, print "Hello, world!" to standard output.
 */
public class MainTest {
    
    private static final String helloWorld = "Hello, world!" 
                                           + System.lineSeparator();
    
    /**
     * Tests if main prints "Hello, world!"
     */
    @Test
    public void mainTest() {
        //set input and output
        InputStream standardIn = System.in;
        PrintStream standardOut = System.out;
        
        //prepare output buffer
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputBuffer));
        
        //prepare input buffer
        ByteArrayInputStream inputBuffer;
        inputBuffer = new ByteArrayInputStream(helloWorld.getBytes());
        System.setIn(inputBuffer);
        
        //run main
        Main.main(null);
        
        //check output buffer
        assertEquals(helloWorld, outputBuffer.toString());
        
        //finalize resources
        try {
            outputBuffer.close();
        } catch (IOException ioe) {
            System.err.println("outputBuffer not initialised");
        } finally {
            outputBuffer = null;
        }
        try {
            inputBuffer.close();
        } catch (IOException ioe) {
            System.err.println("inputBuffer not initialised");
        } finally {
            inputBuffer = null;
        }
        System.setOut(standardOut);
        System.setIn(standardIn);
    }
    
}
