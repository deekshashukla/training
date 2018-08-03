package Multithreading;

public class Mythread extends Thread {
	private int data;

	public Mythread(String name) {
		super(name);

	}

	public void run() {
		String name=currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name +":"+ c);
	}

	public static void main(String[] args) {
		Mythread mt1 = new Mythread("First");
		Mythread mt2 = new Mythread("Second");
		Mythread mt3 = new Mythread("Third");

		mt1.start();
		mt2.start();
		mt3.start();
	}
}
