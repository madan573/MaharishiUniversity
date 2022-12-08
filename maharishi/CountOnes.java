package maharishi;

public class CountOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countOnes(15));
	}
	static int countOnes(int n) {
		int count=0;
		while(n>0) {
			if(n%2==1) {
				count++;
			}
			n/=2;
		}
		return count;
	}
}
