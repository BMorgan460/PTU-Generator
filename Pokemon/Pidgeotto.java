public class Pidgeotto extends Pokemon{
	{
		name = "Pidgeotto";
		bHP = 6;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 7;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Tangled Feet", "Big Pecks", "Blow Away", "Competitive"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Pidgey();
		prevReq = 15;
		next = new String[]{"Pidgeot"};
		nextReq = new String[]{"30"};
		height = "3\'/7\"";
		weight = 66.1;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		habitats = new String[]{"Forest"};
		overland = 3;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 22, 27, 32, 37, 42, 47, 52, 57, 62};
		moves = new String[]{"Sand Attack", "Gust", "Quick Attack", "Whirlwind", "Twister", "Feather Dance", "Agility", "Wing Attack", "Roost", "Tailwind", "Mirror Move", "Air Slash", "Hurricane"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Steel Wing", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Heat Wave", "Ominous Wind", "Pluck", "Sky Attack", "Snore", "Swift", "Tailwind", "Twister", "Uproar"};
		naturalMoves = new String[]{};
	}
		Pidgeotto(){

		super();
		}
}