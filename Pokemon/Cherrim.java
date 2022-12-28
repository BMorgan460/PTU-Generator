public class Cherrim extends Pokemon{
	{
		name = "Cherrim";
		bHP = 7;
		bAtk = 6;
		bDef = 7;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 9;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Flower Gift", "Chlorophyll", "Flower Power", "Sun Blanket", "Drought"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Cherubi();
		prevReq = 25;
		height = "1\'/8\"";
		size = "Small";
		weight = 20.5;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Fairy";
		egg2 = "Plant";
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Bloom"};
		athl = 3;
		acro = 3;
		combat = 2;
		stealth = 4;
		percep = 3;
		focus = 5;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{7, 10, 13, 19, 22, 30, 35, 43, 48, 50};
		moves = new String[]{"Growth", "Leech Seed", "Helping Hand", "Magical Leaf", "Sunny Day", "Worry Seed", "Take Down", "Solar Beam", "Lucky Chant", "Petal Blizzard"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Giga Impact", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Bullet Seed", "Giga Drain", "Helping Hand", "Laser Focus", "Natural Gift", "Rollout", "Seed Bomb", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Cherrim(){

		super();
		}
}