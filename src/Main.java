import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    //Задание1.2.Методы.
    public int sumLastNums(int x) { //возвращает сумму 2х последних цифр числа
        int lastD = x % 10;
        x /= 10;
        int secLastD = x % 10;
        int summ = lastD + secLastD;
        return summ;
    }

    //Задание1.4.Методы.
    public boolean isPositive(int x) {
        return x > 0;
    }

    //Задание1.6.Методы.
    public boolean isUpperCase(char x){
       return x >= 'A' && x <='Z';
    }

    //Задание1.8.Методы.
    public boolean isDivisor(int a, int b){
        return (a % b == 0) || (b % a == 0);
    }

    //Задание1.10.Методы.
    public int lastNumSum(int a, int b){
        return (Math.abs(a) % 10) + (Math.abs(b) % 10);
    }

    //Задание2.2.Условия.
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    //Задание2.4.Условия.
    public String makeDecision(int x, int y) {
        if (x < y) {
            return "<";
        } else if (x > y) {
            return ">";
        } else {
            return "=";
        }
    }

    //Задание2.6.Условия.
    public boolean sum3(int x, int y, int z) {
        if ((x + y == z) || (x + z == y) || (y + z == x)) {
            return true;
        } else {
            return false;
        }
    }

    //Задание2.8.Условия.
    public String age(int x) {
        if (x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 < 12 || x % 100 > 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    //Задание2.10.Условия.
    public void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "вторник":
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "среда":
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "четверг":
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "пятница":
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "суббота":
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }

    //Задание3.2.Циклы.
    public String reverseListNums(int x){
        String result = "";
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

    //Задание3.4.Циклы.
    public int pow(int x, int y){
        int result = 1;
        for ( int i = 0; i < y; i++ ){
            result *= x;
        }
        return result;
    }

    //Задание3.6.Циклы.
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

    //Задание3.8.Циклы.
    public void leftTriangle(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Задание3.10.Циклы.
    public void guessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(10); // Генерация
        int userGuess = -1; // Предположения пользователя
        int attempts = 0; // попытки

        System.out.println("Введите число от 0 до 9:");

        while (userGuess != numberToGuess) {
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < 0 || userGuess > 9) {
                    System.out.println("Введите число в диапазоне от 0 до 9.");
                    attempts--;
                    continue;
                }

                if (userGuess == numberToGuess) {
                    System.out.println("Вы угадали!");
                } else {
                    System.out.println("Вы не угадали, введите число от 0 до 9:");
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next(); // Очищаем некорректный ввод
            }
        }
        System.out.println("Вы отгадали число за " + attempts + " попытки.");
    }

    //Задание4.2.Массивы.
    public int findLast (int[] arr, int x){
        for(int i = arr.length -1; i>=0; i--){
            if (arr[i]==x)
                return i;
        }
        return -1;
    }

    //Задание4.4.Массивы.
    public int[]add (int[] arr, int x, int pos){
        if (pos < 0 || pos > arr.length)
            System.out.println("Недопустимая позиция:" + pos);
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < pos; i++){
            newArr[i] = arr[i];
        }
        newArr[pos]=x;
        for (int i = pos; i< arr.length; i++){
            newArr[i+1]= arr[i];
        }
        return newArr;
    }

    //Задание4.6.Массивы.
    public void reverse(int[] arr){
        int left = 0; // Указатель на начало массива
        int right = arr.length - 1; // Указатель на конец массива

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // Сдвигаем указатели
            left++;
            right--;
        }
    }

    //Задание4.8.Массивы.
    public int[] concat(int[]arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];

        // Копируем элементы 1 массива
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        // Копируем элементы 2 массива
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }

    //Задание4.10.Массивы.
    public int[] deleteNegative (int[] arr){
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        // Создаем новый массив для положительных элементов
        int[] newArr = new int[count];
        int index = 0;

        // Заполняем новый массив только с полож. элементами
        for (int num : arr) {
            if (num >= 0) {
                newArr[index] = num;
                index++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {

        //Задание 1. Методы.
        System.out.println("Задание 1. Методы.");
        Scanner scanner = new Scanner(System.in);
        //1.2.Вызов SumLastNums.
        Main mainInstance = new Main();
        System.out.println("№2.Сумма знаков.");
        int digit = 0;
        System.out.print("Введите число, состоящее из не менее 2х знаков: ");
        while (true) {
            if (scanner.hasNextInt()) {
                digit = scanner.nextInt();
                if (digit >= 10) {
                    System.out.println("Сумма двух последних цифр равна: " + mainInstance.sumLastNums(digit));
                    break;
                } else {
                    System.out.println("Друг, ты ошибся! Введи положительное число больше или равное 10: ");
                }
            }
            else {
                System.out.println("Ошибка ввода! Введи положительное ЧИСЛО больше или равное 10: ");
                scanner.next();
            }
        }

        //1.4.Вызов isPositive.
        System.out.println("№4. Есть ли позитив");
        Main mainInstance1 = new Main();
        System.out.print("Введите число: ");
        int  chislo = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                chislo = scanner.nextInt();
                System.out.println( "Результат: " + mainInstance1.isPositive(chislo));
                break;
            }else{
                System.out.println("Ошибка ввода!Введи число: ");
                scanner.next();
            }
        }

        //1.6. Вызов isUpperCase.
        System.out.println("№6. Большая буква.");
        Main mainInstance2 = new Main();
        System.out.print("Введите символ от A до Z: ");

        while (true) {
            if (scanner.hasNext()) {
                String input = scanner.next();
                if (input.length() == 1) {
                    char symbol = input.charAt(0);
                    // является ли символ заглавной буквой
                    if (mainInstance2.isUpperCase(symbol)) {
                        System.out.println("Результат: " + true);
                        break;
                    } else {
                        System.out.println("Ошибка: введенный символ не является заглавной буквой из диапозона A-Z.");
                    }
                } else {
                    System.out.println("Ошибка: введите только одну букву из диапазона A-Z: ");
                }
            } else {
                System.out.println("Ошибка ввода! Пожалуйста, введите корректный символ.");
                scanner.next();
            }
        }

        //1.8. Вызов isDivisor.
        System.out.println("№8. Делитель.");
        Main mainInstance3 = new Main();
        int a = 0;
        while (true) {
            System.out.print("Введите число a: ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число a: ");
                scanner.next();
            }
        }

        int b = 0;
        while (true) {
            System.out.print("Введите число b: ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число b: ");
                scanner.next();
            }
        }
        System.out.println("Результат: " + mainInstance3.isDivisor(a, b));

        //1.10. Вызов lastNumSum.
        System.out.println("№10.Многократный вызов.");
        Main mainInstance4 = new Main();
        int resSum = 0;
        System.out.println("Введите 5 чисел");
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            while (true) {
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    resSum = mainInstance4.lastNumSum(resSum, input);
                    break; // Выход из цикла при корректном вводе
                } else {
                    System.out.println("Ошибка ввода! Введите корректное целое число.");
                    scanner.next(); // Очищаем некорректный ввод
                }
            }
        }
        System.out.println("Итоговый результат: " + resSum);

        //Задание2.Условия.
        System.out.println("Задание 2.Условия.");

        //2.2. Безопасное деление.
        System.out.println("№2.Безопасное деление.");
        Main mainInstance5 = new Main();
        int x = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число x: ");
                scanner.next();
            }
        }

        int y = 0;
        while (true) {
            System.out.print("Введите число y: ");
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число y: ");
                scanner.next();
            }
        }
        double result = mainInstance5.safeDiv(x,y);
        System.out.println("Результат деления: " + result);

        //2.4. Строка сравнения.
        System.out.println("№4.Строка сравнения.");
        Main mainInstance6 = new Main();
        int x1 = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число x: ");
                scanner.next();
            }
        }

        int y1 = 0;
        while (true) {
            System.out.print("Введите число y: ");
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число y: ");
                scanner.next();
            }
        }
        String rez = mainInstance6.makeDecision(x1,y1);
        System.out.println("Результат сравненмия: " + x1 + rez + y1);

        //2.6.Тройная сумма.
        System.out.println("№6.Тройная сумма.");
        Main mainInstance7 = new Main();
        int x2 = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (scanner.hasNextInt()) {
                x2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число x: ");
                scanner.next();
            }
        }

        int y2 = 0;
        while (true) {
            System.out.print("Введите число y: ");
            if (scanner.hasNextInt()) {
                y2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число y: ");
                scanner.next();
            }
        }

        int z2 = 0;
        while (true) {
            System.out.print("Введите число z: ");
            if (scanner.hasNextInt()) {
                z2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число z: ");
                scanner.next();
            }
        }
        boolean rezult1 = mainInstance7.sum3(x2, y2,z2);
        System.out.println("Результат: " + rezult1);

        //2.8. Возраст.
        System.out.println("№8.Возраст.");
        Main mainInstance8 = new Main();
        int x3 = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (scanner.hasNextInt()) {
                x3 = scanner.nextInt();
                if (x3 > 0){
                    String rezult3 = mainInstance8.age(x3);
                    System.out.println("Результат: " + rezult3);
                    break;
                }else{
                    System.out.println("Ты ошибся! Введи число, больше 0: ");
                }
            } else {
                System.out.println("Ошибка ввода! Введите число x: ");
                scanner.next();
            }
        }

        scanner.nextLine();
        //2.10. Вывод дней недели.
        System.out.println("№10.Вывод дней недели.");
        Main mainInstance9 = new Main();
        System.out.println("Введите день недели: ");
        String days = scanner.nextLine();
        System.out.println("Результат: ");
        mainInstance9.printDays(days);

        //Задание3.Циклы.
        System.out.println("Задание3.Циклы.");

       //3.2.Числа наоборот.
        System.out.println("№2.Числа наоборот.");
        Main mainInstance10 = new Main();
        int x4 = 0;
        while(true){
            System.out.println("Введите число x: ");
            if(scanner.hasNextInt()){
                x4 = scanner.nextInt();
                System.out.println("x = " + x4 + "\n Результат: ");
                String x5 = mainInstance10.reverseListNums(x4);
                System.out.println(x5);
                break;
            }else{
                System.out.println("Ошибка ввода!Введите число: ");
                scanner.next();
            }
        }

        //№4.Cтепень числa.
        System.out.println("№4.Степень числа.");
        Main mainInstance11 = new Main();
        int x6 = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (scanner.hasNextInt()) {
                x6 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число x: ");
                scanner.next();
            }
        }

        int y6 = 0;
        while (true) {
            System.out.print("Введите число y: ");
            if (scanner.hasNextInt()) {
                y6 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число y: ");
                scanner.next();
            }
        }
        int res6 = mainInstance11.pow(x6,y6);
        System.out.println("Результат: " + res6);

        //№6.Одинакововость.
        System.out.println("№6.Одинакововсть.");
        Main mainInstance12 = new Main();
        int x7 = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (scanner.hasNextInt()) {
                x7 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите число x: ");
                scanner.next();
            }
        }
        boolean res7 = mainInstance12.equalNum(x7);
        System.out.println("Результат: " + res7);

        //№8.Левый треугольник.
        System.out.println("№8.Левый треугольник.");
        Main mainInstance13 = new Main();
        int x8 = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (scanner.hasNextInt()) {
                x8 = scanner.nextInt();
                if(x8 > 0){
                    break;
                }else{
                    System.out.println("Ошибка ввода!Число должно быть больше 0: ");
                }
            } else {
                System.out.println("Ошибка ввода! Введите число x: ");
                scanner.next();
            }
        }
        mainInstance13.leftTriangle(x8);

        //№10.Угадайка.
        System.out.println("№10.Угадайка.");
        Main mainInstance14 = new Main();
        mainInstance14.guessGame();

       //Задание4.Массивы.
        System.out.println("Задание4.Массивы.");
        //№2.Поиск последнего значения.
        System.out.println("№2. Поиск последнего значения.");
        Main mainInstance15 = new Main();
        System.out.print("Введите количество элементов для массива: ");
        int size = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Ошибка ввода! Размер массива должен быть больше 0.");
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.print("Введите число для элемента " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода! Введите целое число.");
                    scanner.next();
                }
            }
        }
        System.out.print("Введите число x: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int x9 = scanner.nextInt();
                int res9 = mainInstance15.findLast(arr, x9);
                System.out.println("Результат: " + res9);
                break;
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }

        //№4.Добавление в массив.
        System.out.println("№4.Добавление в массив.");
        Main mainInstance16 = new Main();
        System.out.print("Введите количество элементов для массива: ");
        int size1 = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                size1 = scanner.nextInt();
                if (size1 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка ввода! Размер массива должен быть больше 0.");
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }

        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            while (true) {
                System.out.print("Введите число для элемента " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr1[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода! Введите целое число.");
                    scanner.next();
                }
            }
        }
        System.out.print("Введите число x: ");
        int x11 =0;
        while (true) {
            if (scanner.hasNextInt()) {
                x11 = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }
        System.out.print("Введите позицию pos: ");
        int pos = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                pos = scanner.nextInt();
                if (pos >= 0 && pos <= arr1.length) {
                    break;
                } else {
                    System.out.println("Ошибка! Позиция должна быть от 0 до " + arr1.length);
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }
        int[] res11 = mainInstance16.add(arr1, x11, pos);
        System.out.println("Результат: " + Arrays.toString(res11));

        //№6.Реверс.
        System.out.println("№6.Реверс.");
        Main mainInstance17 = new Main();
        System.out.print("Введите количество элементов для массива: ");
        int size2 = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                size2 = scanner.nextInt();
                if (size2 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка ввода! Размер массива должен быть больше 0.");
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }

        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            while (true) {
                System.out.print("Введите число для элемента " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr2[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода! Введите целое число.");
                    scanner.next();
                }
            }
        }
        mainInstance17.reverse(arr2);
        System.out.println("Массив после реверса: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

       //№8.Объединение.
        System.out.println("\n№8.Объединение.");
        Main mainInstance18 = new Main();
        System.out.print("Введите количество элементов для 1 массива: ");
        int size3 = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                size3 = scanner.nextInt();
                if (size3 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка ввода! Размер массива должен быть больше 0.");
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }

        int[] arr3 = new int[size3];

        for (int i = 0; i < arr3.length; i++) {
            while (true) {
                System.out.print("Введите число для элемента " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr3[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода! Введите целое число.");
                    scanner.next();
                }
            }
        }
        System.out.print("Введите количество элементов для 2 массива: ");
        int size4 = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                size4 = scanner.nextInt();
                if (size4 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка ввода! Размер массива должен быть больше 0.");
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }

        int[] arr4 = new int[size4];

        for (int i = 0; i < arr4.length; i++) {
            while (true) {
                System.out.print("Введите число для элемента " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr4[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода! Введите целое число.");
                    scanner.next();
                }
            }
        }
        int[] result12 = mainInstance18.concat(arr3, arr4);
        System.out.println("Результат: " + Arrays.toString(result12));

        //№10.Удалить негатив.
        System.out.print("Введите количество элементов для массива: ");
        Main mainInstance19 = new Main();
        int size5 = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                size5 = scanner.nextInt();
                if (size5 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка ввода! Размер массива должен быть больше 0.");
                }
            } else {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }

        int[] arr5 = new int[size5];

        for (int i = 0; i < arr5.length; i++) {
            while (true) {
                System.out.print("Введите число для элемента " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr5[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода! Введите целое число.");
                    scanner.next();
                }
            }
        }
        int[] result10 = mainInstance19.deleteNegative(arr5);
        System.out.println("Результат: " + Arrays.toString(result10));
        scanner.close();
    }
}
