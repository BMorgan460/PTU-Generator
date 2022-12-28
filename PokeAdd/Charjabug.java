public class Charjabug extends Pokemon{
	{
		name = "Charjabug";
		bHP = 6;
		bAtk = 8;
		bDef = 10;
		bSpAtk = 6;
		bSpDef = 8;
		bSpd = 4;
		type1 = "Bug";
		type2 = "Electric";
		abilities = new String[]{"Battery", "Swarm", "Shed Skin", "Silk Threads", "Type Aura"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Grubbin();
		prevReq = 20;
		next = new String[]{"Vikavolt"};
		nextReq = new String[]{"30"};
		height = "1\'/8\"";
		size = "Small";
		weight = 9.7;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 4;
		swim = 1;
		levitate = 0;
		burrow = 3;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		natureWalk = new String[]{"Forest"};
		underdog = true;
		other = new String[]{"Threaded","Wallclimber"};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 25, 31, 37, 43, 49};
		moves = new String[]{"String Shot", "MudSlap", "Bite", "Bug Bite", "Spark", "Acrobatics", "Crunch", "XScissor", "Dig", "Discharge", "Iron Defense"};
		TMs = new String[]{"Toxic", "Hidden Power", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Charge", "Charge Beam", "Acrobatics", "Volt Switch", "Thunder", "Thunder Wave", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Electroweb", "Iron Defense", "Magnet Rise", "Shock Wave", "Snore"};
		naturalMoves = new String[]{};
	}
		Charjabug(){

		super();
		}
}