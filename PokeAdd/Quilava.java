public class Quilava extends Pokemon{
	{
		name = "Quilava";
		bHP = 6;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 8;
		bSpDef = 7;
		bSpd = 8;
		type1 = "Fire";
		type2 = "";
		abilities = new String[]{"Blaze", "Flame Body", "Run Away", "Celebrate", "Flash Fire"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Cyndaquil();
		prevReq = 15;
		next = new String[]{"Typhlosion"};
		nextReq = new String[]{"30"};
		height = "2\'/11\"";
		size = "Small";
		weight = 41.9;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Carnivore";
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 3;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Grassland"};
		underdog = true;
		other = new String[]{"Firestarter","Heater","Glow"};
		athl = 4;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 3;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 10, 13, 20, 24, 31, 35, 42, 46, 53, 57, 64, 68, 75};
		moves = new String[]{"Smokescreen", "Ember", "Quick Attack", "Flame Wheel", "Defense Curl", "Flame Charge", "Swift", "Lava Plume", "Flamethrower", "Inferno", "Rollout", "DoubleEdge", "Burn Up", "Eruption"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Overheat", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Covet", "Fire Pledge", "Focus Punch", "Fury Cutter", "Heat Wave", "Rollout", "Snore", "Swift"};
		naturalMoves = new String[]{};
	}
		Quilava(){

		super();
		}
}