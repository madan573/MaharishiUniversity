package maharishi;

public class DaphneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,-8};
		System.out.print(isDaphne(a));
	}
	static int isDaphne(int[] a) {
		int numBit=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && numBit==0 ||a[i]%2==0 && numBit==1) {
				numBit=1;
			}else if(a[i]%2==1 && numBit==0 || a[i]%2==1 && numBit==2) {
				numBit=2;
			}else {
				return 0;
			}
		}
		return 1;
	}
}
