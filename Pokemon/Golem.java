public class Golem extends Pokemon{
	{
		name = "Golem";
		bHP = 8;
		bAtk = 12;
		bDef = 13;
		bSpAtk = 6;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Rock";
		type2 = "Ground";
		abilities = new String[]{"Run Up", "Solid Rock", "Sturdy", "Bulletproof", "Rock Head"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Graveler();
		prevReq = 35;
		height = "4\'/7\"";
		weight = 661.4;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Mineral";
		egg2 = "Terravore";
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 10;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = false;
		other = new String[]{"Groundshaper","Volatile Bomb"};
		athl = 5;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 4;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{4, 6, 10, 12, 16, 18, 22, 24, 30, 34, 40, 44, 50, 54, 60};
		moves = new String[]{"Mud Sport", "Rock Polish", "Steamroller", "Magnitude", "Rock Throw", "Smack Down", "Bulldoze", "Self Destruct", "Stealth Rock", "Rock Blast", "Earthquake", "Explosion", "DoubleEdge", "Stone Edge", "Heavy Slam"};
		TMs = new String[]{"Strength", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Smack Down", "Earthquake", "Return", "Dig", "Brick Break", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Fling", "Incinerate", "Explosion", "Rock Polish", "Rock Polish", "Stone Edge", "Gyro Ball", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Block", "Body Slam", "Slam", "Counter", "Dynamic Punch", "Earth Power", "Fire Punch", "Focus Punch", "Fury Cutter", "Heavy Slam", "Iron Defense", "Iron Head", "Mega Kick", "Mega Punch", "Metronome", "Rollout", "Seismic Toss", "Sleep Talk", "Snore", "Stealth Rock", "Sucker Punch", "Superpower", "Thunder Punch"};
		naturalMoves = new String[]{"Heavy Slam", "Slam"};
	}
		Golem(){

		super();
		}
}