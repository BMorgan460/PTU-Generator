public class Quilladin extends Pokemon{
	{
		name = "Quilladin";
		bHP = 6;
		bAtk = 8;
		bDef = 10;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 6;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Bodyguard", "Overgrow", "Gentle Vibe", "Bulletproof", "Abominable"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Chespin();
		prevReq = 15;
		next = new String[]{"Chesnaught"};
		nextReq = new String[]{"30"};
		height = "2\'/04\"";
		size = "Small";
		weight = 63.9;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest", "Grassland", "Rainforest"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{1, 1, 5, 8, 15, 20, 26, 30, 35, 39, 44, 48, 52, 55};
		moves = new String[]{"Tackle", "Growl", "Vine Whip", "Rollout", "Leech Seed", "Pin Missile", "Needle Arm", "Take Down", "Seed Bomb", "Mud Shot", "Bulk Up", "Body Slam", "Pain Split", "Wood Hammer"};
		TMs = new String[]{"Cut", "Strength", "Hone Claws", "Roar", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Frustration", "Solar Beam", "Smack Down", "Return", "Dig", "Brick Break", "Double Team", "Reflect", "Sludge", "Sludge Bomb", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Low Sweep", "Round", "Energy Ball", "Fling", "Shadow Claw", "Payback", "Retaliate", "Flash", "Stone Edge", "Gyro Ball", "Swords Dance", "Bulldoze", "Rock Slide", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Drain Punch", "Dual Chop", "Endeavor", "Focus Punch", "Giga Drain", "Grass Pledge", "Helping Hand", "Iron Defense", "Iron Head", "Iron Tail", "Low Kick", "Pain Split", "Seed Bomb", "Snore", "Super Fang", "Superpower", "Synthesis", "Thunder Punch", "Worry Seed", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Quilladin(){

		super();
		}
}