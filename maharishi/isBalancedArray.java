package maharishi;

public class isBalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,3,-3,-3,3};
		System.out.print(isBalanced(a));
	}
	static int isBalanced(int[] a) {
		int bal=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					continue;
				}
				if(a[i]==(a[j]*-1)) {
					bal=1;
					break;
				}else {
					bal=0;
				}
			}
			if(bal==0) {
				return 0;
			}
		}
		return 1;
	}
}
