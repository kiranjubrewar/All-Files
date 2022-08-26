import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		double result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 4 number ");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if(a<b && c<d) {
			result=a+b+c+d;
			System.out.println("sum of all "+result);
			
		}
		if(a<b || c<d) {
			result=a-b-c-d;
			System.out.println("sub of all "+result);
		}
		if(a<b && c<d) {
			result=a*b*c*d;
			System.out.println("multiplcation of all number "+result);
			
		}
		if(!( c>d)) {
			result=a/b;
			System.out.println("division of two number "+result);
			
			
		}
		
		
		

	}

}
