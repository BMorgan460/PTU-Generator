public class Spewpa extends Pokemon{
	{
		name = "Spewpa";
		bHP = 5;
		bAtk = 2;
		bDef = 6;
		bSpAtk = 3;
		bSpDef = 3;
		bSpd = 3;
		type1 = "Bug";
		type2 = "";
		abilities = new String[]{"Compound Eyes", "Shed Skin", "Friend Guard", "Wonder Skin", "Effect Spore"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Scatterbug();
		prevReq = 5;
		next = new String[]{"Vivillon"};
		nextReq = new String[]{"10"};
		height = "1\'/00\"";
		size = "Small";
		weight = 18.5;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 2;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 0;
		power = 1;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Threaded"};
		athl = 1;
		acro = 1;
		combat = 1;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 5};
		moves = new String[]{"Harden", "Protect"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Electroweb", "Iron Defense"};
		naturalMoves = new String[]{};
	}
		Spewpa(){

		super();
		}
}