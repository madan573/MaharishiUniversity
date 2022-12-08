package maharishi;

public class IsTwinPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isTwinPrime(53));
	}
	static int isTwinPrime(int n) {
		if(isPrime(n) && isPrime(n+2) ||isPrime(n)&&isPrime(n-2)) {
			return 1;
		}else {
			return 0;
		}
	}
	static boolean isPrime(int m) {
		if(m<=1) {
			return false;
		}
		for(int i=2;i<=m/2;i++) {
			if(m%i==0) {
				return false;
			}
		}
		return true;
	}
}
