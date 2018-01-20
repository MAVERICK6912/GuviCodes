import java.util.*;
import  java.lang.*;
class NumberReverse{
	public static void main(String a[]){
		Scanner scanner= new Scanner(System.in);
		int n,c,i=0;
		double rev=0,d;
		n=scanner.nextInt();
		while (n!=0) {
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
			i++;
		}
		System.out.print(rev);
	}
}