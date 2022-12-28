public class Greninja extends Pokemon{
	{
		name = "Greninja";
		bHP = 7;
		bAtk = 10;
		bDef = 7;
		bSpAtk = 10;
		bSpDef = 7;
		bSpd = 12;
		type1 = "Water";
		type2 = "Dark";
		abilities = new String[]{"Mud Dweller", "Torrent", "Protean", "Hydration", "Wash Away"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Frogadier();
		prevReq = 30;
		height = "4\'/11\"";
		weight = 88.2;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 8;
		swim = 8;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 3;
		natureWalk = new String[]{"Wetlands"};
		underdog = false;
		other = new String[]{"Fountain","Gilled","Stealth","Wallclimber"};
		athl = 4;
		acro = 6;
		combat = 4;
		stealth = 5;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 10, 14, 19, 23, 28, 33, 42, 49, 56, 68, 70, 77};
		moves = new String[]{"Bubble", "Quick Attack", "Lick", "Water Pulse", "Smokescreen", "Shadow Sneak", "Spikes", "Feint Attack", "Substitute", "Extrasensory", "Double Team", "Hydro Pump", "Haze", "Night Slash"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Return", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Scald", "Fling", "Brutal Swing", "Acrobatics", "Giga Impact", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Surf", "Dark Pulse", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Bounce", "Gunk Shot", "Hydro Cannon", "Ice Punch", "Icy Wind", "Low Kick", "Mat Block", "Night Slash", "Role Play", "Snatch", "Snore", "Spite", "Water Pledge", "Water Pulse"};
		naturalMoves = new String[]{"Haze", "Mat Block", "Block", "Night Slash", "Slash", "Role Play"};
	}
		Greninja(){

		super();
		}
}