package maharishi;

public class ZeroLimitedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1, 0, 5, -1, 0, 2, 3, 0, 8};
		System.out.println(isZeroLimited(a));
	}
	static int isZeroLimited(int[] a) {
		int n=0;
		for(int i=0;i<a.length;i++) {
			if(i==3*n+1) {
				if(a[3*n+1]!=0) {
					return 0;
				}	
				n++;
			}else {
				if(a[i]==0) {
					return 0;
				}
			}
		}
		return 1;
	}
}
