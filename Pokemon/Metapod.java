public class Metapod extends Pokemon{
	{
		name = "Metapod";
		bHP = 5;
		bAtk = 2;
		bDef = 6;
		bSpAtk = 3;
		bSpDef = 3;
		bSpd = 3;
		type1 = "Bug";
		type2 = "";
		abilities = new String[]{"Shed Skin", "Battle Armor", "Silk Threads", "Magic Guard", "Sturdy"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Caterpie();
		prevReq = 5;
		next = new String[]{"Butterfree"};
		nextReq = new String[]{"10"};
		height = "2\'/4\"";
		size = "Small";
		weight = 21.8;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Nullivore";
		habitats = new String[]{"Forest"};
		overland = 2;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
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
		movesLevels = new int[]{7};
		moves = new String[]{"Harden"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Electroweb", "Iron Defense", "String Shot", "Tackle"};
		naturalMoves = new String[]{};
	}
		Metapod(){

		super();
		}
}