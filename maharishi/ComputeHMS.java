package maharishi;

public class ComputeHMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = computeHMS(3650);
		for(int i:a)
			System.out.println(i);
	}
	static int[] computeHMS(int n) {
		int[] time = new int[3];
		time[0] = n/3600;
		time[1] = (n%3600)/60;
		time[2] = ((n%3600)%60)%60;
		
		return time;
	}
}
