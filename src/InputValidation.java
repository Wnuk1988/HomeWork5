

import java.util.Scanner;

public class InputValidation {
    private boolean isCorrect = false; // Флаг проверки корректности входа
    protected int userGo;

    protected void welcome() {
        isCorrect = false;
        while (!isCorrect) {
            Scanner user = new Scanner(System.in);
            System.out.println("Введите число 0 или 1 для включения/выключения компьютера!");
            if (user.hasNextInt()) {
                userGo = user.nextInt();
                if (userGo == 0 || userGo == 1) {
                    isCorrect = true;
                }
            } else {
                System.out.println("Вы ввели не корректное число.");
            }
        }
    }

    protected void launchAttempt() {
        isCorrect = false;
        while (!isCorrect) {
            Scanner user = new Scanner(System.in);
            System.out.println("Хотите снова попробовать включить компьютер?" +
                    " Если ДА: нажмите 1 ИЛИ любое другое число для ВЫХОДА!");
            if (user.hasNextInt()) {
                userGo = user.nextInt();
                if (userGo == 1) {
                    System.out.println("К сожелению компьютер 'СГОРЕЛ' окончательно...");
                    isCorrect = true;
                } else {
                    System.out.println("Bye bye...");
                    isCorrect = true;
                }
            } else {
                System.out.println("Вы ввели не корректное число.");
            }
        }
    }
}
