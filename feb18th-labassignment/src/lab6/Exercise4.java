package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Exercise4 {
	
	public static Map<Integer,String> getStudents(HashMap<Integer,Integer> arr){
		//Set s=arr.entrySet();
		Map<Integer,String> out=new HashMap();
		for(Map.Entry<Integer, Integer> i: arr.entrySet()) {
			if(i.getValue()>=90) {
				out.put(i.getKey(), "Gold");
			}
			else if(i.getValue()>=80 && i.getValue()<90) {
				out.put(i.getKey(), "Silver");
			}
			else if(i.getValue()>=70 && i.getValue()<80) {
				out.put(i.getKey(), "Bronze");
			}
			else {
				out.put(i.getKey(), null);
			}
			
			
			
		}
		return out;
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no of entrys");
//		int p=sc.nextInt();
//		System.out.println("Enter id <Space> Enter marks");
//		HashMap<Double,Integer> arr = new HashMap();
//		int k=0;
//		while(k<p) {
//			String n=sc.nextLine();
//			String[] marks=n.split(" ");
//			//Integer i=Integer.parseInt(marks[1]);
//			
//			arr.put(Double.valueOf(Integer.parseInt(marks[0])), Integer.valueOf(marks[1]));
//			k++;
//			
//			
//		}
		HashMap<Integer,Integer> arr = new HashMap();
		arr.put( 1, 90);
		arr.put(2, 85);
		arr.put(406, 45);
		arr.put(59689, 75);
		
		
		
		System.out.println(getStudents(arr));
		
		
		
	}
	

}
