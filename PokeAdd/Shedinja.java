public class Shedinja extends Pokemon{
	{
		name = "Shedinja";
		bHP = 0;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 3;
		bSpDef = 3;
		bSpd = 4;
		type1 = "Bug";
		type2 = "Ghost";
		abilities = new String[]{"Wonder Guard", "Dodge", "Magic Guard", "Wonder Skin", "Pressure"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Nincada();
		prevReq = 3;
		height = "2\'/7\"";
		size = "Small";
		weight = 2.6;
		WC = 1;
		maleRatio = -1;
		femaleRatio = -1;
		egg1 = "Mineral";
		egg2 = "Nullivore";
		overland = 3;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 1;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Darkvision","Dead Silent","Wallclimber"};
		athl = 2;
		acro = 4;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Absorb", "Sand Attack", "Fury Swipes", "Spite", "Shadow Sneak", "Mind Reader", "Confuse Ray", "Shadow Ball", "Grudge", "Heal Block", "Phantom Force"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Solar Beam", "Return", "Leech Life", "Shadow Ball", "Double Team", "Sandstorm", "Aerial Ace", "Facade", "Rest", "Thief", "Round", "False Swipe", "Shadow Claw", "Giga Impact", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Bug Bite", "Bite", "Fury Cutter", "Giga Drain", "Ominous Wind", "Snore", "Spite", "String Shot", "Sucker Punch", "Swift", "Telekinesis", "Trick"};
		naturalMoves = new String[]{};
	}
		Shedinja(){

		super();
		}
}