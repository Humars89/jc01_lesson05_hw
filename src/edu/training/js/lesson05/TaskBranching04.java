package edu.training.js.lesson05;

import java.util.Scanner;

public class TaskBranching04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число a: ");
		int a = sc.nextInt();

		System.out.print("Введите число b: ");
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("Числа равны");
		} else {
			System.out.println("Числа не равны");
		}

		sc.close();
	}
}