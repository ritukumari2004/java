import java.util.*;
public class Q1 {

	public static void main(String[] args) {
			      Scanner sc=new Scanner(System.in);
			      System.out.println("Enter the integer Number");
			      int num=sc.nextInt();  
			      int n = num;
			      int count = 0;
			      while (num != 0) {
			         count++;
			         num >>= 1;
			      } 
			      System.out.print("The total bits in " + n + " are " + count);
			   }
			

	}

