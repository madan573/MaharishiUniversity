package maharishi;

public class DecodeArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,0,1,0,0,0,1,1,0,0,1};
		int res = decodeArray(a);
		System.out.println(res);
	}
	static int decodeArray(int[] a) {
		int num=0,count=0;
		if(a[a.length-1]!=1) {
			return num;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count++;
			}else {
				num = num*10+count;
				count=0;
			}
		}
		if(a[0]==-1) {
			num = num *-1;
		}
		return num;
	}
}
