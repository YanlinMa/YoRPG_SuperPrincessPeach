//Team SuperPrincessPeach - Grace Stempel, Denis Duman, Andie Ma
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

/*=============================================
  class Unicorn -- protagonist of Ye Olde RPG
  =============================================*/
 
public class Unicorn extends Character {
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Unicorn( String name ) {
	super();
	_hitPts = 300;
	_strength = 30;
	_defense = 45;;
	_attack = .2;
	_name = name;
    }

}//end class Unicorn
