package section3;

public class Polynomial3 {
	private char name;
	private Term3 [] term;
	private int nTerms;
	
	public Polynomial3() {
		nTerms = 0;
		term = new Term3 [100];
	}
	
	public Polynomial3(char name) {
		this.name = name; //this는 전역, 그냥 name은 지역
		nTerms = 0;
		term = new Term3 [100];
	}
	
	public int calcPolynomial(int x) {
		int result = 0;
		
		for(int i = 0; i<nTerms; i++) {
			result += term[i].calcTerm(x);
		}
		
		return result;
	}
	
	public void printPolynomial() {
		for (int i = 0; i<nTerms;i++) {
			term[i].printTerm();
			System.out.print("+");
		}
		System.out.println();
	}
	
	private int findTerm(int e) {
		for(int i=0; i<nTerms && term[i].getExpo()>=e; i++) {
			if(term[i].getExpo() == e)
				return i;
		}
		return -1;
	}
	
	public void addTerm(int c, int e) {
		int index = findTerm(e);
		if(index != -1) {
			term[index].setCoef(term[index].getCoef()+c);
		}
		else {
			int i = nTerms-1;
			while ( i >= 0 && term[i].getExpo() < e) {
				term[i+1] = term[i];
				i--;
			}
			term[i+1] = new Term3(c,e);
			nTerms++;
		}
	}
	
	public char getName() {
		return name;
	}


}
