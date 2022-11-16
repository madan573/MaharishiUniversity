package maharishi;

public class SimplePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,-3,-6,9,-2,5};
		int[] p = {3,-2,3};
		int result = matches(a,p);
		System.out.println(result);
	}
	static int matches(int[]a,int[]p) {
		int ret=1,count=0, j=0, sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				count ++;
				
				if(i==a.length-1 || a[i+1]<0) {
					
					sum = sum + p[j];
					if(sum !=count) {
						ret = 0;
						break;
					}
					j++;
				}
			}else if( a[i]<0) {
				count --;
				if(i==a.length-1 || a[i+1]>0) {
					sum = sum + p[j];
					if(sum!=count) {
						ret = 0;
						break;
					}
					j++;
				}
			}else {
				ret = 0;
				break;
			}
		}
		return ret;
	}

}
