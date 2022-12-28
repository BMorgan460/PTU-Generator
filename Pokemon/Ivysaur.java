public class Ivysaur extends Pokemon{
	{
		name = "Ivysaur";
		bHP = 6;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 8;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Chlorophyll", "Overgrow", "Confidence", "Discipline", "Empower"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Bulbasaur();
		prevReq = 15;
		next = new String[]{"Venusaur"};
		nextReq = new String[]{"30"};
		height = "3\'/3\"";
		weight = 28.7;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Plant";
		habitats = new String[]{"Forest", "Grassland", "Rainforest"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 36, 39, 44};
		moves = new String[]{"Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Sleep Powder", "Take Down", "Razor Leaf", "Sweet Scent", "Growth", "DoubleEdge", "Worry Seed", "Synthesis", "Solar Beam"};
		TMs = new String[]{"Work Up", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Energy Ball", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Bind", "Body Slam", "Slam", "Bullet Seed", "Defense Curl", "Fury Cutter", "Giga Drain", "Grass Pledge", "Knock Off", "Natural Gift", "Secret Power", "Seed Bomb", "Snore", "String Shot", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Ivysaur(){

		super();
		}
}