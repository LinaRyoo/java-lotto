package lotto;

import view.InputView;

public class MainController {
    public void run() {
        final MoneyToBuy moneyToBuy = MoneyToBuy.from(InputView.inputMoney());
        ResultView.printLottoTickets(moneyToBuy.lottoTicketsCount());

    }
}
