public class Kata {
 public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
  boolean flag = false;
  if(firstAttacker == fighter2.name) flag = true;
    while(fighter1.health >= 0 || fighter2.health >= 0) {
     if(flag == true) { // fighter1 is first
     fighter1.health -= fighter2.damagePerAttack
     if(fighter1.health <= 0) return fighter2.name;
     fighter2.health -= fighter1.damagePerAttack;
     if(fighter2.health <= 0) return fighter1.name;
    }
  else { // fighter2 is first
    figher2.health -= fighter1.damagePerAttack;
    if(fighter2.health <= 0) return fighter1.name;
    fighter1.health -= fighter2.damagePerAttack;
    if(fighter1.health <= 0) return fighter2.name;
   }
  } 
  return "";
 }
} 
