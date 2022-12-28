public class Frogadier extends Pokemon{
	{
		name = "Frogadier";
		bHP = 5;
		bAtk = 6;
		bDef = 5;
		bSpAtk = 8;
		bSpDef = 6;
		bSpd = 10;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Mud Dweller", "Torrent", "Protean", "Hydration", "Wash Away"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Froakie();
		prevReq = 15;
		next = new String[]{"Greninja"};
		nextReq = new String[]{"30"};
		height = "2\'/0\"";
		size = "Small";
		weight = 24;
		WC = 1;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 7;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 2;
		natureWalk = new String[]{"Wetlands"};
		underdog = true;
		other = new String[]{"Fountain","Gilled","Stealth","Wallclimber"};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 2;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 10, 14, 19, 23, 28, 33, 40, 45, 50, 56};
		moves = new String[]{"Bubble", "Quick Attack", "Lick", "Water Pulse", "Smokescreen", "Round", "Fling", "Smack Down", "Substitute", "Bounce", "Double Team", "Hydro Pump"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Smack Down", "Return", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Scald", "Fling", "Acrobatics", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Surf", "Dark Pulse", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Bounce", "Gunk Shot", "Ice Punch", "Icy Wind", "Low Kick", "Role Play", "Snatch", "Snore", "Spite", "Water Pledge", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Frogadier(){

		super();
		}
}