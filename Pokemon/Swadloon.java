public class Swadloon extends Pokemon{
	{
		name = "Swadloon";
		bHP = 6;
		bAtk = 6;
		bDef = 9;
		bSpAtk = 5;
		bSpDef = 8;
		bSpd = 4;
		type1 = "Bug";
		type2 = "Grass";
		abilities = new String[]{"Designer", "Full Guard", "Leafy Cloak", "Swarm", "Leaf Rush"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Sewaddle();
		prevReq = 15;
		next = new String[]{"Leavanny"};
		nextReq = new String[]{"30"};
		height = "1\'/8\"";
		size = "Small";
		weight = 16.1;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "";
		habitats = new String[]{"Forest"};
		overland = 3;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Threaded","Wallclimber"};
		athl = 2;
		acro = 2;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{20};
		moves = new String[]{"Protect"};
		TMs = new String[]{"Cut", "Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Payback", "Flash", "Struggle Bug", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Electroweb", "Giga Drain", "Iron Defense", "Magic Coat", "Razor Leaf", "Seed Bomb", "Signal Beam", "Sleep Talk", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Swadloon(){

		super();
		}
}