package maharishi;

public class SequentiallyBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,6,99,99,99};
		int res = isSequentiallyBounded(a);
		System.out.println(res);
	}
	static int isSequentiallyBounded(int[] a) {
		int ret=1,count=0;
		if(a.length==0) {
			ret=1;
		}
		for(int i=0;i<a.length-1;i++) {
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					ret=0;
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(a[i]<=count) {
				ret=0;
				break;
			}
		}
		return ret;
	}

}
