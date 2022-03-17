package Day3;
/*Q wap to ask name and marks of student and check 

if marks >80  print A grade 
if marks >70 print B grade 
if marks >60 print c grade 
else  print D grade 
*/
import java.util.Scanner;
public class StudentGradingApplication 
{
	public static void main(String[] args) 
	{     
		String studentname;
		int marks; 
		// scanner is predefined class in java.util package 
		Scanner s = new Scanner(System.in);

		System.out.println("enter name");
		studentname= s.next();  // to take full name we use nextLine ()
		System.out.println("enter marks");
		marks= s.nextInt();   
		System.out.println(" name= "+ studentname);
		System.out.println(" marks= "+ marks);
		
		if(marks>80)  			System.out.println(" A Grade");
		else if(marks>70)    	System.out.println(" B Grade");
		else if(marks>60)		System.out.println(" c Grade");
		else          			System.out.println(" D Grade");
		

	}

}
