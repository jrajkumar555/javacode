

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int max=10;
		for(int i=1;i<=max;i++) 
		 {
		  System.out.print(a+" ");
		int sum=a+b;
		a=b;
		b=sum;
		}

	}

}
