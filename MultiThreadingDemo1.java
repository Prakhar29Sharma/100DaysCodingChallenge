class MultiThreadingDemo1 extends Thread{
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiThreadingDemo1 t1 = new MultiThreadingDemo1();
		t1.start();
	}
}
