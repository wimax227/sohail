
public class DoWhileLoop {

	public static void main(String[] args) {
		DoWhileLoop dw = new DoWhileLoop();
		dw.dwLoop();

	}

	public void dwLoop(){
		int heights[]={2,9,34,92,21};
		int i=0;
		
		
	do {
			System.out.println(i);
			i++;
			
		} while (i<heights.length);

			}
}
