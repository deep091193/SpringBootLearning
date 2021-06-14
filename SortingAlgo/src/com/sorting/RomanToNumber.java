package com.sorting;

public class RomanToNumber {
	
	int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
	
	int romanToDecimal(String st) {
		int res= 0;
		for(int i = 0; i < st.length(); i++) {
			int st1= value(st.charAt(i));
			if(i+1 < st.length()) {
				int st2 = value(st.charAt(i+1));
				if(st1>= st2) {
					res = res+st1;
				}else {
					res = res+ st2 - st1;
					i++;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		RomanToNumber rNumber = new RomanToNumber();
		String str = "MCMIV";
		System.out.println("The Integer form is :" +
		                      rNumber.romanToDecimal(str));
	}

}
