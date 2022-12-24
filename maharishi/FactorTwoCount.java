package maharishi;

public class FactorTwoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(factorTwoCount(12));
	}
	static int factorTwoCount(int n) {
		int count=0;
		while(n>0){
			if(n%2==0) {
				count++;
			}else {
				break;
			}
			n/=2;
		}
		return count;
	}
}
