package studio7;

public class Die {
	private int n;
	
	public Die (int n) {
		this.n = n;
	}
	
	public int rollDice() {
		int number = (int) (Math.random() * n + 1);
		return number;
	}
	
	public static void main(String[] args) {
		Die test = new Die(5);
		System.out.print(test.rollDice());
	}
}
