public class Weedle extends Pokemon{
	{
		name = "Weedle";
		bHP = 4;
		bAtk = 4;
		bDef = 3;
		bSpAtk = 2;
		bSpDef = 2;
		bSpd = 5;
		type1 = "Bug";
		type2 = "Poison";
		abilities = new String[]{"Shield Dust", "Run Away", "Silk Threads", "Swarm", "Poison Touch"};
		abilityTypeCount = new int[] {1,3,1};
		next = new String[]{"Kakuna", "Beedrill"};
		nextReq = new String[]{"10"};
		height = "1\'/0\"";
		size = "Small";
		weight = 7.1;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "";
		habitats = new String[]{"Forest"};
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 1;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Threaded","Wallclimber"};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 2;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 9};
		moves = new String[]{"Poison Sting", "String Shot", "Bug Bite"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Electroweb"};
		naturalMoves = new String[]{};
	}
		Weedle(){

		super();
		}
}