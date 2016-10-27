function findNextSquare(sq) {
 // Return the next square if sq is a perfect square, -1 otherwise
 var x = isSquare(sq);
 if(x === false) return -1;
 else {
  var perfectSquare = Math.sqrt(sq);
  var nextSquare = Math.pow((perfectSquare+1),2);
  return nextSquare;
 }
}
var isSquare = function(n) {
  return n > 0 && Math.sqrt(n) % 1 === 0;
