public class swap2numbers {
  static void swapResources(int R1, int R2) {
    System.out.println("Before swap: R1 is " + R1 + " and R2 is: " + R2);
    
    R1 = R1 ^ R2;
    R2 = R1 ^ R2;
    R1 = R1 ^ R2;
    
    System.out.println("After swap: R1 is " + R1 + " and R2 is: " + R2);
  }
  public static void main(String[] args){
    int R1 = 1; 
    int R2 = 2;

    swapResources(R1, R2);
  }
}
