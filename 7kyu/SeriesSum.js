function SeriesSum(n)
{
  if(n<=0) return n.toFixed(2);
  else {
    var sum = 0;
    for(var i = 1; i<=n; i++) {
    partialResult = 1/(1+3*(i-1));
    sum += partialREsult;
   }
  }
  // round to two numbers, and return as a string
  sum = sum.toFixed(2);
  return sum.toString();
}  
