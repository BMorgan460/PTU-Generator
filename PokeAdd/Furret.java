public class Furret extends Pokemon{
	{
		name = "Furret";
		bHP = 9;
		bAtk = 8;
		bDef = 6;
		bSpAtk = 5;
		bSpDef = 9;
		bSpd = 6;
		type1 = "Normal";
		type2 = "";
		abilities = new String[]{"Run Away", "Keen Eye", "Frisk", "Nimble Strikes", "Dodge"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Sentret();
		prevReq = 15;
		height = "5\'/11\"";
		weight = 71.7;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Tracker"};
		athl = 3;
		acro = 4;
		combat = 2;
		stealth = 4;
		percep = 6;
		focus = 2;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 13, 17, 21, 28, 32, 36, 42, 46, 50, 56};
		moves = new String[]{"Defense Curl", "Quick Attack", "Fury Swipes", "Helping Hand", "Follow Me", "Slam", "Rest", "Sucker Punch", "Amnesia", "Baton Pass", "Me First", "Hyper Voice"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Thunderbolt", "Thunder", "Return", "Shadow Ball", "Brick Break", "Double Team", "Flamethrower", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Focus Blast", "Fling", "Charge", "Charge Beam", "Brutal Swing", "Shadow Claw", "Giga Impact", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Surf", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Body Slam", "Slam", "Covet", "Defense Curl", "Dynamic Punch", "Fire Punch", "Focus Punch", "Fury Cutter", "Helping Hand", "Hyper Voice", "Ice Punch", "Iron Tail", "Knock Off", "Last Resort", "Rollout", "Shock Wave", "Snore", "Sucker Punch", "Super Fang", "Swift", "Thunder Punch", "Trick", "Water Pulse", "Uproar"};
		naturalMoves = new String[]{"Slam", "Coil"};
	}
		Furret(){

		super();
		}
}