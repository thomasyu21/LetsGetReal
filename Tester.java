public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(0.001);
    RealNumber b = new RealNumber(0.002);

    System.out.println(a.getValue());
    System.out.println(b.getValue());

    System.out.println(a.equals(b));
  }
}
