import java.util.*;
class Fact{
	public static void main(string a[]){
		int a, fact=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for (int i=1;i<=a;i++ ) {
			fact=fact*i;
		}
		System.out.print(fact);
	}
}