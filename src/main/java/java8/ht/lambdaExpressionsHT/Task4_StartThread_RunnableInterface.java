package java8.ht.lambdaExpressionsHT;

public class Task4_StartThread_RunnableInterface {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			int[] num = { 4, 3, 1, 6 };
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}

}
