package maharishi;

public class LoopSumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,5,6};
		int ret  = loopSum(a,4);
		System.out.print(ret);
	}
	static int loopSum(int[] a, int n) {
		int sum=0;
		if(a.length==0 || n<=0) {
			return 0;
		}
		for(int i=1,j=0;i<=n;i++) {
			sum=sum+a[j];
			j++;
			if(a.length==j) {
				j=0;
			}
		}
		return sum;
	}
}
