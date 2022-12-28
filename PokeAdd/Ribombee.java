public class Ribombee extends Pokemon{
	{
		name = "Ribombee";
		bHP = 6;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 10;
		bSpDef = 7;
		bSpd = 12;
		type1 = "Bug";
		type2 = "Fairy";
		abilities = new String[]{"Shield Dust", "Sweet Veil", "Compound Eyes", "Tinted Lens", "Cute Charm"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Cutiefly();
		prevReq = 25;
		height = "0\'/8\"";
		size = "Small";
		weight = 1.1;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Fairy";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		underdog = false;
		other = new String[]{"Aura Reader","Wallclimber"};
		athl = 2;
		acro = 4;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 4;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 10, 13, 16, 21, 28, 35, 42, 49};
		moves = new String[]{"Fairy Wind", "Stun Spore", "Struggle Bug", "Silver Wind", "Draining Kiss", "Sweet Scent", "Bug Buzz", "Dazzling Gleam", "Aromatherapy", "Quiver Dance"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Roost", "Safeguard", "Frustration", "Solar Beam", "Return", "Leech Life", "Psychic", "Double Team", "Reflect", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Acrobatics", "Psych Up", "Infestation", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"After You", "Ally Switch", "Bug Bite", "Bite", "Covet", "Defog", "Helping Hand", "Last Resort", "Magic Room", "Signal Beam", "Skill Swap", "Snore", "Tailwind", "Telekinesis", "Trick", "Wonder Room"};
		naturalMoves = new String[]{};
	}
		Ribombee(){

		super();
		}
}