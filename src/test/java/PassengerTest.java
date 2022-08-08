import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    @Before
    public void before() {
        passenger = new Passenger("Sumin Oh", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Sumin Oh", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(2, passenger.getBags());
    }
}
