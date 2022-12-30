package maharishi;
public class porcupineNumber {
	public static void main(String[] args) {
		int r = findPorcupineNumber(139);
		System.out.println(r);
	}
	public static int findPorcupineNumber(int n) {
		if(isPrime(n)==1 && n%10==9) {
			for(int i=n+1;i<=Integer.MAX_VALUE;i++) {
				if(isPrime(i)==1) {
					if(i%10==9) { return i;}
					else return 0;
				}
			}
		}
		return 0;
	}
	
	public static int isPrime(int n) {
		if(n<1) return 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}

}
