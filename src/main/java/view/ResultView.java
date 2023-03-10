package view;

public class ResultView {

    public static final String LOTTO_PREFIX = "[";
    public static final String LOTTO_POSTFIX = "]";
    public static final String SEPERATOR = ",";
    public static final String RESULT_MESSAGE = System.lineSeparator() + "당첨 통계" + System.lineSeparator() + " ------";
    public static final String PROFIT_MESSAGE = "총 수익률은 %.2f입니다." + System.lineSeparator();

    public static void printLottoTickets(int count) {
        System.out.printf("%d장 구매했습니다.", count);
    }
}
