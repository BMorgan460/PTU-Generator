public class Luxray extends Pokemon{
	{
		name = "Luxray";
		bHP = 8;
		bAtk = 12;
		bDef = 8;
		bSpAtk = 10;
		bSpDef = 8;
		bSpd = 7;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Intimidate", "Rivalry", "Sequence", "Celebrate", "Guts"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Luxio();
		prevReq = 30;
		height = "4\'/7\"";
		weight = 92.6;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Carnivore";
		habitats = new String[]{"Cave", "Grassland", "Mountain"};
		overland = 8;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 5;
		natureWalk = new String[]{"Grassland", "Cave"};
		underdog = false;
		other = new String[]{"Pack Mon","Tracker","Zapper","Mountable 1"};
		athl = 5;
		acro = 2;
		combat = 4;
		stealth = 5;
		percep = 6;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 3;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 18, 23, 28, 35, 42, 49, 56, 63, 67};
		moves = new String[]{"Leer", "Charge", "Spark", "Bite", "Roar", "Swagger", "Thunder Fang", "Crunch", "Scary Face", "Discharge", "Wild Charge", "Electric Terrain"};
		TMs = new String[]{"Strength", "Roar", "Toxic", "Hidden Power", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Charge", "Charge Beam", "Giga Impact", "Flash", "Volt Switch", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Snarl"};
		tutorMoves = new String[]{"Electric Terrain", "Fury Cutter", "Iron Tail", "Magnet Rise", "Shock Wave", "Signal Beam", "Sleep Talk", "Snore", "Superpower"};
		naturalMoves = new String[]{"Electric Terrain"};
	}
		Luxray(){

		super();
		}
}