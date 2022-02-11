class Rational{
    public int numerator;
    public int gcd;
    public int denominator;

    public Rational(int n, int d){
        this.numerator = n;
        this.denominator = d;
    }

    public String getRational(){
      return numerator +" / "+denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }
    
    public int getDenominator() {
        return this.denominator;
    }
    
    public void setNumerator(int x) {
        this.numerator = x;
    }
    
    
    public void setDenominator(int x) {
        this.denominator = x;
    }
    
    public void add(Rational other) {
        this.numerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        this.denominator *= other.getDenominator();
    }
    
    public void subtract(Rational other) {
        this.numerator = this.numerator * other.getDenominator() - other.getNumerator() * this.denominator;
        this.denominator *= other.getDenominator();
    }
    
    public void multiply(Rational other) {
        this.numerator *= other.getNumerator();
        this.denominator *= other.getDenominator();   
    }

    public void divide(Rational other) {
        this.numerator *= other.getDenominator();
        this.denominator *= other.getNumerator();
    }
    
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }

    public int getGCF(){
      int gcd = 0;
      for(int i = 1; i <= numerator && i <= denominator; i++){
        if(numerator % i == 0 && denominator % i == 0){
          gcd = i;
        }
      }
      return gcd;
    }

    public String simplified(){
      int gcf = getGCF();
      numerator /= gcf;
      denominator /= gcf;
      return numerator+" / "+denominator;
    } 
}