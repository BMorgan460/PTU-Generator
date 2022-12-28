public class Lairon extends Pokemon{
	{
		name = "Lairon";
		bHP = 6;
		bAtk = 9;
		bDef = 14;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 4;
		type1 = "Steel";
		type2 = "Rock";
		abilities = new String[]{"Bulletproof", "Sturdy", "Rock Head", "Solid Rock", "Heavy Metal"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Aron();
		prevReq = 30;
		next = new String[]{"Aggron"};
		nextReq = new String[]{"40"};
		height = "2\'/11\"";
		weight = 264.6;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Terravore";
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 9;
		natureWalk = new String[]{"Cave"};
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 1;
		combat = 3;
		stealth = 1;
		percep = 3;
		focus = 3;
		athlBonus = 3;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 35, 39, 43, 47, 51, 55};
		moves = new String[]{"MudSlap", "Headbutt", "Metal Claw", "Rock Tomb", "Protect", "Roar", "Iron Head", "Rock Slide", "Take Down", "Metal Sound", "Iron Tail", "Iron Defense", "DoubleEdge", "Autotomize", "Heavy Slam", "Metal Burst"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Shadow Claw", "Rock Polish", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Defense Curl", "Earth Power", "Endeavor", "Fury Cutter", "Iron Defense", "Iron Head", "Iron Tail", "Magnet Rise", "Rollout", "Shock Wave", "Snore", "Spite", "Stealth Rock", "Stomping Tantrum", "Superpower", "Uproar", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Lairon(){

		super();
		}
}