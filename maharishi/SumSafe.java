package maharishi;

public class SumSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {6,-2,3};
		int result=isSumSafe(a);
		System.out.println(result);
	}
	static int isSumSafe(int[] a) {
		int ret=1,sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		for(int j=0;j<a.length;j++) {
			if(sum==a[j]) {
				ret =0;
				break;
			}
		}
		return ret;
	}

}
