package lab9;

import java.util.Arrays;

@FunctionalInterface
interface Mark{
	public String power(String a);
}
public class Exercise2 {
	public static void main(String[] args) {
		Mark s1= (a)->{
			String [] str=a.split("");
			String out="";
			//System.out.println(Arrays.toString(str));
			for(String i: str) {
				out=out+i+" ";
			}
			return out;
			
		
		};
		System.out.println(s1.power("Srikanth"));
	}

}
