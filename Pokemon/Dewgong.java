public class Dewgong extends Pokemon{
	{
		name = "Dewgong";
		bHP = 9;
		bAtk = 7;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 10;
		bSpd = 7;
		type1 = "Water";
		type2 = "Ice";
		abilities = new String[]{"Thick Fat", "Winters Kiss", "Ice Body", "Hydration", "Frostbite"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Seel();
		prevReq = 30;
		height = "5\'/7\"";
		weight = 264.6;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		overland = 5;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 5;
		natureWalk = new String[]{"Ocean", "Tundra"};
		underdog = false;
		other = new String[]{"Freezer"};
		athl = 4;
		acro = 2;
		combat = 2;
		stealth = 1;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{3, 7, 11, 13, 17, 21, 23, 27, 31, 33, 34, 39, 45, 49, 55, 61, 65};
		moves = new String[]{"Growl", "Signal Beam", "Icy Wind", "Encore", "Ice Shard", "Rest", "Aqua Ring", "Aurora Beam", "Aqua Jet", "Brine", "Sheer Cold", "Take Down", "Dive", "Aqua Tail", "Ice Beam", "Safeguard", "Hail"};
		TMs = new String[]{"Surf", "Waterfall", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Safeguard", "Frustration", "Return", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Fling", "Giga Impact", "Frost Breath", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Aqua Tail", "Avalanche", "Body Slam", "Slam", "Dive", "Drill Run", "Iron Tail", "Sleep Talk", "Snore", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Dewgong(){

		super();
		}
}