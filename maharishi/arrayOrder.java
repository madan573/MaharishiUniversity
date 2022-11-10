package maharishi;

public class arrayOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,3,1};
		int num = 3231;
		int res = repsEqual(arr,num);
		if(res==1) {
			System.out.println("Array and digit are in same oder");
		}else{
			System.out.println("Not in same oder");
		}
	}
	@SuppressWarnings("unused")
	public static int repsEqual(int a[], int n) {
		int c=0,ret=0,m=n;
		while(n!=0) {
			n = n/10;
			c++;
		}
		int[] arr=new int[c];
		int i=0;
		while(m!=0) {
			arr[i]= m%10;
			m=m/10;
			i++;
		}
		
		
		if(c==a.length) {
			c--;
			for(int j=0;j<a.length;j++) {
				if(a[j]==arr[c]) {
					ret =1;
					c--;
				}else {
					ret=0;
					return ret;
				}
			}
		}
		return ret;
	}

}
