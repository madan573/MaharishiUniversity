package maharishi;

public class centerFifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,10,5,15,1};
		int ret = isCentered15(arr);
		if(ret==1) {
			System.out.println("centered 15 array");
		}else {
			System.out.println("Not centered 15 array");
		}
	}
	public static int isCentered15(int[] a) {
		int r=0,sum=0,clast=0,cstart=a.length/2-1;
		if((a.length==3 && a[a.length/2]==15) || (a.length==2 && a[0]+a[1]==15)|| a.length==1 && a[0]==15) {
			r=1;
			return r;
		}
		if(a.length==0) {
			return r;
		}
		for(int i=a.length/2-1;i<a.length;i++) {
			if(sum!=15) {
				sum=sum+a[i];	
			}else {
				clast++;
				if(cstart==clast) {
					r=1;
				}
			}
		}
		return r;
	}

}
