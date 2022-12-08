package maharishi;

public class IsOddValentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,3};
		System.out.print(isOddValent(a));
	}
	static int isOddValent(int[] a) {
		int oddCount=0;
		int repeat=1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					repeat++;
				}
			}
			if(a[i]%2==1) oddCount++;
			if(oddCount>=1 && repeat>=2) {
				return 1;
			}
		}
		return 0;
	}
}
