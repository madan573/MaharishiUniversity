package maharishi;

public class IsNormalFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isNormal(16));
	}
	static int isNormal(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				if(i%2==1) {
					return 0;
				}
			}
		}
		return 1;
	}
}
