public class Gastly extends Pokemon{
	{
		name = "Gastly";
		bHP = 3;
		bAtk = 4;
		bDef = 3;
		bSpAtk = 10;
		bSpDef = 4;
		bSpd = 8;
		type1 = "Ghost";
		type2 = "Poison";
		abilities = new String[]{"Levitate", "Frighten", "Intimidate", "Spiteful Intervention", "Prankster"};
		abilityTypeCount = new int[] {1,3,1};
		next = new String[]{"Haunter", "Gengar"};
		nextReq = new String[]{"35"};
		height = "4\'/3\"";
		weight = 0.2;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "";
		overland = 1;
		swim = 2;
		levitate = 4;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		underdog = true;
		other = new String[]{"Darkvision","Dead Silent","Invisibility","Invisibility","Phasing"};
		athl = 1;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 2;
		athlBonus = 0;
		acroBonus = 3;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47};
		moves = new String[]{"Hypnosis", "Lick", "Spite", "Mean Look", "Curse", "Night Shade", "Confuse Ray", "Sucker Punch", "Payback", "Shadow Ball", "Dream Eater", "Dark Pulse", "Destiny Bond", "Hex", "Nightmare"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Return", "Psychic", "Shadow Ball", "Double Team", "Sludge", "Sludge Bomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Embargo", "Explosion", "Payback", "Psych Up", "Infestation", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dark Pulse", "Dazzling Gleam", "Confide"};
		eggMoves = new String[]{"Astonish", "Clear Smog", "Smog", "Disable", "Explosion", "Fire Punch", "Grudge", "Haze", "Ice Punch", "Perish Song", "Psywave", "Reflect Type", "Scary Face", "Smog", "Thunder Punch"};
		tutorMoves = new String[]{"Ally Switch", "Fire Punch", "Foul Play", "Giga Drain", "Ice Punch", "Icy Wind", "Knock Off", "Ominous Wind", "Pain Split", "Skill Swap", "Snatch", "Snore", "Spite", "Sucker Punch", "Telekinesis", "Thunder Punch", "Trick", "Uproar", "Wonder Room"};
		naturalMoves = new String[]{};
	}
		Gastly(){

		super();
		}
}