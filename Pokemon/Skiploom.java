public class Skiploom extends Pokemon{
	{
		name = "Skiploom";
		bHP = 6;
		bAtk = 5;
		bDef = 5;
		bSpAtk = 5;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Grass";
		type2 = "Flying";
		abilities = new String[]{"Infiltrator", "Windveiled", "Chlorophyll", "Leaf Guard", "Flutter"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Hoppip();
		prevReq = 15;
		next = new String[]{"Jumpluff"};
		nextReq = new String[]{"30"};
		height = "2\'/0\"";
		size = "Small";
		weight = 2.2;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Fairy";
		egg2 = "Plant";
		overland = 3;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 2;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 6, 8, 10, 12, 14, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60};
		moves = new String[]{"Synthesis", "Tail Whip", "Tackle", "Fairy Wind", "Poison Powder", "Stun Spore", "Sleep Powder", "Bullet Seed", "Leech Seed", "Mega Drain", "Acrobatics", "Rage Powder", "Cotton Spore", "Uturn", "Worry Seed", "Giga Drain", "Bounce", "Memento"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Solar Beam", "Return", "Double Team", "Reflect", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Acrobatics", "Swords Dance", "Psych Up", "Infestation", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Bounce", "Bullet Seed", "Defense Curl", "Giga Drain", "Helping Hand", "Seed Bomb", "Silver Wind", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Skiploom(){

		super();
		}
}