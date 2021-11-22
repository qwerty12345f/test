import java.util.Random;
import java.util.Scanner;


public class Program3 {
    public static void main(String[] args) {
        game();
    }
        public static void game() {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int rand = random.nextInt(100);
            int count = 1;
            while (true) {
                System.out.println("Введите число:");
                int variant = scanner.nextInt();
                if (variant == rand) {
                    System.out.println("Вы нашли число");
                    System.out.println("Вы нашли число за " + count + "попыток");
                    break;
                } else if (variant > rand) {
                    System.out.println("Ваше число больше, чем загаданное");
                } else {
                    System.out.println("Ваше число меньше, чем загаданное");
                }
                if (count > 8) {
                    System.out.println("лох");
                    System.out.println("ты лох");
                    break;
                }
                count++;

            }
        }


    }