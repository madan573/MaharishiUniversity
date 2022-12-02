package maharishi;

public class Mercurial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,3,3,4,5,1};
		int res = isMercurial(a);
		System.out.print(res);
	}
	static int isMercurial(int[] a) {
		int start1=0, end1=0;
		boolean afterThree=false;
		int three=0;
		if(a.length==0) {
			return 1;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				if(!afterThree) {
					start1++;
				}else {
					end1++;
				}
			}else if(a[i]==3) {
				three++;
				afterThree=true;
			}else {
				continue;
			}
		}
		if(start1>0 && end1>0) {
			return 0;
		}
		if(start1==0 && end1==0 && three>0 || start1>0 || end1>0) {
			return 1;
		}
		return 0;
	}
}
