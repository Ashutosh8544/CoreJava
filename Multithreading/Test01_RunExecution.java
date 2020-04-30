class  Test01_RunExecution{
	public static void main(String[] args){
		//case 1:
		Thread th1 = new Thread();
		th1.start();	//Run method execute from Threa class
		//th1.start1();//Exception in thread "main" java.lang.IllegalThreadStateException
		
		//case 2:
		MyThread1 mt1 = new MyThread1();
		mt1.start();//From MyThread.run()
		
		//case3:
		MyRunnable1 mr1 = new MyRunnable1();
		//mr1.start();//cannot find symbol
		
		//case 4:
		Thread th2 = new Thread(mr1);
		th2.start();//From MyRunnable.Run()
		
		//case 5:
		MyThread mt2  = new MyThread();
		Thread th3 = new Thread(mt2);
		th3.start();//From MyThread.run()
		
		//case 6:
		Thread th4 = new MyThread();
		th4.start();//From MyThread.run()
		
		//case 7:
		//Thread th5 = new MyRunnable();//CE: incompatible types: MyRunnable cannot be converted to Thread
		//th5.start();
		
		//case 8:
		Runnable r1 = new MyRunnable();
		//r.start();//CE: Can not find Symbol
		
		//case 9:
		Thread th6 = new Thread(r1);
		//th6.start();//CE: incompatible types: MyRunnable cannot be converted to Thread
		
		//case :10
		Runnable r2 = new MyThread();
		//r2.start();//CE:  cannot find symbol
		
		//case 11:
		Thread th7 = new Thread(r2);
		th7.start();//From MyThread.run()
	
		//case 12:
		MyRunnable1 mr2 = new MyRunnable1();
		MyThread1 mt3 = new MyThread1(mr2);
		mt3.start();	//From MyThread.run()

		//case 13:
		MyThread1 mt4 = new MyThread1();
		MyThread1 mt5 = new MyThread1(mt4);
		mt5.start();	//From MyThread.run()
	}
}

