package maharishi;

public class OnionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,6};
		int res = isOnionArray(a);
		System.out.print(res);
	}
	static int isOnionArray(int[] a) {
		int ret=1;
		
		for(int j=0,k=a.length-1;j<a.length/2;j++,k--) {
			if(a[j]+a[k]>10) {
				ret=0;
				break;
			}
		}
		return ret;
	}
}
