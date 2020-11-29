public abstract class Number{
  public abstract double getValue();

  public boolean equals(Number other){
    if (this.getValue() == 0 || other.getValue() == 0) {
      if (this.getValue() == other.getValue()) {
        return true;
      }else{
        return false;
      }
    }
    double difference = Math.abs(((this.getValue()-other.getValue())/this.getValue()));
    if (difference <= 0.00001) {
      return true;
    }
    return false;
  }

}
