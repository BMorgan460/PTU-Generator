public class Golisopod extends Pokemon{
	{
		name = "Golisopod";
		bHP = 8;
		bAtk = 13;
		bDef = 14;
		bSpAtk = 6;
		bSpDef = 9;
		bSpd = 4;
		type1 = "Bug";
		type2 = "Water";
		abilities = new String[]{"Emergency Exit", "Shell Armor", "Poison Point", "Damp", "Tough Claws"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Wimpod();
		prevReq = 30;
		height = "6\'/7\"";
		size = "Large";
		weight = 238.1;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Water";
		overland = 7;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 8;
		underdog = false;
		other = new String[]{"Gilled"};
		athl = 4;
		acro = 3;
		combat = 5;
		stealth = 3;
		percep = 4;
		focus = 5;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{4, 7, 10, 13, 16, 21, 26, 31, 36, 41, 48};
		moves = new String[]{"Fury Cutter", "Rock Smash", "Bug Bite", "Spite", "Swords Dance", "Slash", "Razor Shell", "Sucker Punch", "Iron Defense", "Pin Missile", "Liquidation"};
		TMs = new String[]{"Toxic", "Hail", "Bulk Up", "Venoshock", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Return", "Leech Life", "Brick Break", "Double Team", "Sludge", "Sludge Wave", "Sludge", "Sludge Bomb", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Focus Blast", "False Swipe", "Scald", "Fling", "Shadow Claw", "Payback", "Giga Impact", "Swords Dance", "Psych Up", "Frost Breath", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Surf", "Snarl", "Dark Pulse", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Drill Run", "Dual Chop", "Endeavor", "Icy Wind", "Iron Defense", "Iron Head", "Iron Tail", "Knock Off", "Laser Focus", "Liquidation", "Pain Split", "Snore", "Spite", "Throat Chop", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Golisopod(){

		super();
		}
}