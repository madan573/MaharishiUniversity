package maharishi;
public class SmallestProgram {
	public static void main(String[] args) {
		int res = smallest(8);
		System.out.println(res);
	}
	static int smallest(int n) {
		int count=0;
		boolean flag=false;
		for(int i=2;i<=Integer.MAX_VALUE;i++) {
			for(int j=1;j<=n;j++) {
				int num = j*i;
				while(num>0) {
					if(num%10==2) {
						flag=true;
						break;
					}
					flag=false;
					num/=10;
				}
				if(!flag) break;
			}
			if(flag) {
				count = i;
				break;
			}
		}
		return count;
	}
}
