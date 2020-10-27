public class Manectric extends Pokemon{
	{
		name = "Manectric";
		bHP = 7;
		bAtk = 8;
		bDef = 6;
		bSpAtk = 11;
		bSpDef = 6;
		bSpd = 11;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Electrodash", "Lightning Rod", "Sprint", "Static", "Minus"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Electrike();
		prevReq = 25;
		height = "4\'/11\"";
		weight = 88.6;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Carnivore";
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 4;
		natureWalk = new String[]{"Grassland"};
		underdog = false;
		other = new String[]{"Tracker","Zapper"};
		athl = 5;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 4;
		focus = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 24, 30, 36, 42, 48, 54, 60};
		moves = new String[]{"Leer", "Howl", "Quick Attack", "Spark", "Odor Sleuth", "Thunder Fang", "Bite", "Discharge", "Roar", "Wild Charge", "Charge", "Thunder", "Electric Terrain"};
		TMs = new String[]{"Strength", "Roar", "Toxic", "Hidden Power", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Flamethrower", "Facade", "Rest", "Attract", "Thief", "Round", "Overheat", "Charge", "Charge Beam", "Giga Impact", "Flash", "Volt Switch", "Thunder", "Thunder Wave", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Snarl"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Electric Terrain", "Iron Tail", "Magnet Rise", "Shock Wave", "Signal Beam", "Sleep Talk", "Snore", "Swift", "Uproar"};
		naturalMoves = new String[]{"Electric Terrain"};
	}
		Manectric(){

		super();
		}
}