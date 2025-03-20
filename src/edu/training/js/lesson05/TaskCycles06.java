package edu.training.js.lesson05;

import java.util.Scanner;

public class TaskCycles06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Пожалуйста, введите положительное число!");
        } else {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Сумма всех чисел от 1 до " + number + " равна: " + sum);
        }
        sc.close();
    }
}
