class MyThread8 extends Thread{
	int x;
	MyThread8(int x){
		this.x = x;
	}
	public void run(){
		for (int index=0;index<=this.x;index++){
			System.out.println("run "+index+" ");
		}
	}
}
class Test04_Same_Logic_Concurrently_With_Different_State{
	public static void main(String[] args){
		MyThread8 mt1 = new MyThread8(10);
		mt1.start();
	
		MyThread8 mt2 = new MyThread8(20);
		mt2.start();
	
		MyThread8 mt3 = new MyThread8(30);
		mt3.start();
	}
}
