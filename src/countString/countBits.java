package countString;

/**
 * @param s String to count number of bits
 * @param b bit value to count in s can either be 0 or 1 throws exception otherwise
 * @return number of occurrences of b in s
 * @author Mubeen Khan
 *
 */
public class countBits {
	
	public static int countZerosOrOnes(String s, int b) throws Exception {
		int countOnes = 0,countZeros = 0;		
		if(b==0) {
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='0') {
				countZeros++;
			}		
		}
		return countZeros;
		}
		if (b==1) {		
		for (int j=0;j<s.length();j++) {
			if (s.charAt(j)=='1') {	
				countOnes++;
			}	
		}
		return countOnes;
	}
		throw new Exception("b must be zero or one");
}}
