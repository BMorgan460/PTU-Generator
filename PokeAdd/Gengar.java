public class Gengar extends Pokemon{
	{
		name = "Gengar";
		bHP = 6;
		bAtk = 7;
		bDef = 6;
		bSpAtk = 13;
		bSpDef = 8;
		bSpd = 11;
		type1 = "Ghost";
		type2 = "Poison";
		abilities = new String[]{"Levitate", "Frighten", "Intimidate", "Spiteful Intervention", "Soulstealer"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Haunter();
		prevReq = 35;
		height = "4\'/11\"";
		weight = 89.3;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Nullivore";
		habitats = new String[]{"Urban"};
		overland = 5;
		swim = 3;
		levitate = 5;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 4;
		underdog = false;
		other = new String[]{"Darkvision","Dead Silent","Invisibility","Invisibility","Phasing"};
		athl = 2;
		acro = 4;
		combat = 4;
		stealth = 5;
		percep = 3;
		focus = 4;
		athlBonus = 0;
		acroBonus = 3;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 28, 33, 39, 44, 50, 55, 61};
		moves = new String[]{"Spite", "Mean Look", "Curse", "Night Shade", "Confuse Ray", "Sucker Punch", "Payback", "Shadow Ball", "Dream Eater", "Dark Pulse", "Destiny Bond", "Hex", "Nightmare"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Psychic", "Shadow Ball", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Focus Blast", "Energy Ball", "Fling", "Embargo", "Explosion", "Shadow Claw", "Payback", "Giga Impact", "Psych Up", "Infestation", "Poison Jab", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dark Pulse", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Body Slam", "Slam", "Counter", "Drain Punch", "Dynamic Punch", "Fire Punch", "Focus Punch", "Foul Play", "Giga Drain", "Ice Punch", "Icy Wind", "Knock Off", "Laser Focus", "Mega Kick", "Mega Punch", "Metronome", "Ominous Wind", "Pain Split", "Role Play", "Seismic Toss", "Shadow Punch", "Skill Swap", "Snatch", "Snore", "Spite", "Sucker Punch", "Telekinesis", "Thunder Punch", "Trick", "Uproar", "Wonder Room"};
		naturalMoves = new String[]{"Shadow Punch"};
	}
		Gengar(){

		super();
		}
}