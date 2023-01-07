package maharishi;
public class GetExponent {
	public static void main(String[] args) {
		int res = getExponent(162,3);
		System.out.println(res);
	}
	static int getExponent(int n, int p) {
		int count=0, expo=1;
		if(p<=1) return -1;
		if(n<0)	n = n*-1;
		while(true) {
			expo = expo * p;
			if(n%expo==0) count++;
			else break;
		}
		return count;
	}

}
