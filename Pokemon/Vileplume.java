public class Vileplume extends Pokemon{
	{
		name = "Vileplume";
		bHP = 8;
		bAtk = 8;
		bDef = 9;
		bSpAtk = 11;
		bSpDef = 9;
		bSpd = 5;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Effect Spore", "Hay Fever", "Stench", "Dust Cloud", "Life Force"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Gloom();
		prevReq = 30;
		height = "3\'/11\"";
		weight = 41;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "Phototroph";
		habitats = new String[]{"Forest", "Grassland", "Marsh"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 4;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 3;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{5, 9, 13, 14, 15, 19, 24, 29, 34, 39, 44, 49, 54, 59, 69};
		moves = new String[]{"Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "Mega Drain", "Lucky Chant", "Moonlight", "Giga Drain", "Toxic", "Natural Gift", "Petal Blizzard", "Grassy Terrain", "Petal Dance", "Solar Beam"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Fling", "Giga Impact", "Swords Dance", "Infestation", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"After You", "Body Slam", "Slam", "Bullet Seed", "Drain Punch", "Gastro Acid", "Acid", "Giga Drain", "Nature Power", "Secret Power", "Seed Bomb", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{"Aromatherapy"};
	}
		Vileplume(){

		super();
		}
}