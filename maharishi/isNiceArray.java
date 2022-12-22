package maharishi;

public class isNiceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={0, 9, 4, 6};
		System.out.print(IsNiceArray(a));
	}
	static int IsNiceArray(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])==1) {
				sum+=a[i];
			}
		}
		if(sum==a[0]) return 1;
		return 0;
	}
	static int isPrime(int n) {
		if(n<=1) return 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}
}
