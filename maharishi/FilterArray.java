package maharishi;


public class FilterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,-9};
		int [] res = filterArray(a,4);
		for(int i:res) {
			System.out.println(i);
		}
	}
	static int [] filterArray(int[] a , int n) {
		int size=0,i=0,m=n;
		int[] newArray = new int[a.length];
		
		while(n>0) {
			if(n%2!=0) {
				size++;
			}
			if(a.length-1<i) {
				return null;
			}
			newArray[i]=n%2;
			i++;
			n/=2;
		}
		
		int[] r = new int[size];
		int z=0;
		if(m<=0) {
			return r;
		}
		for(int j=0;j<a.length;j++) {
			if(newArray[j]==1) {
				r[z]=a[j];
				z++;
			}
		}
		return r;
	}

}
