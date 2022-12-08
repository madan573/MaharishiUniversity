package maharishi;

public class IsConsecutiveFactored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isConsecutiveFactored(90));
	}
	static int isConsecutiveFactored(int n) {
		if(n<=1) {
			return 0;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				if(n%(i+1)==0) {
					return 1;
				}
			}
		}
		return 0;
	}
}
