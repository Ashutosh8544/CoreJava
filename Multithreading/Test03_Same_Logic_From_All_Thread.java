class MyThread7 extends Thread{
	public void run(){
		for (int index=50;index>=1;index--){
			System.out.println("run "+index+" ");
		}
	}
}
class Test03_Same_Logic_From_All_Thread{
	public static void main(String[] args){
		MyThread7 mt1 = new MyThread7();
		mt1.start();
	
		MyThread7 mt2 = new MyThread7();
		mt2.start();
	
		MyThread7 mt3 = new MyThread7();
		mt3.start();
	}
}
