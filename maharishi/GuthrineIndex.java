package maharishi;

public class GuthrineIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int res = guthrineIndex(n);
		System.out.println(res);
	}
	public static int guthrineIndex(int i) {
		int r=0;
		if(i<1) return 0;
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
