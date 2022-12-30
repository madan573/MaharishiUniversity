public class squarepair {

	public static void main(String[] args) {
		int [] a = {11,5,4,20};
		int b = countSquarePairs(a);
		System.out.println(b);		
		
	}
	public static int countSquarePairs(int[] a) {
		int count=0;
		if(a.length<=1) return 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=0) continue;
			for(int j=0;j<a.length;j++) {
				if(a[j]<=0) continue;
				if((a[i]<a[j])&& isPerfectSquare(a[i]+a[j])==1) {
					count++;
				}
			}
		}
		return count;
	}
	public static int isPerfectSquare(int x) {
		if(x<=0) return 0;
		if(x==1) return 1;
		for(int i=2;i<=x/2;i++) {
			if(x==i*i) return 1;
		}
		return 0;
	}
}