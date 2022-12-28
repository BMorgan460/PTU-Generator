public class Monferno extends Pokemon{
	{
		name = "Monferno";
		bHP = 6;
		bAtk = 8;
		bDef = 5;
		bSpAtk = 8;
		bSpDef = 5;
		bSpd = 8;
		type1 = "Fire";
		type2 = "Fighting";
		abilities = new String[]{"Blaze", "Pickup", "Decoy", "Iron Fist", "Celebrate"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Chimchar();
		prevReq = 15;
		next = new String[]{"Infernape"};
		nextReq = new String[]{"30"};
		height = "2\'/11\"";
		size = "Small";
		weight = 48.5;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Humanshape";
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 5;
		natureWalk = new String[]{"Forest", "Mountain"};
		underdog = true;
		other = new String[]{"Firestarter","Glow","Heater"};
		athl = 4;
		acro = 4;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 2;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 3;
		focusBonus = 0;
		movesLevels = new int[]{7, 9, 16, 19, 26, 29, 36, 39, 46, 49, 56};
		moves = new String[]{"Ember", "Taunt", "Fury Swipes", "Flame Wheel", "Feint", "Torment", "Close Combat", "Fire Spin", "Acrobatics", "Slack Off", "Flare Blitz"};
		TMs = new String[]{"Work Up", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Frustration", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Aerial Ace", "Torment", "Facade", "Flame Charge", "Rest", "Attract", "Low Sweep", "Round", "Overheat", "Focus Blast", "Fling", "Acrobatics", "Shadow Claw", "Swords Dance", "Rock Slide", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Covet", "Dual Chop", "Endeavor", "Fire Pledge", "Fire Punch", "Focus Punch", "Gunk Shot", "Heat Wave", "Helping Hand", "Iron Tail", "Low Kick", "Rock Climb", "Role Play", "Rollout", "Snore", "Stealth Rock", "Swift", "Thunder Punch", "Uproar", "Vacuum Wave"};
		naturalMoves = new String[]{};
	}
		Monferno(){

		super();
		}
}