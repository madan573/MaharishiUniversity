package maharishi;

public class IsBunkerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4, 9, 6, 7, 3};
		System.out.print(isBunkerArray(a));
	}
	static int isBunkerArray(int[] a) {
		for(int i=1;i<a.length;i++) {
			if(isPrime(a[i])==1) {
				if(a[i-1]%2==1) return 1;
			}
		}
		return 0;
	}
	static int isPrime(int n) {
		if(n<=1) {
			return 0;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}
}
