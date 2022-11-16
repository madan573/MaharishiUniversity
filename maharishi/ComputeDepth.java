package maharishi;

public class ComputeDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depth = computeDepth(42);
		System.out.println(depth);
	}
	static int computeDepth(int n) {
		int depth = 0, digit,checkDigit=0;
		int [] a = new int[10];
		int i =0;
		for(int z=0;z<a.length;z++) {
			a[z]=-1;
		}
		while(true) {
			depth++;
			int num = n*depth;
			while(num!=0) {
				digit = num%10;
				for(int j=0;j<a.length;j++) {
					if(a[j]==digit) {
						checkDigit=1;
						break;
					}else {
						checkDigit=0;
					}
				}
				if(checkDigit==0) {
					a[i]=digit;
					i++;
					if(i==10) {
						return depth;
					}
				}
				num=num/10;
			}		
		}
	}
}
