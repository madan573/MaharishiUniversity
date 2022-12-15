package maharishi;

public class NiceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,6,3};
		System.out.print(isNice(a));
	}
	static int isNice(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]-1 || a[i]==a[j]+1) return 1;
			}
		}
		return 0;
	}
}
