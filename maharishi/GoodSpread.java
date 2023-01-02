package maharishi;
public class GoodSpread {
	public static void main(String[] args) {
		int[] a= {2, 1, 2, 5, 2, 2, 1, 5, 9};
		System.out.print(isGoodSpread(a));
	}
	static int isGoodSpread(int[] a) {
		int count=1;
		for(int i=0;i<a.length;i++) {
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) count++;
			}
			if(count>3) return 0;
		}
		return 1;
	}
}
