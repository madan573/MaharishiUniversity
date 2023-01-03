package maharishi;
public class IsIsolated {
	public static void main(String[] args) {
		long n = 163;
		int result = isIsolated(n);
		System.out.println(result);
	}
	static int isIsolated(long n) {
		long sq=n*n,cu=n*n*n;
		while(cu!=0) {
			int rem=(int)cu%10;
			long square=sq;
			while(square!=0) {
				int sqRem = (int)sq%10;
				if(rem==sqRem) return 0;
				square/=10;
			}
			cu/=10;
		}
		return 1;
	}

}
