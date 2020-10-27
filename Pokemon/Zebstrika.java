public class Zebstrika extends Pokemon{
	{
		name = "Zebstrika";
		bHP = 8;
		bAtk = 10;
		bDef = 6;
		bSpAtk = 8;
		bSpDef = 6;
		bSpd = 12;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Lightning Rod", "Motor Drive", "Sprint", "Thunder Boost", "Sap Sipper"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Blitzle();
		prevReq = 25;
		height = "5\'/3\"";
		size = "Large";
		weight = 175.3;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Grassland"};
		overland = 8;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 7;
		natureWalk = new String[]{"Grassland"};
		underdog = false;
		other = new String[]{"Zapper","Glow","Mountable 1"};
		athl = 6;
		acro = 4;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 3;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 8, 11, 15, 18, 22, 25, 31, 36, 42, 47, 53, 58};
		moves = new String[]{"Tail Whip", "Charge", "Shock Wave", "Thunder Wave", "Flame Charge", "Pursuit", "Spark", "Stomp", "Discharge", "Agility", "Wild Charge", "Thrash", "Ion Deluge"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Overheat", "Charge", "Charge Beam", "Giga Impact", "Flash", "Volt Switch", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Rock Smash"};
		tutorMoves = new String[]{"Bounce", "Ion Deluge", "Magnet Rise", "Signal Beam", "Sleep Talk", "Snore"};
		naturalMoves = new String[]{"Ion Deluge"};
	}
		Zebstrika(){

		super();
		}
}