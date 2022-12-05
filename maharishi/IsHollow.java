package maharishi;

public class IsHollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,0,0};
		System.out.println(isHollow(a));
	}
	static int isHollow(int[] a) {
		int ZeroCount=0;
		if(a.length<3) {
			return 0;
		}
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			if(a[i]!=0) {
				if(a[j]!=0) {
					continue;
				}else {
					return 0;
				}
			}
			if(a[i]==0) {
				if(a[j]!=0) {
					return 0;
				}else {
					ZeroCount++;
				}
			}
		}
		if(ZeroCount>=3) {
			return 1;
		}else {
			return 0;
		}
	}
}
