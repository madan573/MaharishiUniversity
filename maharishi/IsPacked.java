package maharishi;

public class IsPacked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,3,3,5,5,5,5,5,2,2};
		int res = isPacked(a);
		System.out.println(res);
	}
	static int isPacked(int[] a) {
		int r =0,count;
		if(a.length==0) {
			r= 1;
		}
		for(int i=0;i<a.length;i=i+a[i]) {
			count =1;
			if(a[i]<1) {
				r=0;
				break;
			}
		
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					count++;
				}else {
					r=0;
					break;
				}
			}
			if(count==a[i]) {
				r=1;
			}else {
				r=0;
				break;
			}
		}
			
		return r;
	}

}
