package maharishi;
public class Mercurial {
	public static void main(String[] args) {
		int[] a= {1,1,3,3,4,5,1};
		int res = isMercurial(a);
		System.out.print(res);
	}
	static int isMercurial(int[] a) {
		boolean afterThree=false, startOne=false, endOne=false, three=false;
		if(a.length==0) return 1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				if(!afterThree) startOne=true;
				else endOne=true;
				continue;
			}
			if(a[i]==3) {
				three=true;
				afterThree=true;
			}
		}
		if(startOne && endOne && three)	return 0;
		else return 1;
	}
}
