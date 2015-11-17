//Team SuperPrincessPeach - Grace Stempel, Denis Duman, Andie Ma
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

/*=============================================
  class Mr_Brown -- protagonist of Ye Olde RPG
  =============================================*/
 
public class Mr_Brown extends Character {
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mr_Brown( String name ) {
	super();
	_hitPts = 200;
	_strength = 125;
	_defense = 30;;
	_attack = .1;
	_name = name;
    }

}//end class Mr_Brown
