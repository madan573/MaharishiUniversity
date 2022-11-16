package maharishi;

public class VanillaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,22,322,2222};
		int result = isVanilla(arr);
		System.out.println(result);
	}
	static int isVanilla(int[] a) {
		int ret=1;
		if(a.length==0) {
			return ret;
		}
		for(int i=0;i<a.length;i++) {
			int b=a[i];
			int d = a[i]%10;
			while(b>0) {
				int digit = b%10;
				if(d!=digit) {
					ret=0;
					break;
				}
				b/=10;
			}
		}
		return ret;
	}

}
