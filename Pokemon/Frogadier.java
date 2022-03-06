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
		abilities = new String[]{"Mud Dweller", "Torrent", "Protean", "Hydration", "Away"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Froakie();
		prevReq = 15;
		next = new String[]{"Greninja"};
		nextReq = new String[]{"30"};
		height = "2\'/00\"";
		size = "Small";
		weight = 24;
		WC = 1;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Water";
		egg2 = "1";
		habitats = new String[]{"Freshwater", "Marsh", "Capability"};
		overland = 7;
		swim = 6;
		levitate = 0;
		sky = 0;
		burrow = 0;
		lJump = 2;
		hJump = 3;
		power = 2;
		underdog = false;
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
		movesLevels = new int[]{1, 1, 5, 8, 10, 14, 20, 23, 28, 33, 38, 44, 48, 55};
		moves = new String[]{"Pound", "Growl", "Bubble", "Quick Attack", "Lick", "Water Pulse", "Smokescreen", "Round", "Fling", "Smack Down", "Substitute", "Bounce", "Double Team", "Hydro Pump"};
		TMs = new String[]{"Toxic", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Smack Down", "Return", "Dig", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Scald", "Fling", "Acrobatics", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "UTurn", "Substitute", "Rock Smash", "Dark Pulse", "PowerUp", "Confide"};
		tutorMoves = new String[]{"Bounce", "Gunk Shot", "Ice Punch", "Icy Wind", "Low Kick", "Role Play", "Snatch", "Snore", "Spite", "Water Pledge", "Water Pulse"};
		naturalMoves = new String[]{};
}
		Frogadier(){

		super();
		}
}