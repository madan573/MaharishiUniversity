package maharishi;

public class MinDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(minDistance(8));
	}
	static int minDistance(int n) {
		int diff=n, f=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				if(diff>(i-f)) {
					diff=i-f;
					f=i;
				}
			}
		}
		return diff;
	}
}
