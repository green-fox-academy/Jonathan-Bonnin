import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    Apple apple = new Apple();

    @Test
    public void getAppleTest() {

        // assertEquals("michel", apple.getApple()); // fails
        assertEquals("apple", apple.getApple()); //succeeds
    }
}