public class Staravia extends Pokemon{
	{
		name = "Staravia";
		bHP = 6;
		bAtk = 8;
		bDef = 5;
		bSpAtk = 4;
		bSpDef = 4;
		bSpd = 8;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Intimidate", "Big Pecks", "Rivalry", "Reckless"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Starly();
		prevReq = 15;
		next = new String[]{"Staraptor"};
		nextReq = new String[]{"30"};
		height = "2\'/0\"";
		size = "Small";
		weight = 34.2;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
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
		acroBonus = 1;
		combatBonus = 1;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 18, 23, 28, 33, 38, 43, 48};
		moves = new String[]{"Quick Attack", "Wing Attack", "Double Team", "Endeavor", "Whirlwind", "Aerial Ace", "Take Down", "Agility", "Brave Bird", "Final Gambit"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Endeavor", "Heat Wave", "Ominous Wind", "Pluck", "Snore", "Swift", "Tailwind", "Twister", "Uproar"};
		naturalMoves = new String[]{};
	}
		Staravia(){

		super();
		}
}