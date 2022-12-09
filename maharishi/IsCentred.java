package maharishi;

public class IsCentred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,2,1,4,5};
		System.out.print(isCentred(a));
	}
	static int isCentred(int[] a) {
		if(a.length==0 || a.length%2==0) return 0;
		int mid=a.length/2;
		for(int i=0;i<a.length;i++) {
			if(mid==i) {
				continue;
			}
			if(a[i]<mid) return 0;
		}
		return 1;
	}
}
