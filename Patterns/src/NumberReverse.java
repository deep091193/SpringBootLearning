import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		int n,m,a=0,x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		n=scanner.nextInt();
		m=n;
		while(n>0) {
			x=n%10;
			a=a*10+x;
			n=n/10;
			
		}
		if(a==m) {
			System.out.println("Palindrom: " + m);
		}else {
			System.out.println("Not Plaindrom" + m);
		}
		System.out.println(a);
	}
}
