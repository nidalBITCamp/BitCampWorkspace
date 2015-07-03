package ba.bitcamp.exercise.recursion.task1;

import java.util.Arrays;

public class Task1 {

	/**
	 * Method for print number some of times
	 * 
	 * @param name
	 *            - String for print
	 * @param num
	 */
	static void print(String name, int num) {

		if (num == 0) {
			return;
		}
		System.out.println(name);
		print(name, num - 1);
	}

	/**
	 * Method for print every second number
	 * 
	 * @param num
	 *            = integer number
	 */
	public static void printEverySecondNumber(int num) {

		if (num < 1) {
			return;
		}
		System.out.println(num);
		printEverySecondNumber(num - 2);
	}

	/**
	 * Method for get sum
	 * 
	 * @param num
	 *            - integer number
	 * @return - sum of numbers
	 */
	public static int getSum(int num) {

		if (num < 0) {
			return 0;
		}
		return num + getSum(num - 1);

	}

	// Task 4
	public static int getFibonacciNumber(int num) {

		if (num == 0) {

			return 0;

		} else if (num == 1) {

			return 1;
		}

		return getFibonacciNumber(num - 1) + getFibonacciNumber(num - 2);

	}

	// Task 5
	public static void fillArray(int[] arr) {
		fillArray(arr, 0);

	}

	private static void fillArray(int[] arr, int i) {

		if (i == arr.length) {
			return;
		}

		arr[i] = i + 1;

		fillArray(arr, i + 1);

	}

	// Task 6
	public static boolean isInArray(int[] arr, int num) {

		return isInArray(arr, num, 0);

	}

	private static boolean isInArray(int[] arr, int num, int i) {

		if (i == arr.length) {
			return false;
		}
		if (arr[i] == num) {

			return true;
		}

		return isInArray(arr, num, i + 1);

	}

	// Task 7
	public static boolean areTheSame(int[] a1, int[] a2) {

		return areTheSame(a1, a2, 0);

	}

	private static boolean areTheSame(int[] a1, int[] a2, int i) {

		if (i == a1.length) {
			return true;
		}

		if (a1[i] == a2[i]) {

			return areTheSame(a1, a2, i + 1);
		}

		return false;

	}

	public static void fillArray2(int[] array, int n) {

		array[n] = n;

		fillArray2(array, n , n - 1 , 1 , true);
		fillArray2(array, n , n - 1,  1 , false);

	}

	private static void fillArray2(int[] array, int n, int i, int j , boolean b) {

		if (i == 0 || i == array.length) {

			return;
		}

		array[i] = array[n] - j;
		j++;
		
		if ( b = true){
			fillArray2(array, n, i + 1, j -1, true);
		}
		   fillArray2(array, n, i - 1, j -1, false);
	}

	public static void main(String[] args) {

		// Using print method for print string three times
		print("Hello", 3);

		// Using method for print every second number
		printEverySecondNumber(2);

		// Print sum of number to console
		System.out.println(getSum(100));

		System.out.println(getFibonacciNumber(9));

		int[] array = new int[10];
		fillArray(array);
		System.out.println(Arrays.toString(array));

		int num = 0;
		int[] arry = { 1, 5, 2, 3, 5 };
		System.out.println(isInArray(arry, num));

		int[] arry1 = { 1, 6, 2, 3, 5 };
		System.out.println(areTheSame(arry, arry1));

		int[] arr = new int[10];
		fillArray2(array, 3);
		System.out.println(Arrays.toString(arr));
	}

}