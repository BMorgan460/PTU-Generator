public class Sealeo extends Pokemon{
	{
		name = "Sealeo";
		bHP = 9;
		bAtk = 6;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Ice";
		type2 = "Water";
		abilities = new String[]{"Thick Fat", "Ice Body", "Oblivious", "Deep Sleep", "Snow Cloak"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Spheal();
		prevReq = 20;
		next = new String[]{"Walrein"};
		nextReq = new String[]{"35"};
		height = "3\'/7\"";
		weight = 193.1;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		overland = 4;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Tundra"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 21, 26, 31, 31, 38, 45, 52};
		moves = new String[]{"Rollout", "Encore", "Ice Ball", "Brine", "Aurora Beam", "Body Slam", "Rest", "Snore", "Hail", "Blizzard", "Sheer Cold"};
		TMs = new String[]{"Roar", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Bulldoze", "Frost Breath", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Brine", "Dive", "Icy Wind", "Iron Tail", "Rollout", "Signal Beam", "Snore", "Super Fang", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Sealeo(){

		super();
		}
}