public class Braviary extends Pokemon{
	{
		name = "Braviary";
		bHP = 10;
		bAtk = 12;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 8;
		bSpd = 8;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Sheer Force", "Defiant", "Courage", "Bodyguard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Rufflet();
		prevReq = 35;
		height = "4\'/11\"";
		size = "Large";
		weight = 90.4;
		WC = 3;
		maleRatio = 100.0;
		femaleRatio = 0.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 6;
		underdog = false;
		other = new String[]{};
		athl = 4;
		acro = 4;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 5;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 57, 63, 70};
		moves = new String[]{"Fury Attack", "Wing Attack", "Hone Claws", "Scary Face", "Aerial Ace", "Slash", "Defog", "Tailwind", "Air Slash", "Crush Claw", "Sky Drop", "Whirlwind", "Brave Bird", "Thrash"};
		TMs = new String[]{"Work Up", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Steel Wing", "Sky Drop", "Shadow Claw", "Giga Impact", "Fly", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Brave Bird", "Defog", "Heat Wave", "Laser Focus", "Pluck", "Snore", "Sky Attack", "Tailwind", "Whirlwind", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Brave Bird", "Superpower", "Tailwind", "Thrash"};
	}
		Braviary(){

		super();
		}
}