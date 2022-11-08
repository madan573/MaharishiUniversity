package maharishi;

public class stantonMeasur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,1,1,3,3,2,3,3,3};
		int res = stantonMeasure(a);
		System.out.println(res);
	}
	public static int stantonMeasure(int[] a) {
		int count=0,c=0;
		if(a.length==0) {
			return 0;
		}
		if(a[0]==0 && a.length==1) {
			return 1;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				c++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==c) {
				count++;
			}
		}
		
		return count;
	}
}
