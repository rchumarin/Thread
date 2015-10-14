public class Evaluate {
	private int x;
	int[] array;
	
	synchronized int[] evaluate(int data[], int p) {
		//где data - массив целых положительных чисел,
		//p - степень, в которую нужно возвести каждое из чисел в массиве
		
		array = new int[data.length]; //массив размером, равным исходному для сохранения результатов возведения в степень
		
		for (int i = 0; i < data.length; i++) {
			
			x = (int) Math.pow(data[i], p);	
			array[i] = x;
			
			System.out.println("Running Exponentiation data[" + i + "] for "
					+ Thread.currentThread().getName() + " is " + x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		return array;
	}
}
