
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 0;
		while (number < 100) {
			number++;
			if (number % 15 == 0) {
				System.out.println("FizzBuzz");	
			}else if (number % 5 == 0) {
				System.out.println("Buzz");
			}else if (number % 3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(number);
			}
		}
	}

}
