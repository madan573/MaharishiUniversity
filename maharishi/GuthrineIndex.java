package maharishi;

public class GuthrineIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int res = guthrineIndex(n);
		System.out.println(res);
	}
	public static int guthrineIndex(int n) {
		int r=0;
		if(n<=1) {
			return 0;
		}
		int i=n;
		while(i!=1) {
			if(i%2==0) {
				i=i/2;
				r++;
			}else {
				i=i*3+1;
				r++;
			}
		}
		return r;
	}

}
