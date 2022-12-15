package maharishi;

public class BunkerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,10,1,13};
		System.out.print(isBunker(a));
	}
	static int isBunker(int[] a) {
		int prime=0, one=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) prime=1;
			if(a[i]==1) one=1;
			if(prime==1 && one==1) return 1;
		}
		return 0;
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
