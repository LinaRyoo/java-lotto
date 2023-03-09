package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generator {
    public static List<Integer> generateNumber() {
        final List<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            lottoNumbers.add(i);
        }
        Collections.shuffle(lottoNumbers);
        Collections.sort(lottoNumbers);

        return lottoNumbers.subList(0, 6);
    }
}
