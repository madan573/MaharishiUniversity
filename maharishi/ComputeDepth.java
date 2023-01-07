package maharishi;
public class ComputeDepth {
	public static void main(String[] args) {
		int depth = computeDepth(22);
		System.out.println(depth);
	}
	
	static int computeDepth(int n) {
		int[] a=new int[10];
		for(int i=0;i<10;i++) a[i]=-1;
		int depth=1;
		while(true) {
			int num = n*depth;
			while(num>0) {
				int rem=num%10;
				num/=10;
				if(a[rem]==-1) a[rem]=rem;
			}
			int flag=1;
			for(int i=0;i<10;i++) {
				if(a[i]==-1) {
					flag=0;
					break;
				}
			}
			if(flag==1) break;
			depth++;
		}
		return depth;
	}
}
