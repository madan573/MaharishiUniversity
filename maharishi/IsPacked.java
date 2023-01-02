package maharishi;

public class IsPacked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,3,3,5,5,5,5,5,2,2};
		int res = isPacked(a);
		System.out.println(res);
	}
	static int isPacked(int[] a) {
		if(a.length==0) return 1;
		for(int i=0;i<a.length;i=i+a[i]) {
			int count =1;
			if(a[i]<1) return 0;		
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) 	count++;
				else break;
				}
			if(count!=a[i]) return 0;
		}
		return 1;
	}

}
