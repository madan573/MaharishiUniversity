package maharishi;

public class IsCubePowerful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res =isCubePowerful(407);
		System.out.println(res);
	}
	static int isCubePowerful(int n) {
		int ret =0,sum=0,m=n;
		while(n>0) {
			int d = n%10;
			sum +=d*d*d;
			n/=10;
		}
		if(sum==m) ret =1;
		return ret;
	}
}
