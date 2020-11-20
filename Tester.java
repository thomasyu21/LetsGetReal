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
  }
}
