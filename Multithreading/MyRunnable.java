class MyRunnable implements Runnable{
	public void run(){
		System.out.println("Run Executed");
	}
	public static void main(String[] args){
		MyRunnable mr = new MyRunnable();
		//mr.start();//CE:  cannot find symbol
		Thread th = new Thread(mr);
		th.start();
		System.out.println("Main executed");
	}
}
