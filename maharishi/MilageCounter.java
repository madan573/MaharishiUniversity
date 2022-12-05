package maharishi;

public class MilageCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,9,9,5,0};
		updateMileageCounter(a,113);
		for(int i:a) {
			System.out.println(i);
		}
	}
	static void updateMileageCounter(int[] a, int miles) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+miles;
			miles = a[i]/10;
			a[i]=a[i]%10;
			if(miles==0) {
				break;
			}
		}
	}
}
