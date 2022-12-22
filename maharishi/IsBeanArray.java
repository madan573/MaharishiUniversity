package maharishi;

public class IsBeanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2, 10, 9, 3};
		System.out.print(isBean(a));
	}
	static int isBean(int[] a) {
		int num=0;
		for(int i=0;i<a.length-1;i++) {
			num=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]+1 || a[i]==a[j]-1) {
					num=1;
					break;
				}
			}
			if(num==0) return 0;
		}
		return 1;
	}
}
