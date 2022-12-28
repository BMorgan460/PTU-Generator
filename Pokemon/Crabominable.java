public class Crabominable extends Pokemon{
	{
		name = "Crabominable";
		bHP = 10;
		bAtk = 13;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 7;
		bSpd = 4;
		type1 = "Fighting";
		type2 = "Ice";
		abilities = new String[]{"Hyper Cutter", "Anger Point", "Iron Fist", "Water Absorb", "Abominable"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Crabrawler();
		prevReq = 25;
		height = "5\'/7\"";
		size = "Large";
		weight = 396.8;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		habitats = new String[]{"Tundra"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 6;
		natureWalk = new String[]{"Tundra"};
		underdog = false;
		other = new String[]{"Gilled"};
		athl = 5;
		acro = 2;
		combat = 5;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 22, 25, 29, 33, 37, 42, 45, 49};
		moves = new String[]{"Rock Smash", "Leer", "Pursuit", "Bubblebeam", "PowerUp", "Dizzy Punch", "Avalanche", "Reversal", "Ice Hammer", "Iron Defense", "Dynamic Punch", "Close Combat"};
		TMs = new String[]{"Work Up", "Toxic", "Hail", "Bulk Up", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Brick Break", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Round", "Focus Blast", "Scald", "Fling", "Brutal Swing", "Payback", "Giga Impact", "Stone Edge", "Bulldoze", "Frost Breath", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Block", "Drain Punch", "Dual Chop", "Endeavor", "Focus Punch", "Ice Punch", "Icy Wind", "Iron Defense", "Iron Head", "Snore", "Superpower", "Thunder Punch", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Crabominable(){

		super();
		}
}