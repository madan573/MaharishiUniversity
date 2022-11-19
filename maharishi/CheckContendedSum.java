package maharishi;

public class CheckContendedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = checkConcatenetedSum(2997,3);
		System.out.println(res);
	}
	static int checkConcatenetedSum(int n, int catlen) {
		int r=0,sum=0,m=n;
		while(n>0) {
			int d = n%10;
			for(int i=1;i<catlen;i++) {
				d = d*10+n%10;
			}
			sum = sum+d;
			n/=10;
		}
		if(m==sum) {
			r=1;
		}
		return r;
	}
}
