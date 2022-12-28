public class Parasect extends Pokemon{
	{
		name = "Parasect";
		bHP = 6;
		bAtk = 10;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 8;
		bSpd = 3;
		type1 = "Bug";
		type2 = "Grass";
		abilities = new String[]{"Dry Skin", "Tochukaso", "Effect Spore", "Dire Spore", "Damp"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Paras();
		prevReq = 20;
		height = "3\'/3\"";
		weight = 65;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Plant";
		overland = 6;
		swim = 2;
		levitate = 0;
		burrow = 3;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Darkvision","Mushroom Harvest","Planter","Wallclimber"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 1;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 6, 11, 17, 22, 29, 37, 44, 51, 59, 66};
		moves = new String[]{"Poison Powder", "Stun Spore", "Absorb", "Fury Cutter", "Spore", "Slash", "Growth", "Giga Drain", "Aromatherapy", "Rage Powder", "XScissor"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Frustration", "Solar Beam", "Return", "Leech Life", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "False Swipe", "Giga Impact", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"After You", "Body Slam", "Slam", "Bug Bite", "Bite", "Bullet Seed", "Counter", "Cross Poison", "Fury Cutter", "Giga Drain", "Knock Off", "Seed Bomb", "Snore", "String Shot", "Synthesis", "Throat Chop", "Worry Seed"};
		naturalMoves = new String[]{"Cross Poison"};
	}
		Parasect(){

		super();
		}
}