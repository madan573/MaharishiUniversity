package maharishi;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		System.out.print(isWave(a));
	}
	static int isWave(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]%2==0) {
				if(a[i+1]%2!=1) return 0;
			}else {
				if(a[i+1]%2!=0) return 0;
			}
		}
		return 1;
	}
}
