public class Gurdurr extends Pokemon{
	{
		name = "Gurdurr";
		bHP = 9;
		bAtk = 11;
		bDef = 9;
		bSpAtk = 4;
		bSpDef = 5;
		bSpd = 4;
		type1 = "Fighting";
		type2 = "";
		abilities = new String[]{"Guts", "Sheer Force", "Thrust", "Hustle", "Iron Fist"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Timburr();
		prevReq = 25;
		next = new String[]{"Conkeldurr"};
		nextReq = new String[]{"40"};
		height = "3\'/11\"";
		weight = 88.2;
		WC = 3;
		maleRatio = 75.0;
		femaleRatio = 25.0;
		egg1 = "Humanshape";
		egg2 = "Omnivore";
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 8;
		natureWalk = new String[]{"Mountain", "Urban"};
		underdog = true;
		other = new String[]{"Wielder"};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 1;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 3;
		movesLevels = new int[]{4, 8, 12, 16, 20, 24, 29, 33, 37, 41, 45, 49, 53, 57};
		moves = new String[]{"Focus Energy", "Bide", "Low Kick", "Rock Throw", "WakeUp", "Chip Away", "Bulk Up", "Rock Slide", "Dynamic Punch", "Scary Face", "Hammer Arm", "Stone Edge", "Focus Punch", "Superpower"};
		TMs = new String[]{"Strength", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Rain Dance", "Frustration", "Smack Down", "Return", "Dig", "Brick Break", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Low Sweep", "Round", "Focus Blast", "Fling", "Payback", "Retaliate", "Stone Edge", "Rock Slide", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"Block", "Drain Punch", "Fire Punch", "Helping Hand", "Ice Punch", "Knock Off", "Low Kick", "Sleep Talk", "Snore", "Superpower", "Thunder Punch", "Work Up"};
		naturalMoves = new String[]{};
	}
		Gurdurr(){

		super();
		}
}