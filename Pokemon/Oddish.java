public class Oddish extends Pokemon{
	{
		name = "Oddish";
		bHP = 5;
		bAtk = 5;
		bDef = 6;
		bSpAtk = 8;
		bSpDef = 7;
		bSpd = 3;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Chlorophyll", "Run Away", "Adaptability", "Oblivious", "Life Force"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Gloom", "Vileplume"};
		nextReq = new String[]{"30"};
		height = "1\'/8\"";
		size = "Small";
		weight = 11.9;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "";
		habitats = new String[]{"Forest", "Grassland", "Marsh"};
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 1;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 2;
		combat = 1;
		stealth = 4;
		percep = 2;
		focus = 2;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 5, 9, 13, 14, 15, 19, 23, 27, 31, 35, 39, 43, 47, 51};
		moves = new String[]{"Absorb", "Growth", "Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "Mega Drain", "Lucky Chant", "Moonlight", "Giga Drain", "Toxic", "Natural Gift", "Moonblast", "Grassy Terrain", "Petal Dance"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Swords Dance", "Infestation", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Dazzling Gleam", "Confide"};
		eggMoves = new String[]{"After You", "Charm", "Flail", "Ingrain", "Nature Power", "Razor Leaf", "Secret Power", "Strength Sap", "Swords Dance", "Synthesis", "Teeter Dance", "Tickle"};
		tutorMoves = new String[]{"After You", "Bullet Seed", "Gastro Acid", "Acid", "Giga Drain", "Nature Power", "Secret Power", "Seed Bomb", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Oddish(){

		super();
		}
}