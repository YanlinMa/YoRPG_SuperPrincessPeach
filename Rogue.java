//Team SuperPrincessPeach - Grace Stempel, Denis Duman, Andie Ma
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

/*=============================================
  class Rogue -- protagonist of Ye Olde RPG
  =============================================*/
 
public class Rogue extends Character {
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Rogue( String name ) {
	super();
	_hitPts = 115;
	_strength = 75;
	_defense = 15;;
	_attack = 1;
	_name = name;
    }

}//end class Rogue
