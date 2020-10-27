public class Zubat extends Pokemon{
	{
		name = "Zubat";
		bHP = 4;
		bAtk = 5;
		bDef = 4;
		bSpAtk = 3;
		bSpDef = 4;
		bSpd = 6;
		type1 = "Poison";
		type2 = "Flying";
		abilities = new String[]{"Inner Focus", "Infiltrator", "Instinct", "Insomnia", "Vanguard"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Golbat", "Crobat"};
		nextReq = new String[]{"30"};
		height = "2\'/7\"";
		size = "Small";
		weight = 16.5;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "";
		habitats = new String[]{"Cave"};
		overland = 2;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		underdog = true;
		other = new String[]{"Blindsense","Tracker"};
		athl = 1;
		acro = 2;
		combat = 2;
		stealth = 3;
		percep = 1;
		focus = 2;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{1, 5, 7, 11, 13, 17, 19, 23, 25, 29, 31, 35, 37, 41, 43};
		moves = new String[]{"Leech Life", "Supersonic", "Astonish", "Bite", "Wing Attack", "Confuse Ray", "Air Cutter", "Swift", "Poison Fang", "Mean Look", "Acrobatics", "Haze", "Venoshock", "Air Slash", "Quick Guard"};
		TMs = new String[]{"Fly", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Shadow Ball", "Double Team", "Sludge", "Sludge Bomb", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Steel Wing", "Acrobatics", "Payback", "Swagger", "Sleep Talk", "Substitute", "Venom Drench"};
		eggMoves = new String[]{"Brave Bird", "Curse", "Feint Attack", "Gust", "Hypnosis", "Nasty Plot", "Pursuit", "Quick Attack", "Whirlwind", "Zen Headbutt", "Headbutt"};
		tutorMoves = new String[]{"Air Cutter", "Giga Drain", "Heat Wave", "Ominous Wind", "Pluck", "Roost", "Sky Attack", "Snatch", "Sleep Talk", "Snore", "Super Fang", "Swift", "Tailwind", "Twister", "Uproar", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Zubat(){

		super();
		}
}