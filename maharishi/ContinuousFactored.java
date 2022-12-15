package maharishi;

public class ContinuousFactored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isContinuousFactored(110));
	}
	static int isContinuousFactored(int n) {
		if(n<=1) return 0;
		int p=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				p=p*i;
			}else {
				p=1;
			}
			if(p==n) return 1;
		}
		return 0;
	}
}
