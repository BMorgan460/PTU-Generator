public class Steenee extends Pokemon{
	{
		name = "Steenee";
		bHP = 5;
		bAtk = 4;
		bDef = 5;
		bSpAtk = 4;
		bSpDef = 5;
		bSpd = 6;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Oblivious", "Sweet Veil", "Leaf Guard", "Run Away", "Chlorophyll"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Bounsweet();
		prevReq = 15;
		next = new String[]{"Tsareena"};
		nextReq = new String[]{"30"};
		height = "2\'/4\"";
		size = "Small";
		weight = 18.1;
		WC = 1;
		maleRatio = 0.0;
		femaleRatio = 100.0;
		egg1 = "Plant";
		egg2 = "Phototroph";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 3;
		natureWalk = new String[]{"Forest"};
		underdog = true;
		other = new String[]{"Alluring"};
		athl = 2;
		acro = 4;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Play Nice", "Rapid Spin", "Razor Leaf", "Sweet Scent", "Magical Leaf", "Teeter Dance", "Stomp", "Aromatic Mist", "Captivate", "Aromatherapy", "Leaf Storm"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Safeguard", "Frustration", "Return", "Double Team", "Reflect", "Facade", "Rest", "Attract", "Low Sweep", "Round", "Energy Ball", "Fling", "Payback", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Bounce", "Covet", "Endeavor", "Giga Drain", "Helping Hand", "Knock Off", "Seed Bomb", "Snore", "Synthesis", "Worry Seed", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Steenee(){

		super();
		}
}