package maharishi;
public class EncodeNumber {
	public static void main(String[] args) {
		int [] res = encodeNumber(6936);
		if(res==null) System.out.print("Null");
		else {
		for(int i:res) {
			System.out.println(i);
		}
		}
	}
	static int[] encodeNumber(int n) {
		if(n<=1) return null;
		int m, count=0;
		for(int i=2;i<=n;i++) {
			m=n;
			if(isprime(i)) {
				while(m%i==0) {
					count++;
					m/=i;
				}
			}
		}
		int[] a = new int[count];
		int j=0;
		for(int i=2;i<=n;i++) {
			m=n;
			if(isprime(i)) {
				while(m%i==0) {
					a[j]=i;
					j++;
					m/=i;
				}
			}
		}
		return a;
	}
	static boolean isprime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)	return false;
		}
		return true;
	}
}
