package LogicBuildingExc;

public class Day1_print_1to10_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printing 1 to 10 numbers in java
//		---->using for loop<-----
		
/*		for(int i=1 ; i<=10 ;i++)
		{
			System.out.println("Printing 1 to 10 values "+i);
		}
		*/
		// ---->Using while loop<-----
		
		/* int i=1;
		while( i<=10)
		{
			System.out.println(i);
			i++;
	}
 */
	
		// ----->Using Do-While Loop<-----
		
		// (In Do -while loop we write a condition in while loop whereas in 'do' block we write a 
//		code which needs to be executed)
		int i=1;
		do
		{
			System.out.println("Printing values:"+i);
			i++;
		}
		while(i<=10);
	}

}
