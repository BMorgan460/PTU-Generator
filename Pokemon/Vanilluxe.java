public class Vanilluxe extends Pokemon{
	{
		name = "Vanilluxe";
		bHP = 7;
		bAtk = 10;
		bDef = 9;
		bSpAtk = 11;
		bSpDef = 10;
		bSpd = 8;
		type1 = "Ice";
		type2 = "";
		abilities = new String[]{"Ice Body", "Snow Cloak", "Weak Armor", "Winters Kiss", "Clear Body"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Vanillish();
		prevReq = 35;
		height = "4\'/3\"";
		weight = 126.8;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Mineral";
		egg2 = "Terravore";
		habitats = new String[]{"Cave", "Taiga", "Tundra"};
		overland = 3;
		swim = 3;
		levitate = 6;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		natureWalk = new String[]{"Tundra"};
		underdog = false;
		other = new String[]{"Chilled","Freezer"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 4;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 22, 26, 31, 36, 42, 50, 59, 67};
		moves = new String[]{"Harden", "Astonish", "Uproar", "Icy Wind", "Mist", "Avalanche", "Taunt", "Mirror Shot", "Acid Armor", "Ice Beam", "Hail", "Mirror Coat", "Blizzard", "Sheer Cold"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Explosion", "Giga Impact", "Frost Breath", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Icy Wind", "Iron Defense", "Magic Coat", "Magnet Rise", "Sheer Cold", "Signal Beam", "Snore", "Uproar", "Water Pulse", "Weather Ball"};
		naturalMoves = new String[]{"Sheer Cold", "Weather Ball"};
	}
		Vanilluxe(){

		super();
		}
}