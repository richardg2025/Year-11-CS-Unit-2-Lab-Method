import static org.junit.jupiter.api.Assertions.*;

class MethodTest {

    @org.junit.jupiter.api.Test
    void main() {}

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(12, Method.add(5,7));
    }

    @org.junit.jupiter.api.Test
    void addTwo() {
        assertEquals(24, Method.add(5,7,6,6));
    }

    @org.junit.jupiter.api.Test
    void morningGreeting() {
        assertEquals("早上好, Toby Fox!", Method.morningGreeting("Toby Fox"));
    }

    @org.junit.jupiter.api.Test
    void afternoonGreeting() {
        assertEquals("下午好, Mac Miller!", Method.afternoonGreeting("Mac Miller"));
    }

    @org.junit.jupiter.api.Test
    void triple() {
        assertEquals("oohbabyoohbabyoohbaby", Method.triple("oohbaby"));
    }

    @org.junit.jupiter.api.Test
    void half() {
        assertEquals(9.5, Method.half(19));
    }

    @org.junit.jupiter.api.Test
    void roundPositiveValueToNearestInteger() {
        assertEquals(9, Method.roundPositiveValueToNearestInteger(8.5));
    }

    @org.junit.jupiter.api.Test
    void roundPositiveValueToNearestIntegerTwo() {
        assertEquals(8, Method.roundPositiveValueToNearestInteger(8.49));
    }

    @org.junit.jupiter.api.Test
    void roundNegativeValueToNearestInteger() {
        assertEquals(-8, Method.roundNegativeValueToNearestInteger(-8.49));
    }

    @org.junit.jupiter.api.Test
    void roundNegativeValueToNearestIntegerTwo() {
        assertEquals(-9, Method.roundNegativeValueToNearestInteger(-8.5));
    }

}