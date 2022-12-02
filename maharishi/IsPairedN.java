package maharishi;

public class IsPairedN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,1,4,5,6};
		int res = isPairedN(a,5);
		System.out.print(res);
	}
	static int isPairedN(int[] a, int n) {
		
		int len =a.length;
		if(len<1) {
			return 0;
		}
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
			if(a[i]+a[j]==i+j && (i+j) == n) {
				return 1;
			}
		}
		}
		return 0;
	}
}
