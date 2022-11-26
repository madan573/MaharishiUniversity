package maharishi;

public class PrimeHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = isPrimeHappy(32);
		System.out.print(res);
	}
	static int isPrimeHappy(int n) {
		int ret=0,sum=0;
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				sum = sum+i;
			}
		}
		if(sum>0 && sum%n==0) { //if zero prime then sum=0
			ret=1;
		}
		return ret;
	}
	static boolean isPrime(int a) {
		boolean r=true;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				r=false;
				break;
			}
		}
		return r;
	}
}
