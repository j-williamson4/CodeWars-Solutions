public class SaleHotdogs {
  // less than 5, 100 cents per dog
  // less than 10, but more than 4? 95 cents per dog
  // 10 or more? 90 cents per dog
  public static int saleHotdogs(final int n){
    return n < 5 ? 100*n : n < 10 ? 95*n :90*n;
  }
 } 
