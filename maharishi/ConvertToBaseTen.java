package maharishi;
public class ConvertToBaseTen {
public static void main(String[] args) {
		int[] a = {1,2,0,0,2};
		int result = convertToBase10(a,5);
		System.out.println(result);
	}
	public static int convertToBase10(int[]a, int b) {
		if(isLegalNumber(a,b)!=1) return -1;
		int num=0,len=a.length-1;
		for(int i=0;i<a.length;i++) {
			num=(int)num+a[i]*Power(b,len);
			len--;
		}
		return num;
	}
	static int Power(int a,int b) {
		if(b==0) return 1;
		return (a*Power(a,b-1));
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
