
public class NumbersMain {

	public static void main(String[] args) {


		Interface1.staticMethod();
		Operations1 checkOddEven = (a)->{if(a%2==0) {
			return "even";}else return "odd";
		};
		System.out.println(checkOddEven.checkNumber(5));
		
		Operations1 checkPrime = (n)-> {
			 if (n <= 1) 
		            return "Not a prime"; 
		       
		        // Check from 2 to n-1 
		        for (int i = 2; i < n; i++) 
		            if (n % i == 0) 
		            	return "Not a prime"; 
		       
		        return "prime"; 
		};
		
		System.out.println(checkPrime.checkNumber(11));
		
		Operations1 checkPalindrome = (n)->{
			int r,sum=0,temp;    
			temp=n;  
			while(n>0)    
			{    
			r=n%10;    
			sum=(sum*10)+r;    
			n=n/10;    
			}    
			if(temp==sum)    
			return "palindrome";    
			else    
			return "not palindrome";  
			};
		System.out.println(checkPalindrome.checkNumber(252));

	}

}
