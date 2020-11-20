public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    if (this.value == 0 || other.value == 0) {
      if (this.value == other.value) {
        return true;
      }else{
        return false;
      }
    }
    double difference = Math.abs(((this.value-other.value)/this.value)*100);
    if (difference >= 0.001) {
      return true;
    }
    return false;
  }

  public RealNumber add(RealNumber other){
    RealNumber result = new RealNumber(this.value+other.value);
    return result;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber result = new RealNumber(this.value*other.value);
    return result;
  }
}
