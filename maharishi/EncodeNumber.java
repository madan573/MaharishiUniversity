package maharishi;

import java.util.ArrayList;
import java.util.List;

public class EncodeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] res = encodeNumber(12);
		for(int i:res) {
			System.out.println(i);
		}
	}
	static int[] encodeNumber(int n) {
		List<Integer> list = new ArrayList<>();
		
		int m, mul=1,r=0;
		for(int i=2;i<=n;i++) {
			m=n;
			if(isprime(i)) {
				while(m%i==0) {
					list.add(i);
					mul=mul*i;
					m/=i;
				}
			}
			if(mul==n) {
				r=1;
				break;
			}
		}
		int[] a = new int[list.size()];
		if(n<=1) {
			return a;
		}
		if(r==1) {
			for(int j=0;j<list.size();j++) {
				a[j] = list.get(j);
			}
		}
		return a;
	}
	static boolean isprime(int x) {
		if(x==2 || x==3) {
			return true;
		}
		boolean r=true;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				r=false;
				break;
			}
		}
		return r;
	}
}
