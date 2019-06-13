package countString;

public class countZerosOnes {
	public static int countZerosOrOnes(String s, int b) {
		int countOnes = 0,countZeros = 0;		
		//if(b==0) {
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)==0) {
				System.out.println(s.charAt(0));
				countZeros++;
			}
			
		}
		System.out.println(countZeros);
		return countZeros;
	}

	public static void main(String[] args) {
		int count = countZerosOnes.countZerosOrOnes("00mubeen", 0);
		System.out.println(count);
		System.out.println(count);

	}

}
