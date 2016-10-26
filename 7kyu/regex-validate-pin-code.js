function validatePIN(pin) {
  // return true or false
  var numbers = /^\d+$/;
  var notNum = /[\D]/;
  if(pin.match(notNum)) return false;
  if(pin.match(numbers))
   return (pin.length == 4 || pin.length == 6);
}   
