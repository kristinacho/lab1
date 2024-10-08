import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class Main {
    public static void main(String[] args) {
        //Задание 1. Методы.
        System.out.println("Задание 1. Методы.");
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
       //№2.Вызов SumLastNums.
        System.out.println("№2.Сумма знаков.");
        System.out.print("Введите число, состоящее из не менее 2х знаков: ");
        int Digit = scanner.nextInt();
        System.out.println( "Сумма 2х последних цифр числа = " + methods.sumLastNums(Digit));

        //№4.Вызов isPositive.
        System.out.println("№4. Есть ли позитив");
        System.out.print("Введите число: ");
        int  chislo = scanner.nextInt();
        System.out.println( "Результат: " + methods.isPositive(chislo));

        //№6. Вызов isUpperCase.
        System.out.println("№6.Большая буква.");
        System.out.println("Введите символ от A до Z: ");
        char symbol = scanner.next().charAt(0);
        System.out.println( "Результат: " + methods.isUpperCase(symbol));

        //№8. Вызов isDivisor.
        System.out.println("№8.Делитель.");
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        System.out.println( "Результат: " + methods.isDivisor(a,b));

        //№10. Вызов lastNumSum.
        System.out.println("№10.Многократный вызов.");
        int resSum = 0;
        System.out.println("Введите 5 чисел");
        for (int i = 0; i < 5; i++){
            System.out.println("Введите число " + (i+1) + ": ");
            int input = scanner.nextInt();
            resSum = methods.lastNumSum(resSum, input);
        }
        System.out.println("Итоговый результат: "+ resSum);

        //Задание2.Условия.
        System.out.println("Задание 2.Условия.");
        Сonditions conditions = new Сonditions();

        //№2. Безопасное деление.
        System.out.println("№2.Безопасное деление.");
        System.out.println("Введите число x: ");
        int x = scanner.nextInt();
        System.out.println("Введите число y: ");
        int y = scanner.nextInt();
        double result = Сonditions.safeDiv(x,y);
        System.out.println("Результат деления: " + result);

        //№4. Строка сравнения.
        System.out.println("№4.Строка сравнения.");
        System.out.println("Введите число x: ");
        int X = scanner.nextInt();
        System.out.println("Введите число y: ");
        int Y = scanner.nextInt();
        String rez = conditions.makeDecision(X,Y);
        System.out.println("Результат сравненмия: " + X + rez + Y);

        //№6.Тройная сумма.
        System.out.println("№6.Тройная сумма.");
        System.out.println("Введите число x: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите число y: ");
        int y1 = scanner.nextInt();
        System.out.println("Введите число z: ");
        int z1 = scanner.nextInt();
        boolean rezult = conditions.sum3(x1, y1,z1);
        System.out.println("Результат: " + rezult);



        //№8. Возраст.
        System.out.println("№8.Возраст.");
        System.out.println("Введите число x: ");
        int x2 = scanner.nextInt();
        String rezult1 = conditions.age(x2);
        System.out.println("Результат: " + rezult1);

        //№10. Вывод дней недели.
        Scanner scann = new Scanner(System.in);
        System.out.println("№10.Вывод дней недели.");
        System.out.println("Введите день недели: ");
        String days = scann.nextLine();
        System.out.println("Результат: ");
        Сonditions.printDays(days);

        //Задание3.Циклы.
        System.out.println("Задание3.Циклы.");
        Cycles cycles = new Cycles();

       //№2.Числа наоборот.
        System.out.println("№2.Числа наоборот.");
        System.out.println("Введите число x: ");
        int x3 = scanner.nextInt();
        System.out.println("x = " + x3 + "\n Результат: ");
        String x4 = cycles.reverseListNums(x3);
        System.out.println(x4);

        //№4.Cтепень числa.
        System.out.println("№4.Степень числа.");
        System.out.println("Введите число x: ");
        int x5 = scanner.nextInt();
        System.out.println("Введите число y: ");
        int y5 = scanner.nextInt();
        int res5 = cycles.pow(x5,y5);
        System.out.println("Результат: " + res5);

        //№6.Одинакововость.
        System.out.println("№6.Одинакововсть.");
        System.out.println("Введите число x: ");
        int x6 = scanner.nextInt();
        boolean res6 = cycles.equalNum(x6);
        System.out.println("Результат: " + res6);

        //№8.Левый треугольник.
        System.out.println("№8.Левый треугольник.");
        System.out.println("Введите число x: ");
        int x7 = scanner.nextInt();
        cycles.leftTriangle(x7);

        //№10.Угадайка.
        System.out.println("№10.Угадайка.");
       Cycles.guessGame();

       //Задание4.Массивы.
        System.out.println("Задание 4.Массивы.");
        Array array = new Array();
        //№2.Поиск последнего значения.
        System.out.println("№2.Поиск последнего значения.");
        System.out.println("Введите 5 элементов для массива: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Введите число: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        System.out.println("Введите число x: ");
        int x8 = scanner.nextInt();
        int res8 = array.findLast(arr, x8);
        System.out.println("Результат: " + res8);

        //№4.Добавление в массив.
        System.out.println("№4.Добавление в массив.");
        System.out.println("Введите 5 элементов для массива: ");
        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++){
            System.out.println("Введите число: ");
            int value1 = scanner.nextInt();
            arr1[i] = value1;
        }
        System.out.println("Введите число x: ");
        int x9 = scanner.nextInt();
        System.out.println("Введите позицию pos: ");
        int pos = scanner.nextInt();
        int[] res9 = array.add(arr1, x9, pos);
        System.out.println("Результат: " + Arrays.toString(res9));

        //№6.Реверс.
        System.out.println("№6.Реверс.");
        System.out.println("Введите 5 элементов для массива: ");
        int[] arr2 = new int[5];
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Введите число: ");
            int value2 = scanner.nextInt();
            arr2[i] = value2;
        }
        Array.reverse(arr2);
        System.out.println("Массив после реверса: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        //№8.Объединение.
        System.out.println("\n№8.Объединение.");
        System.out.println("Введите 3 элемента для 1 массива: ");
        int[] arr3 = new int[3];
        for(int i = 0; i < arr3.length; i++){
            System.out.println("Введите число: ");
            int value3 = scanner.nextInt();
            arr3[i] = value3;
        }
        System.out.println("Введите 3 элемента для 2 массива: ");
        int[] arr4 = new int[3];
        for(int i = 0; i < arr4.length; i++){
            System.out.println("Введите число: ");
            int value4 = scanner.nextInt();
            arr4[i] = value4;
        }
        //Array array = new Array();
        int[] result8 = array.contact(arr3, arr4);
        System.out.println("Результат: " + Arrays.toString(result8));

        //№10.Удалить негатив.
        System.out.println("№10.Удалить негатив.");
        System.out.println("Введите 3 элемента для массива: ");
        int[] arr10 = new int[3];
        for(int i = 0; i < arr10.length; i++){
            System.out.println("Введите число: ");
            int value10 = scanner.nextInt();
            arr10[i] = value10;
        }
        //Array array = new Array();
        int[] result10 = array.deleteNegative(arr10);
        System.out.println("Результат: " + Arrays.toString(result10));
    }
}