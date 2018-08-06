import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {

	public void run() {
		System.out.println("Thread running from pool");
	}

	public static void main(String[] args) {
		ThreadPool rable = new ThreadPool();
	//	Executor pool = Executors.newFixedThreadPool(10);   //creates executable threads with maz value
		ExecutorService service= Executors.newFixedThreadPool(10);
		
		for (int c = 1; c <= 10; c++)
			//pool.execute(rable);
			service.execute(rable);
		service.shutdown();
			
	}

}
