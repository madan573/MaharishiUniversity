package maharishi;

public class IsLegalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,0,0,2};
		int result = isLegalNumber(a,2);
		System.out.println(result);
	}
	public static int isLegalNumber(int[]a, int base) {
		int r=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=base) {
				r=0;
				break;
			}
		}
		return r;
	}

}
