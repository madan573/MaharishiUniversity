package maharishi;

public class NPrimeableNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,15,1, };
		int res =isNPrimeable(a,2);
		System.out.print(res);
	}
	static int isNPrimeable(int[] a , int n) {
		if(a.length==0) {
			return 1;
		}
		for(int i=0;i<a.length;i++) {
			if(!isPrime(a[i]+n)) {
				return 0;
			}
		}
		return 1;
	}
	static boolean isPrime(int b) {
		if(b<=1) {
			return false;
		}
		for(int i=2;i<=b/2;i++) {
			if(b%i==0) {
				return false;
			}
		}
		return true;
	}
}
