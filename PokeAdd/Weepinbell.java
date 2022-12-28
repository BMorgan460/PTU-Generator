public class Weepinbell extends Pokemon{
	{
		name = "Weepinbell";
		bHP = 7;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 9;
		bSpDef = 5;
		bSpd = 6;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Dust Cloud", "Gluttony", "Chlorophyll", "Crush Trap", "Stench"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Bellsprout();
		prevReq = 20;
		next = new String[]{"Victreebel"};
		nextReq = new String[]{"30"};
		height = "3\'/3\"";
		weight = 14.1;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "Phototroph";
		habitats = new String[]{"Forest", "Marsh", "Rainforest"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{7, 11, 13, 15, 17, 24, 29, 32, 39, 44, 47, 54, 58};
		moves = new String[]{"Growth", "Wrap", "Sleep Powder", "Poison Powder", "Stun Spore", "Acid", "Knock Off", "Sweet Scent", "Gastro Acid", "Razor Leaf", "Poison Jab", "Slam", "Wring Out"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Solar Beam", "Return", "Double Team", "Reflect", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Swords Dance", "Infestation", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Bind", "Bug Bite", "Bite", "Bullet Seed", "Gastro Acid", "Acid", "Giga Drain", "Knock Off", "Secret Power", "Seed Bomb", "Snore", "Sucker Punch", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Weepinbell(){

		super();
		}
}