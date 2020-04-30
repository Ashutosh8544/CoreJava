class MyThread6 extends Thread{
	public void run(){
		for (int index=100;index>=1;index--){
			System.out.println("run "+index+" ");
		}
			setPriority(1);
			System.out.println("run Priority  " + getPriority());
			System.out.println("state of Thread-0 " + getState());
	}
}
class Test03_Concurrently_Task{
	public static void main(String[] args){
		MyThread6 mt1 = new MyThread6();
		mt1.start();
		mt1.setPriority(10);
		System.out.println("main Priority " + mt1.getPriority());
		System.out.println("state of main" + mt1.getState());

		for (int index=1;index<=10;index++){
			System.out.println("main "+index+" ");
		}
	}
}
