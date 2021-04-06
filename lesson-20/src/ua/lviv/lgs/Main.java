package ua.lviv.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//Програма мінімум
		System.out.println("Minimum");
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();
		
		Thread thread = new Thread(new RunnableThread());
		thread.run();
		
		System.out.println();
		
		//Програма максимум
		System.out.println("Maximum");	
		
		ExecutorService executable1 = Executors.newSingleThreadExecutor();
		executable1.execute(new MyThread());
		executable1.shutdown();
		while (!executable1.awaitTermination(24L, TimeUnit.HOURS)) {
		    System.out.println("Not yet. Still waiting for termination");
		}
		
		ExecutorService executable2 = Executors.newFixedThreadPool(5);		
		executable2.execute(new RunnableThread());
		executable2.shutdown();
	}

}

class MyThread extends Thread {
	
	@Override
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть кількість чисел Фібоначі для MyThread");
		int fibonacciNum = scanner.nextInt();		
		int previousNum = 0;
		int currentNum = 1;
		int intermediateNum = 0; 		
		
		System.out.print("Потік Thread: ");
		for (int i = 0; i < fibonacciNum; i++) {
			System.out.print(currentNum + " ");
			intermediateNum = currentNum;
			currentNum += previousNum;
			previousNum = intermediateNum;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

class RunnableThread implements Runnable{

	@Override
	public void run() {
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть кількість чисел Фібоначі для RunnableThread");
		
		int fibonacciNum = scanner.nextInt();		
		int[] fibonacciArray = new int[fibonacciNum];
		
		int previousNum = 0;
		int currentNum = 1;
		int intermediateNum = 0; 		
		
		for (int i = 0; i < fibonacciNum; i++) {
			fibonacciArray[i] = currentNum;
			intermediateNum = currentNum;
			currentNum += previousNum;
			previousNum = intermediateNum;
		}		

		System.out.print("Потік Runnable: ");
		for (int i = fibonacciArray.length-1; i >= 0; i--) {
			System.out.print(fibonacciArray[i] + " ");			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}