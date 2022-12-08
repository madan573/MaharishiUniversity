package maharishi;

public class MagicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,6,8,20};
		System.out.print(isMagicArray(a));
	}
	static int isMagicArray(int[] a) {
		int primeSum=0;
		if(a.length==0) {
			return 0;
		}
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				primeSum+=a[i];
			}
		}
		if(primeSum==a[0]) {
			return 1;
		}else {
			return 0;
		}
	}
	static boolean isPrime(int n) {
		if(n<=1) {
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
