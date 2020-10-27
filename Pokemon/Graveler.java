public class Graveler extends Pokemon{
	{
		name = "Graveler";
		bHP = 6;
		bAtk = 10;
		bDef = 12;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 4;
		type1 = "Rock";
		type2 = "Ground";
		abilities = new String[]{"Run Up", "Sand Veil", "Sturdy", "Bulletproof", "Rock Head"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Geodude();
		prevReq = 25;
		next = new String[]{"Golem"};
		nextReq = new String[]{"35"};
		height = "3\'/3\"";
		weight = 231.5;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Mineral";
		egg2 = "Terravore";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 3;
		lJump = 0 ;
		hJump = 1;
		power = 8;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = true;
		other = new String[]{"Groundshaper","Volatile Bomb"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{4, 6, 10, 12, 16, 18, 22, 24, 30, 34, 40, 44, 50, 54};
		moves = new String[]{"Mud Sport", "Rock Polish", "Rollout", "Magnitude", "Rock Throw", "Smack Down", "Bulldoze", "SelfDestruct", "Stealth Rock", "Rock Blast", "Earthquake", "Explosion", "DoubleEdge", "Stone Edge"};
		TMs = new String[]{"Strength", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Smack Down", "Earthquake", "Return", "Dig", "Brick Break", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Focus Blast", "Fling", "Incinerate", "Explosion", "Giga Impact", "Rock Polish", "Rock Polish", "Stone Edge", "Gyro Ball", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Block", "Body Slam", "Slam", "Counter", "Dynamic Punch", "Earth Power", "Fire Punch", "Focus Punch", "Iron Defense", "Mega Punch", "Metronome", "Rollout", "Seismic Toss", "Sleep Talk", "Snore", "Stealth Rock", "Sucker Punch", "Superpower", "Thunder Punch"};
		naturalMoves = new String[]{};
	}
		Graveler(){

		super();
		}
}