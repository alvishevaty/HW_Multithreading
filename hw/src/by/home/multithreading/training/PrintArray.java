package by.home.multithreading.training;

public class PrintArray {

	public void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("| ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("|\n");
		}
		System.out.println("______________________________");
	}
}
