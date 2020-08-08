import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ProblemStatement1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int no = sc.nextInt();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		while(no != 0) {
			int lastd = no % 10;
			if(count.containsKey(lastd)) {
				count.put(lastd,count.get(lastd)+1);
			}else {
				count.put(lastd, 1);
			}
			no = no / 10;
		}
		
		Set<Integer> keys = count.keySet();
		System.out.println("Enter digit to find =");
		int digit = sc.nextInt();
		
		System.out.println("Enter occurences =");
		int occ = sc.nextInt();
		
		
		for(Integer key : keys) {
			
			if(digit == key && count.get(key) == occ) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
		sc.close();
	}

	
}
