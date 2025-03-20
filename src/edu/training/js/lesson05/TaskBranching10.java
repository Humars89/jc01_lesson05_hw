package edu.training.js.lesson05;

import java.util.Scanner;

public class TaskBranching10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите радиус первого круга: ");
		double radius1 = sc.nextDouble();

		System.out.print("Введите радиус второго круга: ");
		double radius2 = sc.nextDouble();

		double area1 = Math.PI * radius1 * radius1;
		double area2 = Math.PI * radius2 * radius2;

		if (area1 < area2) {
			System.out.println("Площадь первого круга меньше: " + area1);
		} else if (area1 > area2) {
			System.out.println("Площадь второго круга меньше: " + area2);
		} else {
			System.out.println("Площади обоих кругов равны: " + area1);
		}

		sc.close();
	}
}