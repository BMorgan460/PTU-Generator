public class Gastrodon extends Pokemon{
	{
		name = "Gastrodon";
		bHP = 11;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 4;
		type1 = "Water";
		type2 = "Ground";
		abilities = new String[]{"Sand Force", "Storm Drain", "Life Force", "Gooey", "Defy Death"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Shellos();
		prevReq = 30;
		height = "2\'/11\"";
		weight = 65.9;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		overland = 3;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 0;
		power = 3;
		natureWalk = new String[]{"Wetlands"};
		underdog = false;
		other = new String[]{"Amorphous","Amorphous","Gilled","Sticky Hold","Wallclimber"};
		athl = 4;
		acro = 2;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{2, 4, 7, 11, 16, 22, 29, 41, 54};
		moves = new String[]{"Mud Sport", "Harden", "Water Pulse", "Mud Bomb", "Hidden Power", "Rain Dance", "Body Slam", "Muddy Water", "Recover"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Double Team", "Sludge", "Sludge Wave", "Sludge", "Sludge Bomb", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Scald", "Giga Impact", "Stone Edge", "Bulldoze", "Rock Slide", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Block", "Body Slam", "Slam", "Brine", "Counter", "Dive", "Earth Power", "Icy Wind", "Pain Split", "Snore", "Stomping Tantrum", "String Shot", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{};
	}
		Gastrodon(){

		super();
		}
}