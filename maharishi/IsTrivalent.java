package maharishi;

import java.util.*;

public class IsTrivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-1,0,1,0,1,-1};
		int result = isTrivalent(a);
		System.out.println(result);
	}
	static int isTrivalent(int[] b) {
		int ret=0;
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<b.length;i++) {
			if(!l.contains(b[i])) {
				l.add(b[i]);
			}
		}
		if(l.size()==3) {
			ret =1;
		}
		return ret;
	}

}
