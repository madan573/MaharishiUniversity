package maharishi;

public class IsLayered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,2,2,5,5};
		System.out.print(isLayered(a));
	}
	static int isLayered(int[] a) {
		if(a.length<=1) {
			return 0;
		}
		int count=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) return 0;
			if(a[i]==a[i+1]) {
				count++;
				continue;
			}
			count=1;
		}
		if(count>=2) return 1;
		return 0;
	}
}
