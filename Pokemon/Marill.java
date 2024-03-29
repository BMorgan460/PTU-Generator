public class Marill extends Pokemon{
	{
		name = "Marill";
		bHP = 7;
		bAtk = 2;
		bDef = 5;
		bSpAtk = 2;
		bSpDef = 5;
		bSpd = 4;
		type1 = "Water";
		type2 = "Fairy";
		abilities = new String[]{"Thick Fat", "Type Aura", "Huge Power", "Sap Sipper", "Wash Away"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Azurill();
		prevReq = 10;
		next = new String[]{"Azumarill"};
		nextReq = new String[]{"20"};
		height = "1\'/4\"";
		size = "Small";
		weight = 18.7;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Freshwater"};
		overland = 4;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 2;
		natureWalk = new String[]{"Wetlands"};
		underdog = true;
		other = new String[]{"Fountain"};
		athl = 3;
		acro = 2;
		combat = 1;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{2, 5, 7, 10, 10, 13, 16, 20, 23, 28, 31, 37, 40, 47};
		moves = new String[]{"Tail Whip", "Water Sport", "Bubble", "Defense Curl", "Rollout", "Bubble Beam", "Helping Hand", "Aqua Tail", "Play Rough", "Aqua Ring", "Rain Dance", "DoubleEdge", "Superpower", "Hydro Pump"};
		TMs = new String[]{"Work Up", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Light Screen", "Protect", "Rain Dance", "Frustration", "Return", "Brick Break", "Double Team", "Facade", "Rest", "Attract", "Round", "Scald", "Fling", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Body Slam", "Slam", "Bounce", "Camouflage", "Copycat", "Covet", "Defense Curl", "Dive", "Dynamic Punch", "Focus Punch", "Helping Hand", "Hyper Voice", "Ice Punch", "Icy Wind", "Iron Tail", "Knock Off", "Mega Kick", "Mega Punch", "Rollout", "Seismic Toss", "Snore", "Superpower", "Swift", "Uproar", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Swift", "Tackle"};
	}
		Marill(){

		super();
		}
}