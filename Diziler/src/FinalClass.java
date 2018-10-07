import java.util.Arrays;

public class FinalClass {
	public static void main(String[] args) {
		double myList[] = { 1.9, 2.9, 3.4, 3.4 };
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		double top = 0;
		for (int i = 0; i < myList.length; i++) {
			top += myList[i];
		}
		System.out.println("Total is " + top);
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Maximum value is " + max);
		double min = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] < min)
				min = myList[i];
		}
		System.out.println("Minimum value is " + min);
		for (double element: myList) {
			System.out.println(element);
		}
		printArray(new int[]{3, 1, 2, 6, 4, 2});
		int[] intArr = {30, 20, 5, 12, 55};
		Arrays.sort(intArr);
		System.out.println("The sorted int array is ");
		for (int number: intArr) {
			System.out.println("Number: " + number);
		}
		int searchVal = 12;
		int retVal = Arrays.binarySearch(intArr, searchVal);
		System.out.println("The index of element 12 is " + retVal);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
