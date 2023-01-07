package maharishi;

public class SequentiallyBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,6,6,99,99,99};
		int res = isSequentiallyBounded(a);
		System.out.println(res);
	}
	static int isSequentiallyBounded(int[] a) {
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) return 0;
				if(a[i]==a[j]) count++;
			}
			if(a[i]<=count) return 0;
		}
		return 1;
	}

}
