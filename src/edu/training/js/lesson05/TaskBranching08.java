package edu.training.js.lesson05;

import java.util.Scanner;

public class TaskBranching08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число a: ");
		int a = sc.nextInt();

		System.out.print("Введите число b: ");
		int b = sc.nextInt();

		int squareA = a * a;
		int squareB = b * b;

		if (squareA < squareB) {
			System.out.println("Наименьший из квадратов: " + squareA);
		} else {
			System.out.println("Наименьший из квадратов: " + squareB);
		}

		sc.close();
	}
}
