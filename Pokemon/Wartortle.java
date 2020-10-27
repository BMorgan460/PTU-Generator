public class Wartortle extends Pokemon{
	{
		name = "Wartortle";
		bHP = 6;
		bAtk = 6;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Rain Dish", "Torrent", "Shell Armor", "Shell Shield", "Overtcoat"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Squirtle();
		prevReq = 15;
		next = new String[]{"Blastoise"};
		nextReq = new String[]{"30"};
		height = "3\'/3\"";
		weight = 49.6;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Water";
		habitats = new String[]{"Beach", "Freshwater", "Ocean"};
		overland = 6;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Wetlands"};
		underdog = true;
		other = new String[]{"Fountain"};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 1;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 3;
		movesLevels = new int[]{4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 40, 44, 48};
		moves = new String[]{"Tail Whip", "Bubble", "Withdraw", "Water Gun", "Bite", "Rapid Spin", "Protect", "Water Pulse", "Aqua Tail", "Skull Bash", "Iron Defense", "Rain Dance", "Hydro Pump"};
		TMs = new String[]{"Surf", "Strength", "Waterfall", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Return", "Dig", "Brick Break", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Scald", "Fling", "Gyro Ball", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Body Slam", "Slam", "Brine", "Counter", "Defense Curl", "Dive", "Dynamic Punch", "Focus Punch", "Ice Punch", "Icy Wind", "Iron Defense", "Iron Tail", "Mega Kick", "Mega Punch", "Rollout", "Seismic Toss", "Sleep Talk", "Snore", "Water Pledge", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Wartortle(){

		super();
		}
}