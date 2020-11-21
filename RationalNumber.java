public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno < 0){
      numerator = -nume;
      denominator = -deno;
    }else if (deno == 0){
      numerator = 0;
      denominator = 1;
  }else{
    numerator = nume;
    denominator = deno;
  }
    if (numerator != 0){
      reduce();
  }
}

  public double getValue(){
    return (double)numerator/denominator;
  }

  public int getNumerator(){
   return numerator;
 }

 public int getDenominator(){
   return denominator;
 }

 public RationalNumber reciprocal(){
   RationalNumber result = new RationalNumber(denominator, numerator);
   return result;
  }

  public boolean equals(RationalNumber other){
    if (this.numerator == other.numerator && this.denominator == other. denominator){
      return true;
    }
    if (this.numerator == 0 && this.numerator == other.numerator){
      return true;
    }
    return false;
  }

  public String toString(){
    return numerator+"/"+denominator;
  }

  private static int gcd(int a, int b){
    int larger = 0;
    int smaller = 0;
    if (Math.abs(a) > Math.abs(b)){
      larger = Math.abs(a);
      smaller = Math.abs(b);
    }else{
      larger = Math.abs(b);
      smaller = Math.abs(a);
    }
    while (larger%smaller != 0){
      int r = larger%smaller;
      larger = smaller;
      smaller = r;
    }
    return smaller;
  }

  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator/gcd;
    denominator = denominator/gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber result = new RationalNumber(this.numerator*other.numerator, this.denominator*other.denominator);
    return result;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber result = new RationalNumber(this.numerator*other.denominator, this.denominator*other.numerator);
    return result;
  }

  public RationalNumber add(RationalNumber other){
    int newNumerator = (this.numerator*other.denominator)+(other.numerator*this.denominator);
    int newDenominator = (this.denominator*other.denominator);
    RationalNumber result = new RationalNumber(newNumerator, newDenominator);
    return result;
  }

  public RationalNumber subtract(RationalNumber other){
    int newNumerator = (this.numerator*other.denominator)-(other.numerator*this.denominator);
    int newDenominator = (this.denominator*other.denominator);
    RationalNumber result = new RationalNumber(newNumerator, newDenominator);
    return result;
  }
}
