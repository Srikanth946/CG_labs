package lab5;
import java.util.*;
public class Exercise2 {
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter FirstName");
		String First_name=sc.nextLine();
		System.out.println("Enter Lastname");
		String Last_name=sc.nextLine();
		//System.out.println(First_name+" "+Last_name);
		try {
		if(First_name=="" & Last_name=="") {
			throw new InvalidName("Invalid Name");
			
		}}
		catch(InvalidName e) {
			System.out.println(e.getMessage()
					);
			
		}
		finally {
			System.out.println("Ended");
		}
	}

}
