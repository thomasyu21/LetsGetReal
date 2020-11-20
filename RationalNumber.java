public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if ((deno < 0 && nume > 0) || (nume < 0 && deno < 0)){
      numerator = -nume;
      denominator = -deno;
      reduce();
    }else if (deno == 0){
      numerator = 0;
      denominator = 1;
    }else{
    numerator = nume;
    denominator = deno;
    reduce();
    }
  }

  public double getValue(){
    return 0.0;
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
      larger = a;
      smaller = b;
    }else{
      larger = b;
      smaller = a;
    }
    while (larger%smaller != 0){
      int r = larger/smaller;
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
}
