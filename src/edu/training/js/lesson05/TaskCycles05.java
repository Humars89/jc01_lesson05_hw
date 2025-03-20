package edu.training.js.lesson05;

public class TaskCycles05 {

	public static void main(String[] args) {
		int number = 1;
        int sum = 0;

        while (number <= 99) {
            sum += number;
            number += 2;
        }

        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + sum);
    }
}