package maharishi;

public class IsDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isDigitSum(32321,13));
	}
	static int isDigitSum(int n, int m) {
		int sum=0;
		if(n<0 || m<0)
			return -1;
		while(n>0) {
			sum=sum+n%10;
			n/=10;
		}
		if(sum<m)
			return 1;
		else
			return 0;
	}
}
