public class Lombre extends Pokemon{
	{
		name = "Lombre";
		bHP = 6;
		bAtk = 5;
		bDef = 5;
		bSpAtk = 6;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Water";
		type2 = "Grass";
		abilities = new String[]{"Swift Swim", "Rain Dish", "Own Tempo", "Hydration", "Confidence"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Lotad();
		prevReq = 15;
		next = new String[]{"Ludicolo"};
		nextReq = new String[]{"25"};
		height = "3\'/11\"";
		weight = 71.7;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Freshwater"};
		overland = 4;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Fountain"};
		athl = 3;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 6, 9, 12, 16, 20, 24, 28, 32, 36, 40, 44};
		moves = new String[]{"Growl", "Absorb", "Bubble", "Fury Swipes", "Fake Out", "Water Sport", "Bubble Beam", "Nature Power", "Uproar", "Knock Off", "Zen Headbutt", "Hydro Pump"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Return", "Brick Break", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Energy Ball", "Scald", "Fling", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Surf", "Nature Power", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Bullet Seed", "Dive", "Drain Punch", "Dynamic Punch", "Fire Punch", "Giga Drain", "Hyper Voice", "Ice Punch", "Icy Wind", "Knock Off", "Seed Bomb", "Snore", "Synthesis", "Thunder Punch", "Uproar", "Water Pulse", "Whirlpool", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Lombre(){

		super();
		}
}