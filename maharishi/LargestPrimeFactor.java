package maharishi;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = largestPrimeFactor(19);
		System.out.println(res);
	}
	static int largestPrimeFactor(int n) {
		int prime=0;
		if(n<=1) {
			return prime;
		}
		if(isprime(n)) {
			return n;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				if(isprime(i)) {
					prime =i;
				}
			}
		}
		return prime;
	}
	static boolean isprime(int x) {
		boolean r=true;
		if(x==2||x==3) {
			return true;
		}
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				r=false;
				break;
			}
		}
		return r;
	}
}
