class MyThread implements Runnable {
    
	Thread thrd;
    static Evaluate eva = new Evaluate();
    int a[];
    int answer, count = 0;

    MyThread(String name, int data[]) {
        thrd = new Thread(this, name);
        a = data;
        thrd.start(); 
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        a = eva.evaluate(a, 2);
        System.out.println(thrd.getName() + " terminating.");
    }
}