package conditional_statements_for_interview;

import java.util.Scanner;

public class Number_is_even_or_odd {

	public static void main(String[] args) {

		int n;
		System.out.println("enter your number");
		Scanner sc =new Scanner(System.in);
 	  n=sc.nextInt();
 	  if(n%2==0)
 	  {
 		 System.out.println("number is even");
 		 }
 	  else
 	  {
 		 System.out.println("number is odd");

 	  }
 		}

}