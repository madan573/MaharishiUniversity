package maharishi;

public class AllValuesSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,-1,-1};
		int ret=allValuesTheSame(a);
		System.out.print(ret);
	}
	static int allValuesTheSame(int[] a) {
		if(a.length==0) {
			return 0;
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				return 0;
			}
		}
		return 1;
	}
}
