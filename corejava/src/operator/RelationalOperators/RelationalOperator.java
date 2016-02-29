package operator.RelationalOperators;

public class RelationalOperator {

	public static void main(String[] args) {
	int zaman = 40;
	int hamdan = 40;
		
//		boolean output = ((age1<=age2));
		
//		System.out.println((age1==age2));
//		System.out.println(output);
		
		if ((zaman >= hamdan)){
	
		System.out.println("zaman is hamdan's dad");
		}
		else
		{System.out.println("hamdan is younger");
		}
		
		String name1= "niha";
		String name2= "niha";
				if (name1.equals(name2))
				{
		            System.out.println("they are good friends");
				}
				else {System.out.println("they are bad");}
			boolean cond1 = (zaman>=hamdan);
			boolean cond2 = (name1.equals(name2));
			
			if (cond1 | cond2)
			{System.out.println("they are succesful");}
			else {System.out.println("they are not");}
			
			
				
		}

		}
