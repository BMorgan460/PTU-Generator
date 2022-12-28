public class Grotle extends Pokemon{
	{
		name = "Grotle";
		bHP = 8;
		bAtk = 9;
		bDef = 9;
		bSpAtk = 6;
		bSpDef = 7;
		bSpd = 4;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Shell Armor", "Overgrow", "Grass Pelt", "Sturdy", "Natural Cure"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Turtwig();
		prevReq = 15;
		next = new String[]{"Torterra"};
		nextReq = new String[]{"30"};
		height = "3\'/7\"";
		weight = 213.8;
		WC = 4;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Plant";
		habitats = new String[]{"Forest", "Marsh", "Rainforest"};
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 22, 27, 32, 37, 42, 47, 52};
		moves = new String[]{"Withdraw", "Absorb", "Razor Leaf", "Curse", "Bite", "Mega Drain", "Leech Seed", "Synthesis", "Crunch", "Giga Drain", "Leaf Storm"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Reflect", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Bullet Seed", "Earth Power", "Giga Drain", "Grass Pledge", "Iron Tail", "Natural Gift", "Rock Climb", "Secret Power", "Seed Bomb", "Snore", "Stealth Rock", "Superpower", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Grotle(){

		super();
		}
}