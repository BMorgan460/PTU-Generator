public class Ninjask extends Pokemon{
	{
		name = "Ninjask";
		bHP = 6;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 16;
		type1 = "Bug";
		type2 = "Flying";
		abilities = new String[]{"Speed Boost", "Infiltrator", "Rocket", "Blur", "Vanguard"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Nincada();
		prevReq = 20;
		height = "2\'/7\"";
		size = "Small";
		weight = 26.5;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 3;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 1;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Wallclimber"};
		athl = 3;
		acro = 5;
		combat = 4;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 3;
		acroBonus = 3;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 23, 29, 35, 41, 47};
		moves = new String[]{"Absorb", "Sand Attack", "Fury Swipes", "Agility", "Slash", "Mind Reader", "Baton Pass", "Swords Dance", "XScissor"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Leech Life", "Shadow Ball", "Double Team", "Sandstorm", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "False Swipe", "Giga Impact", "Swords Dance", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Defog", "Fury Cutter", "Giga Drain", "Laser Focus", "Ominous Wind", "Silver Wind", "Snore", "Spite", "String Shot", "Swift", "Uproar"};
		naturalMoves = new String[]{"Bug Bite", "Bite"};
	}
		Ninjask(){

		super();
		}
}