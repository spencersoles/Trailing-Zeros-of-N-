public class Solution {
  public static int zeros(int n) {// unsure how general this algorithm is but it holds up to 1billion factorial
    if(n<100){
      return n/5 + (n/25);
      }
      System.out.println(n);
      return (((n/10) * 2) + ((n/10)/2) -(1+(n/1000000000 )));
  }
}
