import java.util.*;
import  java.lang.*;
class NumberReverse{
	public static void main(String a[]){
		Scanner scanner= new Scanner(System.in);
		int n,c,d,rev=0,i=0;
		n=scanner.nextInt();
		while (n!=0) {
			d=n%10;
			rev=rev+d*(Math.pow(10,i));
			n=n/10;
			i++;
		}
		System.out.print(rev);
	}
}