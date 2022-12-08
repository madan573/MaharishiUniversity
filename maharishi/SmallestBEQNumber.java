package maharishi;

public class SmallestBEQNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(findSmallestBEQnumber());
	}
	static int findSmallestBEQnumber() {
		for(int i=2;i<Integer.MAX_VALUE;i++) {
			int cube=i*i*i;
			int countSix=0;
			while(cube>0) {
				if(cube%10==6) {
					countSix++;
				}
				cube/=10;
			}
			if(countSix==4) {
				return i;
			}
		}
		return 0;
	}
}
