package com.sohail.tutorial.inheritance.abstractionExample;
public class AbstractionClient {

	public static void main(String[] args) {
		VocalClassical vm= new VocalClassical("classical","bala", "flute");
        System.out.println(vm.classicalDuration());
        printSpeed(vm);
		
		/*Music rm=new RockMusic("rm","Anu malik","guitar");
         System.out.println(rm.singingspeed());		
         printSpeed(rm);*/
		
        SymphonyClassical sc=new SymphonyClassical("classical","bala", "flute");
        System.out.println(sc.classicalDuration());
		
		
	}
	
	public static void printSpeed(Music music){
		System.out.println(music.singingspeed());
	}

}
