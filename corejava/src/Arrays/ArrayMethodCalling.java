package Arrays;

public class ArrayMethodCalling {
	
	public static void main(String[] args){
		ArrayMethodCalling am = new ArrayMethodCalling();
//		am.MethodCallingOne();
//	am.MethodCallingTwo();
		am.twoDArray();
//Calculater ca = new Calculater();
//ca.printNumber();
	}
	
	public void twoDArray(){
		/*int ages[]= {15,16,17,18};
		int ssn[]={50,51,52,54};*/
		int agessn[][]={{15,50},{16,51},{17,52},{18,54}};
		
		for (int i=0; i<agessn.length; i++)
		{	
		/*	for (int j=0; j<agessn.length; j++)
			{	  
				int agessn[i][j]=k;
			
				System.out.println(agessn[0][j]);
		
		}*/
			System.out.println(agessn[i][0]);
	
	}
	
	/*public void MethodCallingOne(){
		int dist1 = 10;
		int dist2 = 20;
		int dist[] = new int[2];
		dist[0]= dist1;
		dist[1]= dist2;
		System.out.println(dist.length);
		System.out.println(dist[0]);
        System.out.println(dist[1]);
	}
	public void MethodCallingTwo(){
		int mark[] = {2,4,6,8};
//		System.out.println(mark.length);
		int len = mark.length;
		
     	for (int i=0; i< mark.length; i++)
		{
			System.out.println(mark[i]);
		
		}

		
	    for (int temp : mark){
			System.out.println(temp);
			
		}
		
*/	
	}
}
