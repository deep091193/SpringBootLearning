
public class Palindromnumber {
	
	
	
	public static void checkPalindrom(int num){
		int temp = num;
		int sum = 0;
		int r;
		while(num>0){
			r = num%10;
			sum = (sum*10) +r;
			num = num /10;
			
			
		}
		
		if (sum == temp){
			System.out.println("Palindrom");
		}else{
			System.out.println("Not");
		}
	}
	public static void main(String[] args) {
		int num = 153;
		
		checkPalindrom(num);
	}

}
