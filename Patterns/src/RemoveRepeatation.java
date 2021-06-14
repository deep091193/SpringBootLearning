
public class RemoveRepeatation {

	static long removeOccur(long n) {
		long prevDig = n%10;
		long pow = 10;
		long res = prevDig;
		
		
		// Iterate through all digits of n, 
        // note that the digits are  
        // processed from least significant 
        // digit to most significant digit.
		
		
		while (n > 0) {
			// Store current digit 
			
			long currDig =  n%10;
			
			if(currDig != prevDig) {
				  // Add the current digit to 
                // the beginning of result
				
				res += currDig * pow;
				
				
				// Update previous result 
                // and power 
				
				prevDig = currDig;
				pow *=10;
			}
			
			 // Remove last digit from n 
            n = n / 10; 
		}
	
		return res;
	}
	
	public static void main(String[] args) {
		

		long n = 1222334467;
		
		System.out.println(removeOccur(n));
	}

}
