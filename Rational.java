class Rational{
    public int numerator;

    public int denominator;

    public Rational(int n, int d){
        this.numerator = n;
        this.denominator = d;
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
    
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }
}