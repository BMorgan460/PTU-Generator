public class Unfezant extends Pokemon{
	{
		name = "Unfezant";
		bHP = 8;
		bAtk = 12;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 6;
		bSpd = 9;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Big Pecks", "Super Luck", "Rivalry", "Klutz", "Rocket"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Tranquill();
		prevReq = 30;
		height = "3\'/11\"";
		weight = 63.9;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 5;
		underdog = false;
		other = new String[]{"Guster"};
		athl = 4;
		acro = 4;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{4, 8, 11, 15, 18, 23, 27, 33, 38, 44, 49, 55, 60, 66};
		moves = new String[]{"Growl", "Leer", "Quick Attack", "Air Cutter", "Roost", "Detect", "Taunt", "Air Slash", "Razor Wind", "Feather Dance", "Swagger", "Facade", "Tailwind", "Sky Attack"};
		TMs = new String[]{"Fly", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Steel Wing", "Giga Impact", "Psych Up", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Heat Wave", "Pluck", "Roost", "Sky Attack", "Sleep Talk", "Snore", "Tailwind", "Uproar", "Work Up"};
		naturalMoves = new String[]{};
	}
		Unfezant(){

		super();
		}
}