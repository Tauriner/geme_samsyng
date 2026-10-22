import java.util.Random;
import java.util.Scanner;

public class BigMonster extends Monster {
    BigMonster(int sizeBoard) {
        super(sizeBoard);
        setImage("\uD83D\uDC79");
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        if (difficultGame == 1) {
            return taskMonster();
        } else {
            System.out.println("Решите задачу:");

            Random random = new Random();
            int x = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
            int y = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
            int z = random.nextInt(100 * (difficultGame - 1), 100 * difficultGame);

            int trueAnswer = x * y - z;

            System.out.println("Реши пример: " + x + " * " + y + " - " + z + " = ?");

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (trueAnswer == answer) {
                System.out.println("Верно! Ты победил монстра");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }
        }
    }

    public boolean taskMonster() {
        return super.taskMonster(1);
    }
}