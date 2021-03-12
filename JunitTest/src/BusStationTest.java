import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BusStationTest {

    @Test
    void get1SuccessfulResponse() {

        BusStation BS = new BusStation(5,10,2);
        assertEquals("Sale el bus",BS.getResponse());

    }

    @Test
    void get2SuccessfulResponse() {

        BusStation BS = new BusStation(5,5,2);
        assertEquals("Sale el bus",BS.getResponse());

    }

    @Test
    void get1FailedResponse() {

        BusStation BS = new BusStation(5,4,2);
        assertEquals("Sale el bus",BS.getResponse());

    }

    @Test
    void get2FailedResponse() {

        BusStation BS = new BusStation(2,10,3);
        assertEquals("Sale el bus",BS.getResponse());

    }
}



