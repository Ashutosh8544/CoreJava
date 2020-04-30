class MyThread1 extends Thread{
	MyThread1(){
		super();
	}
	MyThread1(Runnable target){
		super(target);	
	}
	public void run(){
		System.out.println("From MyThread.run()");
		super.run();
	}
}