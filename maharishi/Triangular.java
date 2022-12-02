package maharishi;

public class Triangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isTraingular(21));
	}
	static int isTraingular(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			if(sum==n) {
				return 1;
			}
			if(sum>n) {
				return 0;
			}
		}
		return 0;
	}
}
