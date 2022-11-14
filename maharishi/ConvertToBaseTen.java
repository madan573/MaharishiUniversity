package maharishi;

public class ConvertToBaseTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,0,0,2};
		int result = convertToBase10(a,5);
		System.out.println(result);
	}
	public static int convertToBase10(int[]a, int b) {
		int ret=-1, l,num=0;
		l=isLegalNumber(a,b);
		if(l==1) {
			int j=a.length-1;
			for(int i=0;i<a.length;i++) {
				num = (int) (num + a[i]* Math.pow(b,j));
				j--;
			}
			ret =num;
		}
		
		return ret;
	}
	public static int isLegalNumber(int[]a, int base) {
		int r=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=base) {
				r=0;
				break;
			}
		}
		return r;
	}
}
