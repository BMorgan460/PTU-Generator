public class Venusaur extends Pokemon{
	{
		name = "Venusaur";
		bHP = 8;
		bAtk = 8;
		bDef = 8;
		bSpAtk = 10;
		bSpDef = 10;
		bSpd = 8;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Chlorophyll", "Overgrow", "Confidence", "Discipline", "Empower"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Ivysaur();
		prevReq = 30;
		height = "6\'/7\"";
		size = "Large";
		weight = 220.5;
		WC = 5;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Plant";
		habitats = new String[]{"Forest", "Grassland", "Rainforest"};
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 8;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = false;
		other = new String[]{"Alluring"};
		athl = 5;
		acro = 1;
		combat = 4;
		stealth = 1;
		percep = 2;
		focus = 5;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 3;
		movesLevels = new int[]{3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 39, 45, 50, 53};
		moves = new String[]{"Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Sleep Powder", "Take Down", "Razor Leaf", "Sweet Scent", "Growth", "DoubleEdge", "Worry Seed", "Synthesis", "Petal Blizzard", "Solar Beam"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Earthquake", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Energy Ball", "Giga Impact", "Swords Dance", "Bulldoze", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Bind", "Body Slam", "Slam", "Block", "Bullet Seed", "Defense Curl", "Frenzy Plant", "Fury Cutter", "Giga Drain", "Grass Pledge", "Knock Off", "Natural Gift", "Outrage", "Secret Power", "Seed Bomb", "Snore", "Stomping Tantrum", "String Shot", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Venusaur(){

		super();
		}
}