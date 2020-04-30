
//case 1:
//class MyRunnable2 implements Runnable{} //CE: MyRunnable2 is not abstract and does not override abstract method run() in Runnable

//case 2:
class MyThread2 extends Thread{}
//case 3:
class MyThread3 extends Thread implements Runnable{}
//case 4:
class MyThread4 extends Thread{
	public void run(){
		System.out.println("run 0-param");
	}
	public void run(String s){
		System.out.println("run String-param");
	}
}
class Test02_Runnable_Thread{
	public static void main(String [] args){
		MyThread4 mt1 = new MyThread4();
		mt1.start();//run 0-param
	}	
}
//case 5:
class MyThread5 extends Thread{
	public void run(String s){
		System.out.println("run String-param");
	}
}
//case 6:
/*
class MyRunnable1 implements Runnable{ // MyRunnable1 is not abstract and does not override abstract method run() in Runnable
	public void run(String s){
		System.out.println("run String-param");
	}
}
*/
//case 7:
abstract class MyRunnable2 implements Runnable{
	public void run(String s){
		System.out.println("run String-param");
	}
}
//case 8:
class MyRunnable3 implements Runnable{
	public void run(){
		System.out.println("run 0-param");
	}
	public void run(String s){
		System.out.println("run String-param");
	}
}

//case 9:
class MyRunnable4 extends Thread implements Runnable{
	public void run(String s){
		System.out.println("run String-param");
	}
}