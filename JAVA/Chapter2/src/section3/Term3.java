package section3;

public class Term3 {
	private int coef;
	private int expo;
	
	public Term3(int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int getExpo() { //getter
		return expo;
	}
	
	public int getCoef() {
		return coef;
	}
	
	public void setCoef(int coef) { //setter
		this.coef = coef;
	}
	
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x,  expo));
	}
	
	public void printTerm() {
		System.out.print(coef + "x^" + expo);
		
	}

}
