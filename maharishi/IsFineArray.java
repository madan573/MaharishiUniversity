package maharishi;

public class IsFineArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,9,5,6,7};
		System.out.print(isFineArray(a));
	}
	static int isFineArray(int[] a) {
		int isPr=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				isPr++;
			}
		}
		if(isPr%2==0) {
			return 1;
		}else {
			return 0;
		}
	}
	static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
