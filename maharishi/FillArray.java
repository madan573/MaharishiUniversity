package maharishi;

public class FillArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,5,9,-12,6,2,1};
		int[] b = fill(a,4,10);
		for(int i:b)
			System.out.println(i);
	}
	static int[] fill(int[] a, int k, int n) {
		int[] b = new int[n];
		int i=0;
		while(i<n) {
			for(int j=0;j<k && i<n;j++) {
				b[i]=a[j];
				i++;
			}
		}
		return b;
	}
}
