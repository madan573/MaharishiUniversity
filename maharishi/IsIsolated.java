package maharishi;

import java.util.ArrayList;
import java.util.List;

public class IsIsolated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 163;
		int result = isIsolated(n);
		System.out.println(result);
	}
	static int isIsolated(long n) {
		int ret = 1;
		long sq=n*n,cu=n*n*n;
		List<Integer> list = new ArrayList<>();
		if(n>2097151) {
			ret=-1;
			return ret ;
		}
		
		while(sq!=0) {
			list.add((int) (sq%10));
			sq = sq/10;
		}
		
		while(cu!=0) {
			 int rem = (int)cu%10;
			if(list.contains(rem)) {
					ret = 0;
					break;
				}
			
			cu = cu/10;
		}
		
		return ret;
	}

}
