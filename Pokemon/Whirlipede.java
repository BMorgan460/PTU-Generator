public class Whirlipede extends Pokemon{
	{
		name = "Whirlipede";
		bHP = 4;
		bAtk = 6;
		bDef = 10;
		bSpAtk = 4;
		bSpDef = 8;
		bSpd = 5;
		type1 = "Bug";
		type2 = "Poison";
		abilities = new String[]{"Poison Point", "Vanguard", "Swarm", "Speed Boost", "Rock Head"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Venipede();
		prevReq = 15;
		next = new String[]{"Scolipede"};
		nextReq = new String[]{"30"};
		height = "3\'/11\"";
		weight = 129;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest"};
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 12, 15, 19, 23, 28, 32, 37, 41, 43, 46, 50};
		moves = new String[]{"Poison Sting", "Screech", "Pursuit", "Protect", "Poison Tail", "Bug Bite", "Venoshock", "Agility", "Steamroller", "Toxic", "Venom Drench", "Rock Climb", "DoubleEdge"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Payback", "Gyro Ball", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Endeavor", "Iron Defense", "Signal Beam", "Snore"};
		naturalMoves = new String[]{};
	}
		Whirlipede(){

		super();
		}
}