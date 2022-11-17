package maharishi;

public class SmallestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = smallest(6);
		System.out.println(res);
	}
	static int smallest(int n) {
		int ret=0, checkBit=0;
		for(int i=2;i<=Integer.MAX_VALUE;i++) {
			for(int j=1;j<=n;j++) {
				int num = j*i;
				while(num>0) {
					int digit = num%10;
					if(digit==2) {
						checkBit=1;
						break;
					}else {
						checkBit=0;
					}
					num/=10;
				}
				if(checkBit==0) {
					break;
				}
			}
			if(checkBit==1) {
				ret = i;
				break;
			}
		}
		return ret;
	}

}
