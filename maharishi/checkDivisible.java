package maharishi;

public class checkDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,6,6,36};
		int res = isDivisible(a,3);
		System.out.println(res);
	}
	public static int isDivisible(int [] a, int d) {
		int r =1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%d!=0){
				r=0;
				break;
			}
		}
		return r;
	}
}
