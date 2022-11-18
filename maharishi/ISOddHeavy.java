package maharishi;

public class ISOddHeavy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {11,4,6,9,2};
		int res = isOddHeavy(a);
		System.out.println(res);
	}
	static int isOddHeavy(int[] a) {
		int ret=0,count=0,minOdd=Integer.MAX_VALUE,maxEven=-Integer.MAX_VALUE;
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				count++;
				if(minOdd>a[i]) {
					minOdd=a[i];
				}
			}else {
				if(maxEven<a[i]) {
					maxEven=a[i];
				}
			}
		}
		if(count>0 && minOdd>maxEven) {
			ret =1;
		}
		return ret;
	}

}
