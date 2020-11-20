public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if ((deno < 0 && nume > 0) || (nume < 0 && deno < 0)){
      numerator = -nume;
      denominator = -deno;
    }else if (deno == 0){
      numerator = 0;
      denominator = 1;
    }else{
    numerator = nume;
    denominator = deno;
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
}
