public class Dusclops extends Pokemon{
	{
		name = "Dusclops";
		bHP = 4;
		bAtk = 7;
		bDef = 13;
		bSpAtk = 6;
		bSpDef = 13;
		bSpd = 3;
		type1 = "Ghost";
		type2 = "";
		abilities = new String[]{"Shackle", "Frighten", "Interference", "Frisk", "Pressure"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Duskull();
		prevReq = 25;
		next = new String[]{"Dusknoir"};
		nextReq = new String[]{"40"};
		height = "5\'/3\"";
		weight = 67.5;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Nullivore";
		habitats = new String[]{"Cave", "Forest", "Mountain"};
		overland = 6;
		swim = 2;
		levitate = 4;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		underdog = false;
		other = new String[]{"Darkvision","Dead Silent","Invisibility","Invisibility","Phasing"};
		athl = 2;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{6, 9, 14, 17, 22, 25, 30, 33, 40, 45, 52, 57, 64};
		moves = new String[]{"Disable", "Astonish", "Foresight", "Shadow Sneak", "Pursuit", "WillOWisp", "Confuse Ray", "Curse", "Hex", "Shadow Ball", "Mean Look", "Payback", "Future Sight"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Psychic", "Shadow Ball", "Brick Break", "Double Team", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Fling", "Charge", "Charge Beam", "Embargo", "Payback", "Giga Impact", "Psych Up", "Bulldoze", "Rock Slide", "Infestation", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Body Slam", "Slam", "Counter", "Dynamic Punch", "Fire Punch", "Focus Punch", "Future Sight", "Ice Punch", "Icy Wind", "Mega Kick", "Mega Punch", "Metronome", "Ominous Wind", "Pain Split", "Seismic Toss", "Skill Swap", "Snatch", "Snore", "Spite", "Sucker Punch", "Telekinesis", "Thunder Punch", "Trick", "Wonder Room"};
		naturalMoves = new String[]{"Bind", "Fire Punch", "Future Sight", "Gravity", "Ice Punch"};
	}
		Dusclops(){

		super();
		}
}