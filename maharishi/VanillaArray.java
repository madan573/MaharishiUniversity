package maharishi;

public class VanillaArray {
	public static void main(String[] args) {
		int[] arr = {2,22,222,2222};
		int result = isVanilla(arr);
		System.out.println(result);
	}
	static int isVanilla(int[] a) {
		int d = a[0]%10;
		for(int i=0;i<a.length;i++) {
			int b=a[i];
			while(b>0) {
				if(d!=b%10) return 0;
				b/=10;
			}
		}
		return 1;
	}
}
