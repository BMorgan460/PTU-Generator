public class Haunter extends Pokemon{
	{
		name = "Haunter";
		bHP = 5;
		bAtk = 5;
		bDef = 5;
		bSpAtk = 12;
		bSpDef = 6;
		bSpd = 10;
		type1 = "Ghost";
		type2 = "Poison";
		abilities = new String[]{"Levitate", "Frighten", "Intimidate", "Spiteful Intervention", "Prankster"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Gastly();
		prevReq = 20;
		next = new String[]{"Gengar"};
		nextReq = new String[]{"35"};
		height = "5\'/3\"";
		weight = 0.2;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Nullivore";
		overland = 2;
		swim = 2;
		levitate = 4;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		underdog = true;
		other = new String[]{"Darkvision","Dead Silent","Invisibility","Invisibility","Phasing"};
		athl = 1;
		acro = 4;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 3;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 28, 33, 39, 44, 50, 55, 61};
		moves = new String[]{"Spite", "Mean Look", "Curse", "Night Shade", "Confuse Ray", "Sucker Punch", "Payback", "Shadow Ball", "Dream Eater", "Dark Pulse", "Destiny Bond", "Hex", "Nightmare"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Return", "Psychic", "Shadow Ball", "Double Team", "Sludge", "Sludge Bomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Fling", "Embargo", "Explosion", "Shadow Claw", "Payback", "Psych Up", "Infestation", "Poison Jab", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dark Pulse", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Fire Punch", "Foul Play", "Giga Drain", "Ice Punch", "Icy Wind", "Knock Off", "Ominous Wind", "Pain Split", "Skill Swap", "Snatch", "Snore", "Spite", "Sucker Punch", "Telekinesis", "Thunder Punch", "Trick", "Uproar", "Wonder Room"};
		naturalMoves = new String[]{};
	}
		Haunter(){

		super();
		}
}