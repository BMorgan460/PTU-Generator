public class Vanillish extends Pokemon{
	{
		name = "Vanillish";
		bHP = 5;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Ice";
		type2 = "";
		abilities = new String[]{"Ice Body", "Snow Cloak", "Weak Armor", "Winter's Kiss", "Clear Body"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Vanillite();
		prevReq = 35;
		next = new String[]{"Vanilluxe"};
		nextReq = new String[]{"45"};
		height = "3\'/7\"";
		weight = 90.4;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Mineral";
		egg2 = "Terravore";
		habitats = new String[]{"Cave", "Taiga", "Tundra"};
		overland = 3;
		swim = 2;
		levitate = 5;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Tundra"};
		underdog = true;
		other = new String[]{"Chilled","Freezer"};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 22, 26, 31, 36, 42, 47, 53, 58};
		moves = new String[]{"Harden", "Astonish", "Uproar", "Icy Wind", "Mist", "Avalanche", "Taunt", "Mirror Shot", "Acid Armor", "Ice Beam", "Hail", "Mirror Coat", "Blizzard", "Sheer Cold"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Light Screen", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Explosion", "Frost Breath", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon"};
		tutorMoves = new String[]{"Icy Wind", "Iron Defense", "Magic Coat", "Magnet Rise", "Signal Beam", "Sleep Talk", "Snore", "Uproar"};
		naturalMoves = new String[]{};
	}
		Vanillish(){

		super();
		}
}