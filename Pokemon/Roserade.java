public class Roserade extends Pokemon{
	{
		name = "Roserade";
		bHP = 6;
		bAtk = 7;
		bDef = 6;
		bSpAtk = 13;
		bSpDef = 11;
		bSpd = 9;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Poison Point", "Natural Cure", "Leaf Guard", "Beautiful", "Technician"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Roselia();
		prevReq = 30;
		height = "2\'/11\"";
		size = "Small";
		weight = 32;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Fairy";
		egg2 = "Plant";
		habitats = new String[]{"Forest", "Grassland", "Rainforest"};
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 4;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = false;
		other = new String[]{};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 3;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 50};
		moves = new String[]{"Growth", "Poison Sting", "Stun Spore", "Mega Drain", "Leech Seed", "Magical Leaf", "Grass", "Giga Drain", "Toxic Spikes", "Sweet Scent", "Ingrain", "Petal Blizzard", "Toxic", "Aromatherapy", "Synthesis", "Petal Dance"};
		TMs = new String[]{"Cut", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Return", "Shadow Ball", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Giga Impact", "Flash", "Swords Dance", "Psych Up", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Dazzling Gleam"};
		tutorMoves = new String[]{"Covet", "Body Slam", "Slam", "Bullet Seed", "Fury Cutter", "Giga Drain", "Grassy Terrain", "Natural Gift", "Seed Bomb", "Sleep Talk", "Snore", "Swift", "Synthesis", "Uproar", "Venom Drench", "Worry Seed"};
		naturalMoves = new String[]{"Grassy Terrain", "Venom Drench"};
	}
		Roserade(){

		super();
		}
}