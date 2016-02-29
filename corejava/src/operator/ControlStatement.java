package operator;

import java.lang.invoke.SwitchPoint;

public class ControlStatement {

	public static void main(String[] args) {
		ControlStatement cs= new ControlStatement();
		cs.ifElse();
		SwitchStatement();
		cs.SwitchStatment();

	}
	
	public void ifElse(){
		
		int a= 10;
		int b= 20;
		if (a > b)
		{System.out.println("a>b");}
		else if (a<b)
	    {System.out.println("a is less than b");}
	    
		else if (a == b)
	    {System.out.println("a is equal to b");}
	    
	    else{System.out.println(" everything is not good");}
	    
	    
	}
	
	
	
	public static void SwitchStatement(){
		int i=4;
		if (i==1){
			System.out.println("i is 1");
		}else if (i==2){
			System.out.println("i is 2");
		}else if (i==3){
			System.out.println("i is 3");
		}else if (i==4){
			System.out.println("i is 4");
		}else {System.out.println("its horrible");}
	}
	
	public void SwitchStatment(){
		int a=5;
		switch (a) {
		case 1:System.out.println("i is 1");
		break;
		case 2:System.out.println("i is 2");
		break;
		case 3:System.out.println("i is 3");
		break;
		case 4:System.out.println("i is 4");
		break;

		default:System.out.println("its horrible");
			break;
		}
	}

}
