package maharishi;

public class LargestDifferenceOfEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,-2,3,4,10};
		int res = largestDifferenceOfEvens(a);
		System.out.print(res);
	}
	static int largestDifferenceOfEvens(int[] a) {
		int small=a[0], large=a[0],count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
				if(a[i]<small || small%2==1) {
					small=a[i];
				}
				if(a[i]>large || large%2==1) {
					large=a[i];
				}
			}
		}
		if(count>=2) {
			return (large-small);
		}
		return -1;
	}
}
