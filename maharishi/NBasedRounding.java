package maharishi;

public class NBasedRounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		doIntegerBasedRounding(a, 3);
		for(int i:a) System.out.print(i);
	}
	static void doIntegerBasedRounding(int[] a, int n) {
		if(n>0 && a.length>1) {
			for(int i=0;i<a.length;i++) {
				if(a[i]<=0) {
					a[i]=a[i];
				}else {
						int lower = (a[i]/n)*n;
						int higher = lower+n;
						if(higher-a[i]<=a[i]-lower) a[i]=higher;
						else a[i]=lower;
					}
			}
		}
	}

}
