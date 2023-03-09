package lotto;


public class MoneyToBuy {
    private static final int UNIT = 1000;
    private final int value;

    private MoneyToBuy(final int value) {
        validate(value);
        this.value = value;
    }

    public static MoneyToBuy from(final int value) {
        return new MoneyToBuy(value);
    }

    private static void validate(final int value) {
        if (value < UNIT) {
            throw new IllegalArgumentException("구입금액이 로또가격보다 작습니다.");
        }
        if (value % UNIT != 0) {
            throw new IllegalArgumentException("구입금액이 1000원 단위가 아닙니다.");
        }
    }

    public int lottoTicketsCount() {
        return value / UNIT;
    }
}
