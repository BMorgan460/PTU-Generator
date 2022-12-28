public class Scolipede extends Pokemon{
	{
		name = "Scolipede";
		bHP = 6;
		bAtk = 10;
		bDef = 9;
		bSpAtk = 6;
		bSpDef = 7;
		bSpd = 11;
		type1 = "Bug";
		type2 = "Poison";
		abilities = new String[]{"Poison Point", "Vanguard", "Swarm", "Speed Boost", "Rock Head"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Whirlipede();
		prevReq = 30;
		height = "8\'/2\"";
		size = "Large";
		weight = 442;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest"};
		overland = 8;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = false;
		other = new String[]{"Mountable 1","Wallclimber"};
		athl = 4;
		acro = 3;
		combat = 4;
		stealth = 3;
		percep = 4;
		focus = 4;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 12, 15, 19, 23, 28, 32, 39, 44, 47, 50, 55, 65};
		moves = new String[]{"Poison Sting", "Screech", "Pursuit", "Protect", "Poison Tail", "Bug Bite", "Venoshock", "Agility", "Steamroller", "Toxic", "Venom Drench", "Rock Climb", "DoubleEdge", "Megahorn"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Solar Beam", "Earthquake", "Return", "Double Team", "Sludge", "Sludge Bomb", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Payback", "Smart Strike", "Giga Impact", "Gyro Ball", "Swords Dance", "Bulldoze", "Rock Slide", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Bug Bite", "Bite", "Endeavor", "Iron Defense", "Iron Tail", "Signal Beam", "Snatch", "Snore", "Stomping Tantrum", "Superpower", "Throat Chop"};
		naturalMoves = new String[]{"Iron Defense", "Megahorn"};
	}
		Scolipede(){

		super();
		}
}