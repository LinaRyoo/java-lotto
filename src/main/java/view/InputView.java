package view;

import java.util.Scanner;

public class InputView {

    public static int inputMoney() {
        System.out.println("구입금액을 입력해주세요.");
        return money();
    }

    public static int money() {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        scanner.nextLine();
        return money;
    }

}
