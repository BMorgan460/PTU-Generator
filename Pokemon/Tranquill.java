public class Tranquill extends Pokemon{
	{
		name = "Tranquill";
		bHP = 6;
		bAtk = 8;
		bDef = 6;
		bSpAtk = 5;
		bSpDef = 4;
		bSpd = 7;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Big Pecks", "Super Luck", "Rivalry", "Klutz", "Lunchbox"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Pidove();
		prevReq = 15;
		next = new String[]{"Unfezant"};
		nextReq = new String[]{"30"};
		height = "2\'/0\"";
		size = "Small";
		weight = 33.1;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		underdog = true;
		other = new String[]{"Guster"};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{4, 8, 11, 15, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59};
		moves = new String[]{"Growl", "Leer", "Quick Attack", "Air Cutter", "Roost", "Detect", "Taunt", "Air Slash", "Razor Wind", "Feather Dance", "Swagger", "Facade", "Tailwind", "Sky Attack"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Steel Wing", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Defog", "Heat Wave", "Pluck", "Sky Attack", "Snore", "Tailwind", "Uproar"};
		naturalMoves = new String[]{};
	}
		Tranquill(){

		super();
		}
}