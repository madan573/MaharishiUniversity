package maharishi;

public class IsMeera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-4, 0, 1, 0, 2, 1};
		System.out.print(isMeera(a));
	}
	static int isMeera(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>i) return 0;
			sum+=a[i];
		}
		if(sum!=0) return 0;
		return 1;
	}
}
