package maharishi;

public class IsPrimeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPrimeProduct(77));
	}
	static int isPrimeProduct(int n) {
		int a=0,b=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				int bit=0;
				if(isPrime(i)==0) {
					return 0;
				}else {
					if(a==0) {
						a=i;
						bit=1;
					}
					if(bit==0 && b==0) b=i;
				}
			}
		}
		if(a*b==n)
			return 1;
		else return 0;
	}
	static int isPrime(int m) {
		for(int i=2;i<=m/2;i++) {
			if(m%i==0) {
				return 0;
			}
		}
		return 1;
	}
}
