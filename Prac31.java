
public class Prac31 {

	public static void main(String[] args) {
		int x = 5;
		for(int a=1; a<=x; a++ ) {
			for(int b=1; b<=a; b++) {
				int sum = a+b;
				if(sum%2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		

	}

}
