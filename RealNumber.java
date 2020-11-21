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
    if (this.value == 0 || other.getValue() == 0) {
      if (this.value == other.getValue()) {
        return true;
      }else{
        return false;
      }
    }
    double difference = Math.abs(((this.value-other.getValue())/this.value));
    if (difference <= 0.00001) {
      return true;
    }
    return false;
  }

  public RealNumber add(RealNumber other){
    RealNumber result = new RealNumber(this.value+other.getValue());
    return result;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber result = new RealNumber(this.value*other.getValue());
    return result;
  }

  public RealNumber divide(RealNumber other){
    RealNumber result = new RealNumber(this.value/other.getValue());
    return result;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber result = new RealNumber(this.value-other.getValue());
    return result;
  }
}
