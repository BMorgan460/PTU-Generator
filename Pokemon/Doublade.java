public class Doublade extends Pokemon{
	{
		name = "Doublade";
		bHP = 6;
		bAtk = 11;
		bDef = 15;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 4;
		type1 = "Steel";
		type2 = "Ghost";
		abilities = new String[]{"No Guard", "Hyper Cutter", "Stall", "Weaponize", "Soulstealer"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Honedge();
		prevReq = 35;
		next = new String[]{"Aegislash"};
		nextReq = new String[]{"Stone"};
		height = "2\'/07\"";
		size = "Small";
		weight = 9.9;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Mineral";
		egg2 = "Nullivore";
		overland = 1;
		swim = 2;
		levitate = 6;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 2;
		underdog = false;
		other = new String[]{"Phasing","Invisibility","Invisibility","Dead Silent"};
		athl = 2;
		acro = 3;
		combat = 5;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 5, 8, 13, 18, 20, 22, 26, 29, 32, 36, 41, 45, 51};
		moves = new String[]{"Tackle", "Swords Dance", "Fury Cutter", "Metal Sound", "Pursuit", "Autotomize", "Shadow Sneak", "Aerial Ace", "Retaliate", "Slash", "Iron Defense", "Night Slash", "Power Trick", "Iron Head", "Sacred Sword"};
		TMs = new String[]{"Cut", "Toxic", "Hidden Power", "Protect", "Rain Dance", "Frustration", "Return", "Brick Break", "Double Team", "Reflect", "Aerial Ace", "Facade", "Rest", "Attract", "False Swipe", "Shadow Claw", "Retaliate", "Gyro Ball", "Swords Dance", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"After You", "Iron Defense", "Iron Head", "Magnet Rise", "Shock Wave", "Snore", "Spite"};
		naturalMoves = new String[]{};
	}
		Doublade(){

		super();
		}
}