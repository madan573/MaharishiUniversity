package maharishi;

public class Dual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,0};
		System.out.print(isDual(a));
	}
	static int isDual(int[] a) {
		if(a.length==0) return 1;
		if(a.length%2==1) return 0;
		int sum=a[0]+a[1];
		for(int i=0; i<a.length;i=i+2) {
			if((a[i]+a[i+1])!=sum) {
				return 0;
			}
		}
		return 1;
	}
}
