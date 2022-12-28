public class Venipede extends Pokemon{
	{
		name = "Venipede";
		bHP = 3;
		bAtk = 5;
		bDef = 6;
		bSpAtk = 3;
		bSpDef = 4;
		bSpd = 6;
		type1 = "Bug";
		type2 = "Poison";
		abilities = new String[]{"Poison Point", "Vanguard", "Swarm", "Speed Boost", "Rock Head"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Whirlipede", "Scolipede"};
		nextReq = new String[]{"30"};
		height = "1\'/4\"";
		size = "Small";
		weight = 11.7;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "";
		habitats = new String[]{"Forest"};
		overland = 5;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 1;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Wallclimber"};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 2;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 38, 40, 43};
		moves = new String[]{"Defense Curl", "Rollout", "Poison Sting", "Screech", "Pursuit", "Protect", "Poison Tail", "Bug Bite", "Venoshock", "Agility", "Steamroller", "Toxic", "Venom Drench", "Rock Climb", "DoubleEdge"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Payback", "Gyro Ball", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		eggMoves = new String[]{"Pin Missile", "Rock Climb", "Spikes", "Take Down", "Toxic Spikes", "Spikes", "Twineedle"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Endeavor", "Iron Defense", "Signal Beam", "Snore"};
		naturalMoves = new String[]{};
	}
		Venipede(){

		super();
		}
}