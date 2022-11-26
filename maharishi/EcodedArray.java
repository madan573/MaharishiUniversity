package maharishi;
public class EcodedArray {

	public static void main(String[] args) {
		int[] a=encodeArray(999);
		for(int i:a) {
			System.out.print(i);
		}
	}
	static int[] encodeArray(int n) {
		
		int c=0,p=n,num=0,rev=0,digit=0;
		if(n<0) {
			n=n*-1;
		}
		while(n>0) {
			c++;
			num = num+n%10;
			rev=rev*10+n%10;
			n=n/10;
		}
		if(p<0) {
			num = c+num+1;
		}else {
			num = c+num;	
		}
		int[] a = new int[num];
		int i=0;
		if(p<0) {
			a[0]=-1;
			i++;
		}
		while(rev>0) {
			digit=rev%10;
			for(int j=0;j<=digit;j++) {
				if(j==digit) {
					a[i]=1;
				}else {
				a[i]=0;
				}
				i++;
			}
			rev/=10;
		}
		
		return a;
	}
}
