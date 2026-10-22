import java.util.Random;
import java.util.Scanner;

public class SmallMonster extends Monster {

    SmallMonster(int sizeBoard) {
        super(sizeBoard);
        setImage("\uD83D\uDC7E"); // 👾
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Мини-игра: Угадай число!");
        System.out.println("Я загадал число от 1 до 5.");
        System.out.println("У тебя есть 3 попытки!");

        Random random = new Random();
        int secretNumber = random.nextInt(5) + 1;
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Введи число:");

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (answer == secretNumber) {
                System.out.println("Ура! Ты угадал!");
                System.out.println("Ты победил маленького монстра!");
                return true;
            } else if (answer < secretNumber) {
                System.out.println("Моё число больше!");
            } else {
                System.out.println("Моё число меньше!");
            }

            attempts--;

            if (attempts > 0) {
                System.out.println("Осталось попыток: " + attempts);
            }
        }

        System.out.println("Ты проиграл!");
        System.out.println("Загаданное число было: " + secretNumber);

        return false;
    }
}
