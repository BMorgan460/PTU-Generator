public class Luxio extends Pokemon{
	{
		name = "Luxio";
		bHP = 6;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 6;
		bSpDef = 5;
		bSpd = 6;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Keen Eye", "Rivalry", "Strong Jaw", "Intimidate", "Guts"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Shinx();
		prevReq = 15;
		next = new String[]{"Luxray"};
		nextReq = new String[]{"30"};
		height = "2\'/11\"";
		weight = 67.2;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Carnivore";
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Cave", "Grassland"};
		underdog = true;
		other = new String[]{"Tracker","Zapper"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 4;
		percep = 4;
		focus = 3;
		athlBonus = 1;
		acroBonus = 2;
		combatBonus = 1;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 18, 23, 28, 33, 38, 43, 48, 53};
		moves = new String[]{"Leer", "Charge", "Spark", "Bite", "Roar", "Swagger", "Thunder Fang", "Crunch", "Scary Face", "Discharge", "Wild Charge"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Charge", "Charge Beam", "Volt Switch", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Snarl", "Confide"};
		tutorMoves = new String[]{"Fury Cutter", "Iron Tail", "Magnet Rise", "Shock Wave", "Signal Beam", "Snore"};
		naturalMoves = new String[]{};
	}
		Luxio(){

		super();
		}
}