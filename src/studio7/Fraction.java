package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public String add(Fraction frac) {
		int lcd;
		int multiple;
		int numReps;
		if (denominator > frac.getDenominator()) {
			multiple = denominator;
			while (multiple % frac.getDenominator() != 0) {
				multiple = multiple + denominator;
			}
		}
		else {
			multiple = frac.getDenominator();
			while (multiple % denominator != 0) {
				multiple = multiple + frac.getDenominator();
			}
		}
		lcd = multiple;
		int numOne = lcd / denominator * numerator;
		int numTwo = lcd / frac.getDenominator() * frac.getNumerator();
		
		Fraction addition = new Fraction(numOne + numTwo, lcd);
		
		return addition.getNumerator() + "/" + addition.getDenominator();
		
	}
	
	public String multiply(Fraction frac) {
		int num = numerator * frac.getNumerator();
		int den = denominator * frac.getDenominator();
		
		Fraction multiplication = new Fraction (num, den);
		
		return multiplication.getNumerator() + "/" + multiplication.getDenominator();
	}
	
	public String reciprocal() {
		
		return denominator + "/" + numerator;
		
	}
	
	public String simplify() {
		
		int gcf = 1;
		if (denominator > numerator) {
			for (int i = 2; i <= numerator; i++) {
				if (numerator % i == 0 && denominator % i == 0)  {
					gcf = i;
				}
			}
		}
		else {
			for (int i = 2; i <= denominator; i++) {
				if (numerator % i == 0 && denominator % i == 0)  {
					gcf = i;
				}
			}
		}
		
		Fraction simplified = new Fraction (numerator / gcf, denominator / gcf);
		
		return simplified.getNumerator() + "/" + simplified.getDenominator();
	}
	
	public static void main(String[] args) {
		Fraction test = new Fraction(2, 4);
		Fraction testTwo = new Fraction(1, 3);
		System.out.println(test.getNumerator());
		System.out.println(test.getDenominator());
		System.out.println(test.add(testTwo));
		System.out.println(test.multiply(testTwo));
		System.out.println(test.reciprocal());
		System.out.println(test.simplify());
	}

}
