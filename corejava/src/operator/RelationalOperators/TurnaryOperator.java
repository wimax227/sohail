package operator.RelationalOperators;

public class TurnaryOperator {

	public static void main(String[] args) {
		String name = args[0];
		String message="";
		/*
		System.out.println(name.toUpperCase());
		if (name.contains("amat"))
		{message="zaman is great";
		}
		else{
			message="zaman is bad";
			
			}*/
		
		message=name.contains("aman")? "zaman is GREAT" : "other wise he is bad";
		System.out.println(message);

	}

}
