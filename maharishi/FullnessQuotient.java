package maharishi;

public class FullnessQuotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = fullnessQuotient(94);
		System.out.println(res);
	}
	static int fullnessQuotient(int n) {
		int count=0,check=0;
		if(n<1) {
			return -1;
		}
		int m = 0;
		for(int i=2;i<=9;i++) {
			m=n;
			while(m>0) {
				if(m%i==0) {
					check =0;
					break;
				}else {
					check=1;
					
				}
				m/=i;
			}
			if(check==1) {
				count++;
			}
		}
		return count;
	}

}
