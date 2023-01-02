package maharishi;
public class DapheArrayNext {
	public static void main(String[] args) {
		int[] a = {4,8,6,3,2,9,8,13,12,12,6};
		System.out.print(isDaphe(a));
	}
	static int isDaphe(int[] a) {
		int last=a.length-1, even=0,odd=0;
		if(a[0]%2!=0) return 0;
		for(int i=0,j=last;i<=j;i++,j--) {
			if(a[i]%2==0) {
				if(a[j]%2!=0) return 0;
				even=1;
			}
			if(a[i]%2!=0 && odd==0) {
				if(a[j]%2==0) return 0;
				odd=1;
			}
		}
		if(even==1&&odd==1) return 1;
		return 0;
	}
}
