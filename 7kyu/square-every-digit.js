function squareDigits(num){
  var str = num.toString();
  var resultStr = [];
  // loop through each digit
  for(var i=0; i < str.length; i++) 
  {
      // square each digit
      resultStr[i] = str[i] * str[i];
  }
  return Number(resultStr.join(''));
}
