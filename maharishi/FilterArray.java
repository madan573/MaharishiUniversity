package maharishi;
public class FilterArray {
	public static void main(String[] args) {
		int[] a = {8, 4, 9,1,2,3,18};
		int [] res = filterArray(a,88); 
		if(res==null) {
			System.out.println("NULL");
		}else {
		for(int i:res) {
			System.out.println(i);
		}
		}
	}
	static int [] filterArray(int[] a , int n) {
		int size=0,count=0,m=n;
		while(n>0) {
			count++;
			if(n%2!=0) size++;
			n/=2;
		}
		if(count>a.length) return null;
		int[] r = new int[size];
		int i=0,z=0;
		while(m>0) {
			if(m%2!=0) {
				r[z]=a[i];
				z++;
			}
			i++;
			m/=2;
		}
		return r;
	}

}
