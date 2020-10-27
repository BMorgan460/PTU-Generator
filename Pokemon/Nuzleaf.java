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
		abilities = new String[]{"Frighten", "Early Bird", "Pickpocket", "Grass Pelt", "Intimidate"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Seedot();
		prevReq = 15;
		next = new String[]{"Shiftry"};
		nextReq = new String[]{"Stone"};
		height = "3\'/3\"";
		weight = 61.7;
		WC = 3;
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
		natureWalk = new String[]{"Grassland", "Forest"};
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
		movesLevels = new int[]{3, 6, 9, 12, 14, 16, 20, 24, 28, 32, 36};
		moves = new String[]{"Harden", "Growth", "Nature Power", "Fake Out", "Razor Leaf", "Torment", "Razor Wind", "Feint Attack", "Leaf Blade", "Swagger", "Extrasensory"};
		TMs = new String[]{"Cut", "Strength", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Solar Beam", "Return", "Dig", "Shadow Ball", "Brick Break", "Double Team", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Energy Ball", "False Swipe", "Fling", "Embargo", "Explosion", "Payback", "Retaliate", "Flash", "Swords Dance", "Psych Up", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Snarl", "Nature Power", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Bullet Seed", "Dark Pulse", "Defense Curl", "Foul Play", "Fury Cutter", "Giga Drain", "Low Kick", "Mega Kick", "Razor Leaf", "Rollout", "Seed Bomb", "Sleep Talk", "Snore", "Spite", "Swift", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Nuzleaf(){

		super();
		}
}