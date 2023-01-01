package maharishi;

public class IsAllPossibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,0,3,2};
		System.out.print(isAllPossibilities(a));
	}
	
	static int isAllPossibilities(int [] a) {
		if(a.length<=0) {
			return 0;
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<0 || a[i]>=a.length) return 0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					return 0;
				}
			}
		}
	return 1;
	}
}
