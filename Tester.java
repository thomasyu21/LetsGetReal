public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(0.001);
    RealNumber b = new RealNumber(0.002);
    RealNumber c = new RealNumber(-0.001);
    RealNumber d = new RealNumber(0.0);
    RealNumber e = new RealNumber(0.0);
    RealNumber f = new RealNumber(1.0);

    System.out.println(a.getValue());
    System.out.println(b.getValue());

    System.out.println(a.equals(b));
    System.out.println(a.equals(d));
    System.out.println(e.equals(d));

    System.out.println(a.add(b));
    System.out.println(c.add(b));

    System.out.println(a.multiply(b));
    System.out.println(d.multiply(b));
    System.out.println(a.multiply(f));
    System.out.println(c.multiply(f));

    System.out.println(b.divide(a));
    System.out.println(b.divide(f));
    System.out.println(c.divide(f));

    System.out.println(b.subtract(a));
    System.out.println(e.subtract(f));
    System.out.println(c.subtract(e));

    System.out.println();

    RationalNumber a1 = new RationalNumber(1, 2);
    RationalNumber b1 = new RationalNumber(-1, 2);
    RationalNumber c1 = new RationalNumber(1, -5);
    RationalNumber d1 = new RationalNumber(1, 0);
    RationalNumber e1 = new RationalNumber(-2, -5);
    System.out.println(a1.getNumerator());
    System.out.println(a1.getDenominator());

    System.out.println(b1.getNumerator());
    System.out.println(b1.getDenominator());

    System.out.println(c1.getNumerator());
    System.out.println(c1.getDenominator());

    System.out.println(d1.getNumerator());
    System.out.println(d1.getDenominator());

    System.out.println(e1.getNumerator());
    System.out.println(e1.getDenominator());

    RationalNumber f1 = c1.reciprocal();
    RationalNumber g1 = d1.reciprocal();
    RationalNumber h1 = a1.reciprocal();
    System.out.println(f1.getNumerator());
    System.out.println(f1.getDenominator());

    System.out.println(g1.getNumerator());
    System.out.println(g1.getDenominator());

    System.out.println(h1.getNumerator());
    System.out.println(h1.getDenominator());

    RationalNumber i1 = a1.reciprocal();
    System.out.println(i1.equals(h1));
    System.out.println(i1.equals(g1));

    System.out.println(a1);
    System.out.println(b1);
    System.out.println(c1);
    System.out.println(d1);

    RationalNumber j1 = new RationalNumber(20, -5);
    RationalNumber k1 = new RationalNumber(24, 8);
    System.out.println(j1);
    System.out.println(k1);

    System.out.println(a1.multiply(b1));
    System.out.println(a1.multiply(d1));
    System.out.println(a1.divide(b1));
    System.out.println(a1.divide(d1));

    System.out.println(a1.add(b1));
    System.out.println(b1.add(c1));
    System.out.println(a1.add(c1));

    System.out.println(a1.subtract(b1));
    System.out.println(a1.subtract(d1));
    System.out.println(e1.subtract(c1));
  }
}
