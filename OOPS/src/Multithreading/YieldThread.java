package Multithreading;

public class YieldThread {

	static class HelloThread extends Thread{
		
		public void run() {
			while(true) {
				System.out.println("Hello");
				yield();
//			try {
//				Thread.sleep(1);
//			}
//			catch(InterruptedException e) {}
		}
	}
}
	static class WorldThread extends Thread{

		public void run() {
			while(true) {
				System.out.println("World");
				yield();
//			try {
//				Thread.sleep(1);
//			}
//			catch(InterruptedException e) {}
	}
	}
	}
	public static void main(String args[])
	{
		HelloThread hello=new HelloThread();
		WorldThread world=new WorldThread();
		
		hello.start();
		world.start();
	}
	
	
}
