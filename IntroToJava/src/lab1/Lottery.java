package lab1;

public class Lottery {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			for (int j = i+1; j < 11; j++) {
				for (int j2 = j+1; j2 < 11; j2++) {
					System.out.printf("%d %d %d%n",i,j,j2);
				}
			}
		}
		
	}
}
