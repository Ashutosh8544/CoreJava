class MyThread extends Thread{
	public void run(){
		System.out.println("run is executed");
	}
	public static void main(String[] args){
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("main is executed");
	}
}
