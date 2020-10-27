public class Bulbasaur extends Pokemon{
	{
		name = "Bulbasaur";
		bHP = 5;
		bAtk = 5;
		bDef = 5;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Chlorophyll", "Overgrow", "Confidence", "Discipline", "Empower"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Ivysaur", "Venusaur"};
		nextReq = new String[]{"30"};
		height = "2\'/4\"";
		size = "Small";
		weight = 15.2;
		WC = 1;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Plant";
		habitats = new String[]{"Forest", "Grassland", "Rainforest"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 2;
		power = 2;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 2;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{1, 3, 7, 9, 13, 13, 15, 19, 21, 25, 27, 31, 33, 37};
		moves = new String[]{"Tackle", "Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Sleep Powder", "Take Down", "Razor Leaf", "Sweet Scent", "Growth", "DoubleEdge", "Worry Seed", "Synthesis", "Seed Bomb"};
		TMs = new String[]{"Work Up", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Energy Ball", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		eggMoves = new String[]{"Amnesia", "Charm", "Curse", "Endure", "Giga Drain", "Grassy Terrain", "Ingrain", "Leaf Storm", "Light Screen", "Magical Leaf", "Nature Power", "Petal Dance", "Power Whip", "Safeguard", "Skull Bash", "Sludge"};
		tutorMoves = new String[]{"Bind", "Body Slam", "Slam", "Bullet Seed", "Defense Curl", "Fury Cutter", "Giga Drain", "Grass Pledge", "Knock Off", "Natural Gift", "Secret Power", "Seed Bomb", "Snore", "String Shot", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Bulbasaur(){

		super();
		}
}