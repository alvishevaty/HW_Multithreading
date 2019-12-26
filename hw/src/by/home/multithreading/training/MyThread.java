package by.home.multithreading.training;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {

	private static Lock lock = new ReentrantLock();;
	private Array array;
	private int number;

	public MyThread(int number, Array array) {
		this.number = number;
		this.array = array;
	}

	@Override
	public void run() {
		lock.lock();
		array.changeArray(number);
		lock.unlock();
	}
	
}
