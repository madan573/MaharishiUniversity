package maharishi;

public class TwinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5, 14,7, 18, 67};
		System.out.print(isTwin(a));
	}
	static int isTwin(int[] a) {
		int f;
		for(int i=0; i<a.length;i++) {
			if(isPrime(a[i]) && (isPrime(a[i]+2) ||  isPrime(a[i]-2))) {
				f=0;
				for(int j=0;j<a.length;j++) {
					if(a[j]==a[i]+2 || a[j]==a[i]-2) f=1;
				}
				if(f!=1) return 0;
			}
		}
		return 1;
	}
	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
