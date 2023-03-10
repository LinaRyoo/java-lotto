package lotto;

public class Tickets {
    private final int value;

    private Tickets(final int value) {
        this.value = value;
    }
    public static Tickets from(final int value) {
        return new Tickets(value);
    }
}
