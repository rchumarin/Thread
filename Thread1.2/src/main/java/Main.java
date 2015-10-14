public class Main {

	public static void main(String[] args) throws InterruptedException {

		int a[] = { 1, 2, 3, 4, 5 };
		
		int x = 2; //сервер с Х ядрами
		
		for (int i=1; i< x+1; i++) {
			String str = Integer.toString(i);
			MyThread mt = new MyThread("Child #".concat(str), a);
			try {
	            mt.thrd.join();
	        }
	        catch(InterruptedException exc) {
	            System.out.println("Main thread interrupted.");
	        }
		}
        System.out.println("Main thread ending.");
		
	}
}
