package maharishi;

public class MeeraArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,5,-2};
		System.out.print(isMeera(a));
	}
	static int isMeera(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]*2==a[j]) {
					return 0;
				}
			}
		}
		return 1;
	}
}
