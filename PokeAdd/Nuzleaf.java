public class Nuzleaf extends Pokemon{
	{
		name = "Nuzleaf";
		bHP = 7;
		bAtk = 7;
		bDef = 4;
		bSpAtk = 6;
		bSpDef = 4;
		bSpd = 6;
		type1 = "Grass";
		type2 = "Dark";
		abilities = new String[]{"Chlorophyll", "Early Bird", "Pickpocket", "Omen", "Intimidate"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Seedot();
		prevReq = 15;
		next = new String[]{"Shiftry"};
		nextReq = new String[]{"25"};
		height = "3\'/3\"";
		weight = 61.7;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Plant";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Darkvision"};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 1;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 6, 9, 12, 16, 20, 24, 28, 32, 36};
		moves = new String[]{"Harden", "Growth", "Torment", "Fake Out", "Nature Power", "Razor Wind", "Feint Attack", "Leaf Blade", "Swagger", "Extrasensory"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Solar Beam", "Return", "Shadow Ball", "Brick Break", "Double Team", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Energy Ball", "False Swipe", "Fling", "Embargo", "Explosion", "Payback", "Swords Dance", "Psych Up", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Snarl", "Nature Power", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Bullet Seed", "Defense Curl", "Defog", "Foul Play", "Fury Cutter", "Giga Drain", "Low Kick", "Mega Kick", "Rollout", "Seed Bomb", "Snore", "Spite", "Swift", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Nuzleaf(){

		super();
		}
}