package edu.training.js.lesson05;

import java.util.Scanner;

public class TaskBranching09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите длину стороны a: ");
		int a = sc.nextInt();

		System.out.print("Введите длину стороны b: ");
		int b = sc.nextInt();

		System.out.print("Введите длину стороны c: ");
		int c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println("Треугольник является равносторонним.");
		} else {
			System.out.println("Треугольник не является равносторонним.");
		}

		sc.close();
	}
}
