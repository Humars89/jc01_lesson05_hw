package edu.training.js.lesson05;

import java.util.Scanner;

public class TaskBranching03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число a: ");
		int a = sc.nextInt();

		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		sc.close();
	}
}
