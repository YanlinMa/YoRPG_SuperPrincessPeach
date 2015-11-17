//Team SuperPrincessPeach - Grace Stempel, Denis Duman, Andie Ma
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

/*=============================================
  class Mage -- protagonist of Ye Olde RPG
  =============================================*/
 
public class Mage extends Character {
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String name ) {
	super();
	_hitPts = 90;
	_strength = 150;
	_defense = 10;;
	_attack = .8;
	_name = name;
    }

}//end class Mage
