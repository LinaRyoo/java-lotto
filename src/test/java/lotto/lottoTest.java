package lotto;

import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class lottoTest {

    private static final int price = 1000;
    public int money;
    public List<Integer> numbers;
    public List<Integer> lottoNumber;
    public int bonusNumber;


    @BeforeEach
    void setUp() {
        money = 14000;
    }

    @Test
    @DisplayName("구입금액에 맞는 로또 개수 계산")
    void lottoTicketCount() {
        assertThat(money / price).isEqualTo(14);
    }


    @Test
    @DisplayName("로또 자동 생성: 1~45 중 6개 숫자")
    void generateNumbers() {
        numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        lottoNumber = numbers.subList(0, 6);
        bonusNumber = numbers.get(6);
        Collections.sort(lottoNumber);

        assertThat(lottoNumber.size()).isEqualTo(6);
    }


    @Test
    @DisplayName("보너스 볼 자동 생성: 로또 당첨 번호에 없는 1~45 사이의 숫자 1개")
    void bonusBall() {
        while(true) {
            int bonusNumber = numbers.get(0);
            if (!lottoNumber.contains(bonusNumber)) {
                break;
            }
        }
    }

    @Test
    @DisplayName("구입금액으로 구입할 수 있는 로또 갯수")
    void validateMoneyToLotto() {
        MoneyToBuy moneyToBuy = MoneyToBuy.from(10000);
        assertThat(moneyToBuy.lottoTicketsCount()).isEqualTo(10);

    }

    @ParameterizedTest
    @DisplayName("구입금액이 유효한 미니멈 금액인지 확인")
    @ValueSource(ints = {-1000, 0, 500, 999})
    void validateMinimumMoney(int input) {
        assertThat(input >= price).isFalse();
    }

    @ParameterizedTest
    @DisplayName("구입금액이 유효한 금액인지 확인")
    @ValueSource(ints = {10100, 4400, 99900})
    void validateMoney(int input) {
        assertThat(input % price).isNotEqualTo(0);
    }
}
