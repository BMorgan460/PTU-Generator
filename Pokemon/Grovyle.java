public class Grovyle extends Pokemon{
	{
		name = "Grovyle";
		bHP = 5;
		bAtk = 7;
		bDef = 5;
		bSpAtk = 9;
		bSpDef = 6;
		bSpd = 7;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Unburden", "Overgrow", "Run Away", "Vanguard", "Ambush"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Treecko();
		prevReq = 15;
		next = new String[]{"Sceptile"};
		nextReq = new String[]{"30"};
		height = "2\'/11\"";
		weight = 47.6;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Dragon";
		habitats = new String[]{"Rainforest"};
		overland = 8;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 3;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Wallclimber"};
		athl = 4;
		acro = 4;
		combat = 3;
		stealth = 5;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 3;
		combatBonus = 2;
		stealthBonus = 3;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 5, 9, 13, 18, 23, 28, 33, 38, 43, 48, 53, 58, 63};
		moves = new String[]{"Leer", "Absorb", "Quick Attack", "Mega Drain", "Pursuit", "Leaf Blade", "Agility", "Slam", "Detect", "XScissor", "False Swipe", "Quick Guard", "Leaf Storm", "Screech"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Brick Break", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Low Sweep", "Round", "Energy Ball", "False Swipe", "Fling", "Acrobatics", "Swords Dance", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Bullet Seed", "Counter", "Drain Punch", "Dynamic Punch", "Endeavor", "Focus Punch", "Fury Cutter", "Giga Drain", "Grass Pledge", "Iron Tail", "Low Kick", "Mega Kick", "Mega Punch", "Secret Power", "Seed Bomb", "Seismic Toss", "Snore", "Swift", "Synthesis", "Thunder Punch", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Grovyle(){

		super();
		}
}