package maharishi;

import java.util.ArrayList;
import java.util.List;

public class ClusterCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,3,3,4,4,4,4,2,2,3,3,5};
		int[] res = clusterCompression(a);
		for(int i:res) {
			System.out.println(i);
		}
	}
	static int[] clusterCompression(int [] a) {
		List<Integer> arr = new ArrayList<>();
		arr.add(a[0]);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				arr.add(a[i+1]);
			}
		}
		int[] result =new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			result[i]=arr.get(i);
		}
		return result;
	}

}
