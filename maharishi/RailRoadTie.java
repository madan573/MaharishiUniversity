package maharishi;

public class RailRoadTie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,0,1,2};
		int res = isRailRoadTie(a);
		System.out.println(res);
	}
	static int isRailRoadTie(int[] a) {
		if(a.length<2) return 0;
		if(a[0]==0 ||a[a.length-1]==0 ) return 0;
		int count=1;
		for(int i=0;i<a.length;i++) {
			if(count==3) {
				if(a[i]!=0) return 0;
				count=1;
				continue;
			}
			if(a[i]==0) return 0;
			count++;
		}
		if(count!=3) return 0;
		return 1;
	}
	/*
	static int isRailRoadTie(int[] a) {
		int  result=1;
		if(a.length==0 || a[0]==0 || a[a.length-1]==0) {
			result=0;
		}
		
		for(int i=1;i<a.length-1;i++) {
			
			if(a[i]!=0 && a[i-1]!=0 ) {
				if(a[i+1]==0) {
					result=1;
				}else {
					result=0;
				}
			}
			if(a[i]!=0 && a[i+1]!=0) {
				if(a[i-1]==0) {
					result=1;
				}else {
					result=0;
				}
			}
			if(a[i]==0 && a[i-1]!=0 && a[i+1]!=0) {
				result =1;
			}
		}
		
		return result;
	}
*/
}
