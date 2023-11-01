//Метод, который внесет изменения)
/*
Написать метод, генерирующий целочисленный массив заданной длинны из случайных значений в заданом диапазоне
Продемонстрировать работу метода в main (вызвать с любыми аргументами).
Для этого также написать метод, печатающий ТОЛЬКО массив в консоль
Подсказка: у метода генерации должно быть три параметра, и возвращаемый тип - целочисленный массив

Пример вывода программы:
    Генерируем массив из 8 значений в диапазоне от 10 до 20:
    12 15 10 11 17 19 11 16
 */

import java.util.Random;
import java.util.Scanner;

public class Main01 {

  public static int[] getRandomArray(int[] arr, int min, int max) {
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = min + random.nextInt(max - min);
    }
    return arr;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println();
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    int[] arr = new int[amount];
    getRandomArray(arr, 10, 20);
    printArray(arr);
  }

}
