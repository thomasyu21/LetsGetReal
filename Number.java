public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if (this.getValue() == other.getValue()){
      return 0;
    }else if (this.getValue() > other.getValue()){
      return 1;
    }else{
      return -1;
    }
  }

  public boolean equals(Number other){
    if (this.getValue() == 0 || other.getValue() == 0) {
      if (this.getValue() == other.getValue()) {
        return true;
      }else{
        return false;
      }
    }
    double difference = Math.abs(((this.getValue()-other.getValue())/this.getValue()));
    if (difference <= 0.0000001) {
      return true;
    }
    return false;
  }

}
