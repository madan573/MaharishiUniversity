package maharishi;

public class DualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,1,3,3,2};
		System.out.print(isDual(a));
	}
	static int isDual(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) count++;
			}
			if(count!=2) return 0;
			count=0;
		}
		return 1;
	}
}
