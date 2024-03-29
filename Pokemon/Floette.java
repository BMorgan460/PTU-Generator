public class Floette extends Pokemon{
	{
		name = "Floette";
		bHP = 5;
		bAtk = 5;
		bDef = 5;
		bSpAtk = 8;
		bSpDef = 10;
		bSpd = 5;
		type1 = "Fairy";
		type2 = "";
		abilities = new String[]{"Flower Power", "Flower Veil", "Overgrow", "Perception", "Symbiosis"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Flabebe();
		prevReq = 15;
		next = new String[]{"Florges"};
		nextReq = new String[]{"30"};
		height = "0\'/8\"";
		size = "Small";
		weight = 2;
		WC = 1;
		maleRatio = 0.0;
		femaleRatio = 100.0;
		egg1 = "Fairy";
		egg2 = "Herbivore";
		overland = 2;
		swim = 2;
		levitate = 6;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 1;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Alluring"};
		athl = 2;
		acro = 4;
		combat = 1;
		stealth = 3;
		percep = 3;
		focus = 4;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{6, 10, 15, 20, 25, 27, 33, 38, 43, 46, 51, 58};
		moves = new String[]{"Fairy Wind", "Lucky Chant", "Razor Leaf", "Wish", "Magical Leaf", "Grassy Terrain", "Petal Blizzard", "Aromatherapy", "Misty Terrain", "Moonblast", "Petal Dance", "Solar Beam"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Energy Ball", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"After You", "Ally Switch", "Covet", "Endeavor", "Giga Drain", "Heal Bell", "Helping Hand", "Magic Coat", "Seed Bomb", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Floette(){

		super();
		}
}