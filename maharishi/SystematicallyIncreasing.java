package maharishi;

public class SystematicallyIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2,1,2,3,1,2,3,4,1,2,3,4,5};
		int res = isSystematicallyIncreasing(a);
		System.out.print(res);
	}
	static int isSystematicallyIncreasing(int[] a) {
		int ret=1;
		int last = a[a.length-1];
		int sum = last*(last+1)/2;
		if(sum!=a.length || a[0]!=1) {
			ret=0;
			return ret;
		}
		int z=0;
		for(int j=1;j<=last;j++) {
			for(int i=1;i<=j;i++) {
				if(a[z]!=i) {
					ret=0;
					break;
				}	
				z++;
			}	
		}
		return ret;
	}
}
