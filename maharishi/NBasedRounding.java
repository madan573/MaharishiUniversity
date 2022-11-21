package maharishi;

public class NBasedRounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		doIntegerBasedRounding(a, 3);
	}
	static void doIntegerBasedRounding(int[] a, int n) {
		if(n<=0) {
			for(int i:a) {
				System.out.println(i);
			}
		}else {
			if(a.length<=1) {
				System.out.println("The size of array must be atleast 2");
				return ;
			}
			for(int i=0;i<a.length;i++) {
				if(a[i]<=0) {
					System.out.println(a[i]);
				}else {
						int lower = (a[i]/n)*(n);
						int higher = lower+n;
						if(higher-a[i]<=a[i]-lower) {
							System.out.println(higher);
							}else {
							System.out.println(lower);
						} 
					}
			}
		}
	}

}
