package maharishi;

public class SequencedArrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,3,4,4,4};
		int res =isSequencedArray(a,2,4);
		System.out.println(res);
	}
	static int isSequencedArray(int[] a, int m, int n) {
		int r=0;
		if(m>n || a[0]!=m || a[a.length-1]!=n) {
			return r;
		}
		for(int i=1;i<a.length-1;i++) {
			if(a[i]==a[i+1] || a[i]+1==a[i+1]) {
				r=1;
			}else {
				r=0;
				break;
			}
		}
		return r;
	}
}
