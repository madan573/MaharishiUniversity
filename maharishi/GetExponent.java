package maharishi;

public class GetExponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = getExponent(2,2);
		System.out.println(res);
	}
	static int getExponent(int n, int p) {
		int count=0, expo=1;
		if(p<=1) {
			return -1;
		}
		if(n<0){
			n = n*-1;
		}
		for(int i=1;i<n;i++) {
			expo = expo * p;
			if(n%expo==0) {
				count =i;
			}
			if(expo>n) {
				break;
			}
		}
		return count;
	}

}
