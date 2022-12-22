package maharishi;

public class IsMeeraArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7, 6, 0, 10, 1};
		System.out.print(isMeera(a));
	}
	static int isMeera(int[] a) {
		int prime=0,zero=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])==1) prime=1;
			if(a[i]==0) zero=1;
			if(zero==1&&prime==1) return 1;
		}
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
