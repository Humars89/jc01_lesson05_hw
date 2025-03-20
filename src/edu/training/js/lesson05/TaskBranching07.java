package edu.training.js.lesson05;

import java.util.Scanner;

public class TaskBranching07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        int a = sc.nextInt();

        System.out.print("Введите значение b: ");
        int b = sc.nextInt();

        System.out.print("Введите значение c: ");
        int c = sc.nextInt();

        System.out.print("Введите значение x: ");
        int x = sc.nextInt();

        int result = a * x * x + b * x + c;

        if (result >= 0) {
            System.out.println("Модуль выражения: " + result);
        } else {
            System.out.println("Модуль выражения: " + (-result));
        }

        sc.close();
    }
}