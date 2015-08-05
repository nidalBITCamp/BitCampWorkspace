package ba.bitcamp.lectures;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

	// private static ArrayBlockingQueue tasks = new ArrayBlockingQueue(10);
	private static LinkedBlockingQueue<Runnable> tasks = new LinkedBlockingQueue<Runnable>(
			2);

	public static void startExample() {

		new Producer().start();

		new Consumer().start();

	}

	private static class Producer extends Thread {

		@Override
		public void run() {

			tasks.offer(new Calculate(1, 10));
			tasks.offer(new Calculate(5, 55));
			tasks.offer(new Calculate(4, 75));

		}

	}

	private static class Consumer extends Thread {

		@Override
		public void run() {

			Thread t;
			try {
				while ((t = new Thread(tasks.take())) != null) {

					t.start();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private static class Calculate implements Runnable {

		private int start;
		private int end;

		public Calculate(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		public void run() {

			int result = 0;
			for (int i = start; i < end; i++) {
				result += i;

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("Result: " + result);

		}
	}

}
