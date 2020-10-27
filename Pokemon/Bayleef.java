public class Bayleef extends Pokemon{
	{
		name = "Bayleef";
		bHP = 6;
		bAtk = 6;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Healer", "Overgrow", "Aroma Veil", "Leaf Guard", "Blessed Touch"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Chikorita();
		prevReq = 15;
		next = new String[]{"Meganium"};
		nextReq = new String[]{"30"};
		height = "3\'/11\"";
		weight = 34.8;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Plant";
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 4;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 6, 9, 12, 17, 20, 23, 28, 31, 34, 39, 42, 45};
		moves = new String[]{"Growl", "Razor Leaf", "Poison Powder", "Synthesis", "Reflect", "Magical Leaf", "Natural Gift", "Sweet Scent", "Light Screen", "Body Slam", "Safeguard", "Aromatherapy", "Solar Beam"};
		TMs = new String[]{"Cut", "Strength", "Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Reflect", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Energy Ball", "Flash", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Nature Power"};
		tutorMoves = new String[]{"Ancient Power", "Bullet Seed", "Counter", "Fury Cutter", "Giga Drain", "Grass Pledge", "Iron Tail", "Magic Coat", "Role Play", "Secret Power", "Seed Bomb", "Sleep Talk", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Bayleef(){

		super();
		}
}