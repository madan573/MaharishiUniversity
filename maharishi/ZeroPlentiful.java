package maharishi;

public class ZeroPlentiful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,0,0,0,0,0,0,0,0,1,0,0,0};
		int res = isZeroPlentiful(a);
		System.out.println(res);
	}
	static int isZeroPlentiful(int[] a) {
		int count = 0,zero=1;
		if(a.length<4) {
			return count;
		}
		for(int i=0; i<a.length-1;i++) {
			if(a[i]==0 && a[i+1]==0) {
				zero++;
			}else {
				zero =1;
			}
			if(zero==4) {
				count++;
			}
		}
		return count; 
	}

}
