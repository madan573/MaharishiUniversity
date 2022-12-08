package maharishi;

public class ZeroBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-3,1,3,-1};
		System.out.print(isZeroBalanced(a));
	}
	static int isZeroBalanced(int[] a) {
		int sum=0, count=0;
		if(a.length==0) return 0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(a[i]>0) {
				count++;
			}else if(a[i]<0) {
				count--;
			}else {
				continue;
			}
		}
		if(sum==0&&count==0) {
			return 1;
		}else {
			return 0;
		}
	}
}
