public class Gloom extends Pokemon{
	{
		name = "Gloom";
		bHP = 6;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 4;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Effect Spore", "Run Away", "Stench", "Oblivious", "Life Force"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Oddish();
		prevReq = 20;
		next = new String[]{"Vileplume"};
		nextReq = new String[]{"30"};
		height = "2\'/7\"";
		size = "Small";
		weight = 19;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "Phototroph";
		habitats = new String[]{"Forest", "Grassland", "Marsh"};
		overland = 5;
		swim = 2;
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
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{5, 9, 13, 14, 15, 19, 24, 29, 34, 39, 44, 49, 54, 59};
		moves = new String[]{"Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "Mega Drain", "Lucky Chant", "Moonlight", "Giga Drain", "Toxic", "Natural Gift", "Petal Blizzard", "Grassy Terrain", "Petal Dance"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Fling", "Swords Dance", "Infestation", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"After You", "Bullet Seed", "Drain Punch", "Gastro Acid", "Acid", "Giga Drain", "Nature Power", "Secret Power", "Seed Bomb", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Gloom(){

		super();
		}
}