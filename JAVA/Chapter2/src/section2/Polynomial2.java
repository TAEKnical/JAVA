package section2;

public class Polynomial2 {
	public char name;
	public Term2 [] term;
	public int nTerms;
	
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
	
	public int findTerm(int e) {
		for(int i=0; i<nTerms && term[i].expo>=e; i++) {
			if(term[i].expo == e)
				return i;
		}
		return -1;
	}
	
	public void addTerm(int c, int e) {
		int index = findTerm(e);
		if(index != -1) {
			term[index].coef += c;
		}
		else {
			int i = nTerms-1;
			while ( i >= 0 && term[i].expo < e) {
				term[i+1] = term[i];
				i--;
			}
			term[i+1] = new Term2();
			term[i+1].coef = c;
			term[i+1].expo = e;
			nTerms++;
		}
	}


}
