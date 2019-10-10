/**
 * 
 * @author sabrina mahjabin
 *
 */
public class methodassignment {

	public static int productOfValues(int value1,int value2,int value3) {
			return value1 * value2 * value3;
		}
		public static int sumOfValues(int value1,int value2) {
			int sum = 0;
			for (int i = value1; i<=value2; i++) {
				sum = (sum + i); 
			}
			return sum;
		}
		
		public static int averageOfValues(int n) {
			int sum = 0;
			for (int p=1; p<=n; p++) {
				sum = (sum + p);
			}
			int ave = sum / n;
			return ave;
		}
	public static void main(String[] args) {
		System.out.println(productOfValues(2,4,6));
		System.out.println(sumOfValues(4,7));
		System.out.println(averageOfValues(10));
	}
}
