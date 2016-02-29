/*package com.sohail.tutorial.threading.synch;

public class Bank implements Runnable {
private Account account =new Account();

	@Override
	public void run() {
		makewithdraw(10);
		for(int i=0; i<5; i++){
			if(account.getBalance()<0);{
				System.out.println(Thread.currentThread().getName()+ "over");
			}
		}
		
		private void makewithdraw(int amount)	
		{
			if(account.getBalance()>=amount){
			account.withdraw(10);
			}else{System.out.println("No Balance..sorry no money!!!");}

		}

		
	}

	

}
*/