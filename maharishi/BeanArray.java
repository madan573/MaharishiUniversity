package maharishi;

public class BeanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1, 2, 3,9, 6, 13};
		System.out.print(isBean(a));
	}
	static int isBean(int[] a) {
		int nine=0,thirteen=0,seven=0,sixteen=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==9) nine=1;
			if(a[i]==13) thirteen=1;
			if(a[i]==7) seven=1;
			if(a[i]==16) sixteen=1;
		}
		if(nine==1 && thirteen!=1 || seven==1 && sixteen==1) return 0;
		return 1;
	}
}
