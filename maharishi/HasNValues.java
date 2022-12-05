package maharishi;

public class HasNValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int res= hasNValues(a,10);
		System.out.print(res);
	}
	static int hasNValues(int[] a, int n) {
		if(n<=0) {
			return 0;
		}
		int[] b = new int[n];
		int changeBit;
		int z=0;
		for(int i=0;i<a.length;i++) {
			changeBit=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					changeBit=1;
					break;
				}
			}
			if(changeBit==0) {
				if(z<n) {
				b[z]=a[i];
				z++;
				}else {
					return 0;
				}
			}
		}
		if(z==n) {
			return 1;
		}else {
			return 0;
		}
	}
}
