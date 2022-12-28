public class Pidgey extends Pokemon{
	{
		name = "Pidgey";
		bHP = 4;
		bAtk = 5;
		bDef = 4;
		bSpAtk = 4;
		bSpDef = 4;
		bSpd = 6;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Tangled Feet", "Big Pecks", "Blow Away", "Run Away"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Pidgeotto", "Pidgeot"};
		nextReq = new String[]{"30"};
		height = "1\'/0\"";
		size = "Small";
		weight = 4;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "";
		overland = 2;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 2;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53};
		moves = new String[]{"Tackle", "Sand Attack", "Gust", "Quick Attack", "Whirlwind", "Twister", "Feather Dance", "Agility", "Wing Attack", "Roost", "Tailwind", "Mirror Move", "Air Slash", "Hurricane"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Steel Wing", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		eggMoves = new String[]{"Air Cutter", "Brave Bird", "Defog", "Feint Attack", "Foresight", "Pursuit", "Uproar"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Heat Wave", "Ominous Wind", "Pluck", "Sky Attack", "Snore", "Swift", "Tailwind", "Twister", "Uproar"};
		naturalMoves = new String[]{};
	}
		Pidgey(){

		super();
		}
}