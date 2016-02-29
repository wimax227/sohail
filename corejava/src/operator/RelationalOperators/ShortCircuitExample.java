package operator.RelationalOperators;

public class ShortCircuitExample {

	public static void main(String[] args) {
 int age = 4;
 int height= 5;
 if ((age++>=4) && (height++>5))
 {System.out.println("I am sucessful");}
 else{System.out.println("I am not........");}
 
 System.out.println("age =" +age);
 System.out.println("height=" +height);

	}

}
