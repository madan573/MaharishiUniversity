package maharishi;
public class OnionArray {
	public static void main(String[] args) {
		int[] a= {1,2,15,3,4};
		int res = isOnionArray(a);
		System.out.print(res);
	}
	static int isOnionArray(int[] a) {
		int ret=1;
		for(int j=0,k=a.length-1;j<k;j++,k--) {
			if(a[j]+a[k]>10) return 0;
		}
		return ret;
	}
}
