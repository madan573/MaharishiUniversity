package maharishi;

public class NoZeroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= new int[]{2,4,5,1};
		int res = arrayHasNoZeros(a);
		System.out.println(res);
	}
	static int arrayHasNoZeros(int[] a) {
		int r=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				r=0;
				break;
			}
		}
		return r;
	}

}
