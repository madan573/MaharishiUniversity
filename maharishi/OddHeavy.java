package maharishi;

public class OddHeavy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {0,2,4,8,9};
		System.out.print(isOddHeavy(a));
	}
	static int isOddHeavy(int[] a) {
		int count=0, oddMin=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				count++;
				oddMin=a[i];
			}
		}
		for(int i =0;i<a.length;i++) {
			if(a[i]%2==1) {
			if(oddMin>a[i]) {
				oddMin=a[i];
			}
			}
		}
		if(count==0) return 0;
		for(int k=0;k<a.length;k++) {
			if(a[k]%2==0) {
					if(oddMin<a[k]) {
						return 0;
					}
				}
		}
		return 1;
}
}
