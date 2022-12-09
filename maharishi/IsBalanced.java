package maharishi;

public class IsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,5,-8};
		System.out.print(isBalanced(a));
	}
	static int isBalanced(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i%2==0 ) {
				if(a[i]%2!=0) return 0;
			}else {
				if(a[i]%2==0) return 0;
			}
		}
		return 1;
	}
}
