package maharishi;
public class PascalNumber {
	public static void main(String[] args) {
		System.out.print(isPascal(11));
	}
	static int isPascal(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			if(sum==n) return 1;
			if(sum>n) return 0;
		}
		return 0;
	}
}
