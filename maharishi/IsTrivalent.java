package maharishi;
public class IsTrivalent {
	public static void main(String[] args) {
		int[] a= {-1,0,1,0,1,-1};
		int result = isTrivalent(a);
		System.out.println(result);
	}
	static int isTrivalent(int[] a) {
		int[] tempArray = new int[a.length];
        for (int i = 0; i < tempArray.length; i++)
            tempArray[i] = Integer.MIN_VALUE;
        int index = 0;
        for (int i=0;i<a.length;i++) {
            boolean flag = true;
            for (int k = 0; k < index; k++) {
                if (tempArray[k] == a[i]) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                tempArray[index] = a[i];
                index++;
            }
        }
        if (index != 3) return 0;
        else return 1;
	}
}
