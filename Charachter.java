package Guvi2;
import java.util.*;
public class Charachter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Charachter");
		char c=s.next().charAt(0);
		int a=(int)c;
		if((a<91 && a>=65) || (a>96 && a<123))
		{
			System.out.println("The character is Alphabet");
			} 
		
		else
		{
			System.out.println("The character is not Alphabet"); 
		}
				

	}

}
