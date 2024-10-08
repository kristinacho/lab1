import java.util.Random;
import java.util.Scanner;
public class Cycles {

    public String reverseListNums(int x){
        String result = " ";
        if (x > 0){
            for (int i = x; i >= 0; i--){
                result += i;
                if (i > 0){
                    result += " ";
                }
            }
        }
        else if (x < 0){
            for (int i = x; i <= 0; i++){
                result += i;
                if (i < 0){
                    result += " ";
                }
            }
        }
       return result;
    }

    public int pow(int x, int y){
        int result = 1;
        for ( int i = 0; i < y; i++ ){
            result *= x;
        }
       return result;
    }

    public boolean equalNum(int x) {
        x = Math.abs(x);
        int oneDigit = x % 10;
        while (x > 0) {
            if (x % 10 != oneDigit)
                return false;
            x /= 10;
        }
        return true;
    }

    public  static void leftTriangle(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(10); // Генерация случайного числа от 0 до 9
        int userGuess = -1; // Предположения пользователя
        int attempts = 0; // попытки

        System.out.println("Введите число от 0 до 9:");

        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt(); // Считывание ввода пользователя
            attempts++; // Увеличиваем счетчик попыток

            if (userGuess < 0 || userGuess > 9) {
                System.out.println("Пожалуйста, введите число в диапазоне от 0 до 9.");
                attempts--; // Уменьшаем счет попыток, так как ввод некорректныq
                continue;
            }

            if (userGuess == numberToGuess) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        }
        System.out.println("Вы отгадали число за " + attempts + " попытки.");
    }
}

