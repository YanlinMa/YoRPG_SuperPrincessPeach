//Team SuperPrincessPeach - Grace Stempel, Denis Duman, Andie Ma
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG
  =============================================*/

public class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String _name;
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }
	
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hitPts > 0;
    }


    /*=============================================
      int attack(Character) -- simulates attack on a Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
            Calls opponent's lowerHP() method to inflict damage. 
	    Returns damage dealt.
      =============================================*/
    public int attack( Character opponent ) {

	int damage = (int)( (_strength * _attack) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hitPts = _hitPts - damageInflicted;
    }

    //prepare a Warrior for a special attack
    public void specialize() {
	_attack = .75;
	_defense = 20;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .4;
	_defense = 40;
    }

    public static String about(){
	return "Ye Olde List o' Classes" + "\n" + "Warrior:" + "\n" + "Health: 125" + "\n" + "Strength: 100" + "\n" + "Defense: 40" + "\n" + "Attack Rating: .4" + "\n" + "Monster:" + "\n" + "Health: 150" + "\n" + "Strength: [20,65)" + "\n" + "Defense: 20" + "\n" + "Attack Rating: 1" + "\n" + "Mage:" + "\n" + "Health: 90" + "\n" + "Strength: 150" + "\n" + "Defense: 10" + "\n" + "Attack Rating: .8" + "\n" + "Rogue:" + "\n" + "Health: 115" + "\n" + "Strength: 75" + "\n" + "Defense: 15" + "\n" + "Attack Rating: 1" + "\n" + "Mr_Brown" + "\n" + "Health: 200" + "\n" + "Strength: 125" + "\n" + "Defense: 30" + "\n" + "Attack Rating: .1" + "\n" + "Unicorn:" + "\n" + "Health: 300" + "\n" + "Strength: 30" + "\n" + "Defense: 45" + "\n" + "Attack Rating: .2"
		
    }

}//end class Character
