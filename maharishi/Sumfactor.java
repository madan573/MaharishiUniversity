package maharishi;

public class Sumfactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-3,1,-1,1};
		int res = sumFactor(arr);
		System.out.println(res);
	}
	public static int sumFactor(int[] a) {
		int c=0,sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		for(int i=0;i<a.length;i++) {
			if(sum==a[i]) {
				c++;
			}
		}
		return c;
	}

}
