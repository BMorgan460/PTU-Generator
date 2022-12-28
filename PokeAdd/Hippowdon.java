public class Hippowdon extends Pokemon{
	{
		name = "Hippowdon";
		bHP = 10;
		bAtk = 11;
		bDef = 12;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Ground";
		type2 = "";
		abilities = new String[]{"Sand Stream", "Arena Trap", "Sand Force", "Enduring Rage", "Sand Rush"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Hippopotas();
		prevReq = 30;
		height = "6\'/7\"";
		size = "Large";
		weight = 661.4;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 3;
		lJump = 0 ;
		hJump = 1;
		power = 9;
		natureWalk = new String[]{"Desert"};
		underdog = false;
		other = new String[]{"Groundshaper","Tremorsense"};
		athl = 3;
		acro = 1;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{7, 13, 19, 19, 25, 31, 40, 50, 60};
		moves = new String[]{"Bite", "Yawn", "Take Down", "Dig", "Sand Tomb", "Crunch", "Earthquake", "DoubleEdge", "Fissure"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Earthquake", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Giga Impact", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Earth Power", "Fire Fang", "Ice Fang", "Iron Head", "Iron Tail", "Snore", "Stealth Rock", "Stomping Tantrum", "Superpower", "Thunder", "Water Pulse"};
		naturalMoves = new String[]{"Fire Fang", "Ice Fang", "Thunder"};
	}
		Hippowdon(){

		super();
		}
}