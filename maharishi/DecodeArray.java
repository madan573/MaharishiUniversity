package maharishi;

public class DecodeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-1,5,8,17,15};
		int res = decodeArray(a);
		System.out.println(res);
	}
	static int decodeArray(int[] a) {
		int ret=0;
		for(int i=0;i<a.length-1;i++) {
			if((a[i]-a[i+1])<0) {
				ret = ret*10 + -1*(a[i]-a[i+1]); //without using libarary function abs.
			}else {
				ret = ret*10 + (a[i]-a[i+1]);
			}
		}
		if(a[0]<0) {
			ret = ret*-1;
		}
		return ret;
	}

}
