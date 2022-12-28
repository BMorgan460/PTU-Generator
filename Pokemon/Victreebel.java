public class Victreebel extends Pokemon{
	{
		name = "Victreebel";
		bHP = 8;
		bAtk = 11;
		bDef = 7;
		bSpAtk = 10;
		bSpDef = 7;
		bSpd = 7;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Dust Cloud", "Gluttony", "Chlorophyll", "Crush Trap", "Stench"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Weepinbell();
		prevReq = 30;
		height = "5\'/7\"";
		weight = 34.2;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "Phototroph";
		habitats = new String[]{"Forest", "Marsh", "Rainforest"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 3;
		percep = 3;
		focus = 4;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{7, 11, 13, 15, 17, 24, 29, 32, 39, 44, 47, 54, 58};
		moves = new String[]{"Growth", "Wrap", "Sleep Powder", "Poison Powder", "Stun Spore", "Acid", "Knock Off", "Leaf Storm", "Gastro Acid", "Leaf Blade", "Poison Jab", "Slam", "Wring Out"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Solar Beam", "Return", "Double Team", "Reflect", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Giga Impact", "Swords Dance", "Infestation", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Bind", "Bug Bite", "Bite", "Bullet Seed", "Gastro Acid", "Acid", "Giga Drain", "Knock Off", "Secret Power", "Seed Bomb", "Snore", "Spit Up", "Sucker Punch", "Sweet Scent", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{"Spit Up", "Stockpile", "Swallow", "Sweet Scent"};
	}
		Victreebel(){

		super();
		}
}