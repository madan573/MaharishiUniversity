package maharishi;

public class IsHolderNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = isHolderNumber(127);
		System.out.print(res);
	}
	static int isHolderNumber(int n) {
		int num;
		if(isPrime(n)) {
			for (int i=2;i<=n;i++) {
				num=1;
				for(int j=1;j<=i;j++) {
					num= num*2;
			}
			if((num-1)>n) {
				return 0;
			}
			if((num-1)==n) {
				return 1;
			}
		}
		}
		return 0;
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
