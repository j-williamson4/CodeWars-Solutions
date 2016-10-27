public class Slope
{
  public String slope(int[] points) {
    int numerator = points[3] - points[1];   // y2 - y1
    int denominator = points[2] - points[0]; // x2 - x1 
    if(denominator == 0) return "undefined"; 
    else return Integer.toString(numerator/denominator);
   } 
}   
