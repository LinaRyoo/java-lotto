package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputView;
import view.ResultView;

import static org.assertj.core.api.Assertions.*;


public class MainControllerTest {
    @Test
    @DisplayName("")
    void run() {
        final MoneyToBuy moneyToBuy = MoneyToBuy.from(InputView.inputMoney());
        assertThat(moneyToBuy.lottoTicketsCount()).isPositive();
    }


}
