public class Geodude extends Pokemon{
	{
		name = "Geodude";
		bHP = 4;
		bAtk = 8;
		bDef = 10;
		bSpAtk = 3;
		bSpDef = 3;
		bSpd = 2;
		type1 = "Rock";
		type2 = "Ground";
		abilities = new String[]{"Levitate", "Sand Veil", "Sturdy", "Bulletproof", "Rock Head"};
		abilityTypeCount = new int[] {1,3,1};
		next = new String[]{"Graveler", "Golem"};
		nextReq = new String[]{"35"};
		height = "1\'/4\"";
		size = "Small";
		weight = 44.1;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Mineral";
		egg2 = "";
		overland = 4;
		swim = 2;
		levitate = 3;
		burrow = 3;
		lJump = 0 ;
		hJump = 1;
		power = 3;
		underdog = true;
		other = new String[]{"Volatile Bomb"};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{1, 1, 4, 6, 10, 12, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42};
		moves = new String[]{"Defense Curl", "Tackle", "Mud Sport", "Rock Polish", "Rollout", "Magnitude", "Rock Throw", "Smack Down", "Bulldoze", "SelfDestruct", "Stealth Rock", "Rock Blast", "Earthquake", "Explosion", "DoubleEdge", "Stone Edge"};
		TMs = new String[]{"Strength", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Smack Down", "Earthquake", "Return", "Dig", "Brick Break", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Fling", "Incinerate", "Explosion", "Rock Polish", "Stone Edge", "Gyro Ball", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Nature Power", "Confide"};
		eggMoves = new String[]{"Autotomize", "Block", "Curse", "Endure", "Flail", "Focus Punch", "Hammer Arm", "Mega Punch", "Rock Climb", "Rock Slide", "Wide Guard"};
		tutorMoves = new String[]{"Ancient Power", "Block", "Body Slam", "Slam", "Counter", "Dynamic Punch", "Earth Power", "Fire Punch", "Iron Defense", "Metronome", "Rollout", "Seismic Toss", "Sleep Talk", "Snore", "Stealth Rock", "Sucker Punch", "Superpower", "Thunder Punch"};
		naturalMoves = new String[]{};
	}
		Geodude(){

		super();
		}
}