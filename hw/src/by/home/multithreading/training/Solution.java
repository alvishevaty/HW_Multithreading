package by.home.multithreading.training;

public class Solution {

	public static void main(String[] args) throws InterruptedException {

		Array array = new Array();
		PrintArray printArray = new PrintArray();
		MyThread myThread;
		Thread thread;

		for (int i = 1; i <= array.getAr().length; i++) {
			myThread = new MyThread(i, array);
			thread = new Thread(myThread);
			thread.start();
		}
		
		printArray.print(array.getAr());
	}
}
