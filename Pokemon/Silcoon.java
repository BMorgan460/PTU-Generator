public class Silcoon extends Pokemon{
	{
		name = "Silcoon";
		bHP = 5;
		bAtk = 4;
		bDef = 6;
		bSpAtk = 3;
		bSpDef = 3;
		bSpd = 2;
		type1 = "Bug";
		type2 = "";
		abilities = new String[]{"Shed Skin", "Silk Threads", "Battle Armor", "Overcoat", "Sturdy"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Wurmple();
		prevReq = 5;
		next = new String[]{"Beautifly"};
		nextReq = new String[]{"10"};
		height = "2\'/0\"";
		size = "Small";
		weight = 22;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Nullivore";
		overland = 1;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Threaded"};
		athl = 1;
		acro = 1;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5};
		moves = new String[]{"Harden"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Electroweb", "Iron Defense", "String Shot"};
		naturalMoves = new String[]{};
	}
		Silcoon(){

		super();
		}
}